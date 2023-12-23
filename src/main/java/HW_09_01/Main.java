package HW_09_01;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        //Читання списку прийменників
        File checkWords = new File("src/main/java/HW_09_01/prepositions.txt");
        String checkString = readToString(checkWords);

        //Перетворення списку в масив для наступного порівняння
        String[] checkWordsArray = checkString.split("\\r\\n");

        //Читання вихідного тексту та збереження його в рядку
        File sourceText = new File("src/main/java/HW_09_01/source.txt");
        String text = readToString(sourceText);

        //Заміна прийменників та запис в файл змінеого тексту
        for (String str : checkWordsArray) {
            Pattern pattern = Pattern.compile("\\b" + str + "\\b");
            Matcher matcher = pattern.matcher(text);
            text = matcher.replaceAll("JAVA");
        }

        //Запис результату заміни в файл
        File decryptedFile = new File("src/main/java/HW_09_01/result.txt");
        try {
            FileWriter writeFile = new FileWriter(decryptedFile);
            writeFile.write(text);
            writeFile.flush();
            System.out.println("Done! Check the result file.");
        } catch (IOException exception) {
            System.out.println(exception.getMessage());
        }
    }

    //метод читання з файлів в рядок
    public static String readToString(File file) {
        String resultString = "";
        try {
            FileReader readFile = new FileReader(file);
            int i;
            while ((i = readFile.read()) != -1) {
                resultString = resultString + (char) i;
            }
        } catch (IOException exception) {
            System.out.println(exception.getMessage());
        }
        return resultString;
    }
}