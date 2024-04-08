package Lemon01_DuplicatesFinder4;

import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.*;
import java.io.*;
import java.security.*;

public class DuplicatesFinder4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть шлях до папки:");
        String folderPath = scanner.nextLine();

        //Таймер для порівняння ефективності компараторів
        long time = System.currentTimeMillis();
        DuplicatesFinder4 copiesFinder = new DuplicatesFinder4();
        copiesFinder.findCopies(folderPath);

        //Час виконання для порівняння ефективності компараторів
        System.out.println("Витрачений час: " + (System.currentTimeMillis() - time) + " мс.");
    }

    public void findCopies(String dirPath) {
        try {
            Map<String, List<File>> filesMap = new HashMap<>();

            //Визначення хеш-коду і розподілення копій до відповідних груп
            Files.walkFileTree(Paths.get(dirPath), new SimpleFileVisitor<>() {
                @Override
                public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) {
                    if (!attrs.isDirectory() && Files.isReadable(file)) {
                        try {
                            String key = getKey(file);
                            List<File> fileList = filesMap.getOrDefault(key, new ArrayList<>());
                            fileList.add(file.toFile());
                            filesMap.put(key, fileList);
                        } catch (IOException | NoSuchAlgorithmException e) {
                            System.out.println("Помилка роботи з файлом " + file);
                        }
                    }
                    return FileVisitResult.CONTINUE;
                }

                @Override
                public FileVisitResult visitFileFailed(Path file, IOException exc) {
                    // Обробка помилок доступу до файлів
                    System.out.println("Помилка доступу до " + file);
                    return FileVisitResult.CONTINUE;
                }
            });

            System.out.println("\nГрупи копій файлів:");
            System.out.println("_________________");
            for (List<File> fileList : filesMap.values()) {
                if (fileList.size() > 1) {
                    for (File file : fileList) {
                        System.out.println(file.getAbsolutePath());
                    }
                    System.out.println("________________");
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    //обрахунок хеш-ключа
    private String getKey (Path file) throws IOException, NoSuchAlgorithmException {
        MessageDigest digest = MessageDigest.getInstance("SHA-256");
        try (InputStream is = Files.newInputStream(file)) {
            byte[] buffer = new byte[1024];
            int readBuffer;
            while ((readBuffer = is.read(buffer)) > 0) {
                digest.update(buffer, 0, readBuffer);
            }
        }
        byte[] keyBytes = digest.digest();
        StringBuilder key = new StringBuilder();
        for (byte b : keyBytes) {
            key.append(b);
        }
        return key.toString();
    }
}
