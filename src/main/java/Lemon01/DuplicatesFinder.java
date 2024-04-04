package Lemon01;
//Напиши програмку, яка знаходить і виводить однакові файли (по вмісту, байт а байт) по заданій папці
//Глибина папки не відома
//Якщо задаш цілий диск - знайде дублікати на цілому компі
//І вивід по групам, бо груп дублікатів може бути багато


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DuplicatesFinder {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть шлях до папки:");

        String folderPath = scanner.nextLine();
        DuplicatesFinder copiesFinder = new DuplicatesFinder();
        copiesFinder.findCopies(folderPath);

    }
    public void findCopies(String path) {
        File folder = new File(path);

        List<File> listOfAllFiles = filesToList(folder);

        List<List<String>> groupList = new ArrayList<>();

        if (listOfAllFiles != null && listOfAllFiles.size() > 1) {
            for (int i = 0; i < listOfAllFiles.size() - 1; i++) {
                if (listOfAllFiles.get(i).isFile() && listOfAllFiles.get(i + 1).isFile()) {
                    try {
                        if (groupList.size() == 0 || isNotInList(listOfAllFiles.get(i).getPath(), groupList)) {
                            List<String> group = new ArrayList<>();
                            group.add(listOfAllFiles.get(i).getPath());

                            for (int j = i; j < listOfAllFiles.size() - 1; j++) {
                                if (listOfAllFiles.get(i).isFile() && listOfAllFiles.get(j + 1).isFile()) {
                                    if (MyFileComparator.compareFiles(listOfAllFiles.get(i).getPath(), listOfAllFiles.get(j + 1).getPath())) {
                                        group.add(listOfAllFiles.get(j + 1).getPath());
                                    }
                                }
                            }
                            groupList.add(group);
                        }

                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                }
            }

            //перевірка останнього елементу списку
            if (isNotInList(listOfAllFiles.get(listOfAllFiles.size() - 1).getPath(), groupList)) {
                List<String> group = new ArrayList<>();
                group.add(listOfAllFiles.get(listOfAllFiles.size() - 1).getPath());
                groupList.add(group);
            }

        } else {
            System.out.println("Папки не існує, або в папці недостатня кількість файлів для порівняння.");
            return;
        }

        System.out.println("Унікальні файли:");
        for (List<String> group : groupList) {
            if (group.size() == 1) {
                for (String filepath : group) {
                    System.out.print(filepath + "\n");
                }
            }
        }

        System.out.println("\nГрупи копій файлів:");
        System.out.println("_________________");

        for (List<String> group : groupList) {
            if (group.size() > 1) {
                for (String filepath : group) {
                    System.out.println(filepath);
                }
                System.out.println("\n_________________");
            }

        }
    }

    public List<File> filesToList(File folder) {
        List<File> fileList = new ArrayList<>();
        if (folder.isDirectory()) {
            File[] files = folder.listFiles();
            if (files != null) {
                for (File file : files) {
                    if (file.isDirectory()) {
                        fileList.addAll(filesToList(file));
                    } else {
                        fileList.add(file);
                    }
                }
            }
        }
        return fileList;
    }


    public boolean isNotInList(String path, List<List<String>> list) {
        for (List<String> group : list) {
            if (group.contains(path)) {
                return false;
            }
        }
        return true;
    }
}


class MyFileComparator {
    public static boolean compareFiles(String path1, String path2) throws IOException {
        try (BufferedReader reader1 = new BufferedReader(new FileReader(path1));
             BufferedReader reader2 = new BufferedReader(new FileReader(path2))) {
            String line1;
            String line2;
            line1 = reader1.readLine();
            line2 = reader2.readLine();

            //перевірка чи не є один з файлів пустим
            if ((line1 == null && line2 != null) || (line1 != null && line2 == null)) {
                return false;
            }

            while (line1 != null && line2 != null) {
                if (!line1.equals(line2)) {
                    return false;
                }
                line1 = reader1.readLine();
                line2 = reader2.readLine();
            }
            return line1 == null && line2 == null;
        }
    }
}