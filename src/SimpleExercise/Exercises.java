package SimpleExercise;

import java.util.Arrays;
import java.util.HashSet;

public class Exercises {
    //19. Write a Java program to add two matrices of the same size. Go to the editor
    public static void addTwoMatrice () {

    }
    //18. Write a Java program to find the second smallest element in an array. Go to the editor
    public static void secondSmallestElement (int[] arr) {
        Arrays.sort(arr);
        int i =0;
        while (arr[0] == arr[i]) {
            i++;
        }
        System.out.println("Second Smallest element: " + arr[i]);
    }
    //17. Write a Java program to find the second largest element in an array. Go to the editor
    public static void secondLargestElement(int[] arr) {
        int n = arr.length-1;
        Arrays.sort(arr);
        while (arr[n] == arr[arr.length-1]) {
            n--;
        }
        System.out.println("Second largest value: " + arr[n]);
    }

    //16. Write a Java program to remove duplicate elements from an array. Go to the editor
    public static void removeDuplicates(int[] arr) {
    }
    //15. Write a Java program to find the common elements between two arrays of integers. Go to the editor

    public static void commonElementsIntegers(int[] first, int[] second) {
        HashSet<Integer> set = new HashSet<Integer>();
        for (int i = 0; i < first.length; i++) {
            for (int j = 0; j < second.length; j++) {
                if (first[i] == second[j]) {
                    set.add(first[i]);
                }
            }
        }
        System.out.println("Common elements are: " + (set));
    }

    //14. Write a Java program to find the common elements between two arrays (string values). Go to the editor
    public static void commonElements(String[] first, String[] secondArr) {
        HashSet<String> set = new HashSet<String>();

        for (int i = 0; i < first.length; i++) {
            for (int j = 0; j < secondArr.length; j++) {
                if (first[i].equals(secondArr[j])) {
                    set.add(first[i]);
                }
            }
        }
        System.out.println("Common elements: " + (set));
    }

    //13. Write a Java program to find the duplicate values of an array of string values. Go to the editor
    public static void findDuplicatesString(String[] myArrString) {
        int n = myArrString.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if ((myArrString[i].equals(myArrString[j])) && (i != j)) {
                    System.out.println("Duplicates values of a string: " + myArrString[i]);
                }
            }
        }
    }

    //12. Write a Java program to find the duplicate values of an array of integer values. Go to the editor
    public static void findDuplicates(int[] myArr) {
        int n = myArr.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if ((myArr[i] == myArr[j]) && (i != j)) {
                    System.out.println("We have dublicates for: " + myArr[i]);
                }
            }
        }
    }

    //11. Write a Java program to reverse an array of integer values. Go to the editor
    public static void reverse(int[] myArr) {
        System.out.println("Original String : " + Arrays.toString(myArr));
        int n = myArr.length;
        for (int i = 0; i < n / 2; i++) {
            int temp = myArr[i];
            myArr[i] = myArr[n - i - 1];
            myArr[n - i - 1] = temp;
        }
        System.out.println("Reversed String : " + Arrays.toString(myArr));
    }

    //10. Write a Java program to find the maximum and minimum value of an array. Go to the editor
    public static void maxMinArray(int[] myArr) {
        int n = myArr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (myArr[j] > myArr[j + 1]) {
                    int temp = myArr[j];
                    myArr[j] = myArr[j + 1];
                    myArr[j + 1] = temp;
                }
            }
        }
        System.out.println("Min element is: " + myArr[0] + "\nMax element is: " + myArr[n - 1]);
    }

    //11.run length encoding

    public static void prinRLE(String str) {
        int n = str.length();
        for (int i = 0; i < n; i++) {
            int count = 1;
            while (i < n - 1 && str.charAt(i) == str.charAt(i + 1)) {
                count++;
                i++;
            }
            System.out.print(str.charAt(i));
            System.out.print(count);
        }
    }


    //10. Take the dublicates from an array:
    static int removeDuplicates(int arr[], int n) {
        // Return, if array is empty
        // or contains a single element
        if (n == 0 || n == 1) {
            return n;
        }
        int[] temp = new int[n];
        // Start traversing elements
        int j = 0;
        for (int i = 0; i < n - 1; i++)
            // If current element is not equal
            // to next element then store that
            // current element

            if (arr[i] != arr[i + 1])
                temp[j++] = arr[i];

        // Store the last element as whether
        // it is unique or repeated, it hasn't
        // stored previously
        temp[j++] = arr[n - 1];

        // Modify original array
        for (int i = 0; i < j; i++)
            arr[i] = temp[i];

        return j;


    }

    //9. Find Factorial of a number with recursion
    static int factorial(int n) {
        if (n != 0) {
            return n * factorial(n - 1);
        } else return 1;
    }

    public static void insertSpecificPosition(int[] intArr, int index, int value) {
        System.out.println("My array: " + Arrays.toString(intArr));
        int[] newArray = new int[intArr.length];
        for (int i = 0, k = 0; i < intArr.length; i++, k++) {
            if (k == index) {
                newArray[k] = value;
                continue;
            } else {
                newArray[k] = intArr[i];
            }
        }
        System.out.println("Array after removing index of element: " + Arrays.toString(newArray));
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
//
//
////Write a Java program to sum values of an array
//        int[] intArr = {5,2,3,4,6};
//        int sum =0 ;
//
//        for (int i =0 ; i < intArr.length; i++) {
//            int temp = intArr[i];
//            sum +=temp;
//        }
//        System.out.println(sum);
//
//
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
