package Lemon03_DuplicatesFinder3;
//Напиши програмку, яка знаходить і виводить однакові файли (по вмісту, байт а байт) по заданій папці
//Глибина папки не відома
//Якщо задаш цілий диск - знайде дублікати на цілому компі
//І вивід по групам, бо груп дублікатів може бути багато

//перевіряй не по рядках а по байтах ;

// подумай як можна пришвидшити перевірку унікальності ;
// зверни увагу на читабельність коду - має бути простим для розуміння та чистим.

//закинь туди два фільми, спочатку різні і потім однакові, в різні підпапки

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DuplicatesFinder3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть шлях до папки:");
        String folderPath = scanner.nextLine();

        DuplicatesFinder3 copiesFinder = new DuplicatesFinder3();
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
                                    if (MyFileComparator3.compareFiles(listOfAllFiles.get(i).getPath(), listOfAllFiles.get(j + 1).getPath())) {
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

        //Вивід результату
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

class MyFileComparator3 {
    private static final int SIZE_OF_BUFFER = 1024;

    public static boolean compareFiles(String path1, String path2) throws IOException {
        try (FileInputStream str1 = new FileInputStream(path1);
             FileInputStream str2 = new FileInputStream(path2)) {
            byte[] buffer1 = new byte[SIZE_OF_BUFFER];
            byte[] buffer2 = new byte[SIZE_OF_BUFFER];
            int readBytes1;
            int readBytes2;

            do {
                readBytes1 = str1.read(buffer1);
                readBytes2 = str2.read(buffer2);

                if (readBytes1 != readBytes2 || !isBytesArraysEqual(buffer1, buffer2, readBytes1)) {
                    return false;
                }
            } while (readBytes1 != -1);
            return true;
        }
    }

    private static boolean isBytesArraysEqual(byte[] arr1, byte[] arr2, int size) {
        for (int i = 0; i < size; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }
}