package Lemon02_DuplicatesFinder2;
//Напиши програмку, яка знаходить і виводить однакові файли (по вмісту, байт а байт) по заданій папці
//Глибина папки не відома
//Якщо задаш цілий диск - знайде дублікати на цілому компі
//І вивід по групам, бо груп дублікатів може бути багато

//перевіряй не по рядках а по байтах ;

// подумай як можна пришвидшити перевірку унікальності ;
// зверни увагу на читабельність коду - має бути простим для розуміння та чистим.

//закинь туди два фільми, спочатку різні і потім однакові, в різні підпапки

//Про розмір подумай та про мапу


import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class DuplicatesFinder2 {
    public static void main(String[] args) {
        //таймер для порівняння ефективності компараторів
        long time = System.currentTimeMillis();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть шлях до папки:");
        String folderPath = scanner.nextLine();

        DuplicatesFinder2 copiesFinder = new DuplicatesFinder2();
        copiesFinder.findCopies(folderPath);

        //час виконання для порівняння ефективності компараторів
        System.out.println("Витрачений час: " + (System.currentTimeMillis() - time) + " мс.");

    }

    public void findCopies(String dirPath) {

        List<List<String>> groupList = new ArrayList<>();

        try {
            Map<Long, List<File>> filesMap = new HashMap<>();

            Files.walk(Paths.get(dirPath))
                    .filter(path -> !path.startsWith(Paths.get("D:\\$RECYCLE.BIN\\S-1-5-18")))
                    .filter(Files::isReadable)
                    .filter(Files::isRegularFile)
                    .forEach(file -> {
                        try {
                            // Отримання довжини файла та сортуування у відповідний список за довжиною
                            Long fileLength = Files.size(file);
                            List<File> fileList = filesMap.getOrDefault(fileLength, new ArrayList<>());
                            fileList.add(file.toFile());
                            filesMap.put(fileLength, fileList);
                        } catch (IOException e) {
                            throw new RuntimeException(e);
                        }
                    });

            //порівняння файлів в кожній групі
            for (List<File> sizeGroup : filesMap.values()) {
                if (sizeGroup.size() > 1) {

                    for (int i = 0; i < sizeGroup.size() - 1; i++) {

                        try {
                            if (groupList.size() == 0 || isNotInList(sizeGroup.get(i).getPath(), groupList)) {
                                List<String> group = new ArrayList<>();
                                group.add(sizeGroup.get(i).getPath());

                                for (int j = i; j < sizeGroup.size() - 1; j++) {
                                    if (MyFileComparator2.compareFiles(sizeGroup.get(i).getPath(), sizeGroup.get(j + 1).getPath())) {
                                        group.add(sizeGroup.get(j + 1).getPath());
                                    }
                                }
                                groupList.add(group);
                            }

                        } catch (IOException e) {
                            throw new RuntimeException(e);
                        }

                    }

                    //перевірка останнього елементу списку
                    if (isNotInList(sizeGroup.get(sizeGroup.size() - 1).getPath(), groupList)) {
                        List<String> group = new ArrayList<>();
                        group.add(sizeGroup.get(sizeGroup.size() - 1).getPath());
                        groupList.add(group);
                    }

                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
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

    public boolean isNotInList(String path, List<List<String>> list) {
        for (List<String> group : list) {
            if (group.contains(path)) {
                return false;
            }
        }
        return true;
    }
}


class MyFileComparator2 {
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

//для порівняння компараторів
class MyFileComparator3 {
    public static boolean compareFiles(String filePath1, String filePath2) throws IOException {
        try (FileInputStream str1 = new FileInputStream(filePath1);
             FileInputStream str2 = new FileInputStream(filePath2)) {
            int byte1;
            int byte2;
            byte1 = str1.read();
            byte2 = str2.read();
            while (byte1 != -1 && byte2 != -1) {
                if (byte1 != byte2) {
                    return false;
                }
                byte1 = str1.read();
                byte2 = str2.read();
            }

            return byte1 == -1 && byte2 == -1;
        }
    }
}