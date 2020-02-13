import java.util.Scanner;

public class ArrWords {

    public int addNumWords() {
        Scanner scannerNumWords = new Scanner(System.in);
        System.out.print("Введите число слов в массиве: ");
        int numWords = scannerNumWords.nextInt();
        System.out.println("Количество элементов в массиве равно " + numWords);
        return numWords;
    }

    public void maxWordsArr() {
        int longArr = addNumWords();
        String[] arrWordsString = new String[longArr];
        Scanner scannerAddWords = new Scanner(System.in);
        for (int i = 0; i < longArr; i++) {
            System.out.print("Введите слово: ");
            String newWord = scannerAddWords.nextLine();
            arrWordsString[i] = newWord;
        }
        String longWord = "";
        int len = 0;
        for(String num: arrWordsString){
            if(String.le)
        }
    }

}
