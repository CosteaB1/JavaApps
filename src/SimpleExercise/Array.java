package SimpleExercise;

import java.util.Arrays;

public class Array extends Exercises {


    public static void main(String[] args) {
        String[] myArrString = {"bcd", "abd", "jude", "bcd", "oiu", "gzw", "oiu"};
        String[] array1 = {"Python", "JAVA", "PHP", "C#", "C++", "SQL"};
        int[] array11 = {1, 2, 5, 5, 8, 9, 7, 10};
        int[] array22 = {1, 0, 6, 15, 6, 4, 7, 0};
        String[] array2 = {"MySQL", "SQL", "SQLite", "Oracle", "PostgreSQL", "DB2", "JAVA"};
        int[] myArr = {5, 5, 2, 6, 7, 4, 2, 8, 9, 9};
//        System.out.println("Original String : " + Arrays.toString(myArr));
//        maxMinArray(myArr);
//        reverse(myArr);
//        findDuplicates(myArr);
//        findDuplicatesString(myArrString);
//        commonElements(array1,array2);
//        commonElementsIntegers(array11,array22);
//        removeDuplicates(myArr);
        secondLargestElement(myArr);
        secondSmallestElement(myArr);
    }

}

