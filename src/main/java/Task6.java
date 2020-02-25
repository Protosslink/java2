import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * @author Barabanov Dmitriy
 */

public class Task6 {

    //Чтение файла
    public static Scanner readFile() throws FileNotFoundException {
        File file = new File("Text1");
        Scanner scanFile = new Scanner(file);
        return scanFile;
    }

    //Исполнение
    public void readWordsInTxt() {
        try {
            Scanner scanFile = readFile();
            showWords(scanFile);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("Файл не найден!");
        }
    }

    //Вывод на экран слов из файла
    public void showWords(Scanner scan) {
        while (scan.hasNextLine()) {
            System.out.println(scan.nextLine());
        }
    }
}





