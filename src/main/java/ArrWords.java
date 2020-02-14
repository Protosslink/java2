/**
 * @author Barabanov Dmitriy
 * Используется в классе ChoiseProgramm
 * @see #addNumWords
 * @see #maxWordsArr
 */

import java.util.Scanner;

public class ArrWords {

    /*Пользователь задает через консоль размер массива*/
    public int addNumWords() {
        Scanner scannerNumWords = new Scanner(System.in);
        System.out.print("Введите число слов в массиве: ");
        int numWords = scannerNumWords.nextInt();
        System.out.println("Количество элементов в массиве равно " + numWords);
        return numWords;
    }

    /*Пользователь вводит последовательно слова в массив
     * Вывод элемента массива максимальной длинны*/
    public void maxWordsArr() {
        int longArr = addNumWords();
        String[] arrWordsString = new String[longArr];
        Scanner scannerAddWords = new Scanner(System.in);
        /*Ввод через консоль пользователем слов в массив*/
        for (int i = 0; i < longArr; i++) {
            System.out.print("Введите слово: ");
            String newWord = scannerAddWords.nextLine();
            arrWordsString[i] = newWord;
        }
        int maxWord = 0;
        /*Проверяем длиину каждого элемента массива*/
        for (int i = 0; i < arrWordsString.length - 1; i++) {
            /*Если длинна элемента массива больше значения переменной maxWord,
            то maxWord равно длинне элемента массива*/
            if (arrWordsString[i].length() > maxWord) {
                maxWord = arrWordsString[i].length();
            }
        }
        System.out.println(arrWordsString[maxWord]);
    }
}

