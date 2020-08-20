package SimpleExercise;

import java.util.Arrays;
import java.util.Random;

public class Array {


    public static void main(String[] args) {
        int[] intArr = {5, 3, 2, 5, 7, 4, 3, 2};
        int[] newArr = new int[intArr.length];
//        System.out.println("Index position of 3 is: " + findIndex(intArr, 3));
//        removeElement(intArr, 3);
        copyArray(intArr, newArr);
    }

    //9. Write a Java program to insert an element (specific position) into an array. Go to the editor

    public static void insertSpecificPosition(int[] intArr, int position) {
        
    }

    //8. Write a Java program to copy an array by iterating the array. Go to the editor

    public static void copyArray(int[] intArr, int[] newArr) {
        System.out.println("My array: " + Arrays.toString(intArr));
        for (int i = 0; i < intArr.length; i++) {
            newArr[i] = intArr[i];
        }
        System.out.println("New Array (copy) : " + Arrays.toString(newArr));
    }

    //7. Write a Java program to remove a specific element from an array. Go to the editor

    public static void removeElement(int[] intArr, int removeIndex) {
        System.out.println("Original Array of int: ");
        for (int i = 0; i < intArr.length; i++) {
            System.out.print(intArr[i] + " ");
        }

        System.out.println("\nIndex of element to be removed: " + removeIndex);

        if (intArr == null) {
            System.out.println("The list is empty!!");
        }

        int[] newArray = new int[intArr.length - 1];
        for (int i = 0, k = 0; i < intArr.length; i++) {
            if (i == removeIndex) {
                continue;
            } else {
                newArray[k++] = intArr[i];
            }
        }
        System.out.println("Array after removing index of element: " + Arrays.toString(newArray));


    }

    //    6. Write a Java program to find the index of an array element
    public static int findIndex(int[] intArr, int t) {
        if (intArr == null) {
            return -1;
        }
        int len = intArr.length;
        int i = 0;
        while (i < len) {
            if (intArr[i] == t) {
                return i;
            } else i++;
        }
        return -1;
    }


    //  5. Write a Java program to test if an array contains a specific value.
    public static boolean contains(int[] intArr, int item) {
        for (int n : intArr) {
            if (item == n) {
                return true;
            }
        }
        return false;
    }

//        //4. Write a Java program to calculate the average value of array elements.
//        int[] intArr = {5,4,3,5};
//        int sum = 0;
//        int elements = 0;
//        double average;
//
//        for (int i =0 ; i < intArr.length ; i++) {
//            int temp = intArr[i];
//            sum+=temp;
//            elements++;
//        }
//        average = sum / elements;
//        System.out.println(average);


////Write a Java program to sum values of an array
//        int[] intArr = {5,2,3,4,6};
//        int sum =0 ;
//
//        for (int i =0 ; i < intArr.length; i++) {
//            int temp = intArr[i];
//            sum +=temp;
//        }
//        System.out.println(sum);


//        //Sort String Array
//        String[] myArray = {"JavaFX", "HBase", "OpenCV", "Java", "Hadoop", "Neo4j"};
//        int size = myArray.length;
//
//        for(int i = 0; i<size-1; i++) {
//            for (int j = i+1; j<myArray.length; j++) {
//                if(myArray[i].compareTo(myArray[j])>0) {
//                    String temp = myArray[i];
//                    myArray[i] = myArray[j];
//                    myArray[j] = temp;
//                }
//            }
//        }
//        System.out.println(Arrays.toString(myArray));
//        //using Sort method of the Arrays class
//        Arrays.sort(myArray);
//        System.out.println(Arrays.toString(myArray));
//
//        //Sort Numberic Array (Bubble sort)
//        int[] myInt = {6,5,3,2,5,7,1,2,4,53,2};
//
//        for (int i =0 ; i < myInt.length-1 ; i++) {
//            for (int j=0; j< myInt.length-i-1; j++) {
//                if(myInt[j] > myInt[j+1]) {
//                    int temp = myInt[j];
//                    myInt[j] = myInt[j+1];
//                    myInt[j+1] = temp;
//                }
//            }
//        }
//        for(int i =0 ; i < myInt.length ; i++) {
//            System.out.print(" " + myInt[i]);
//        }
}

