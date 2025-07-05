package Assigment_Test_07_5_2025;

public class Generic_Swap_Array_Program {



        public static <T> void swap(T[] array, int index1, int index2) {
            if (array == null || index1 < 0 || index2 < 0 ||
                    index1 >= array.length || index2 >= array.length) {
                System.out.println("Invalid indices or array is null.");
                return;
            }

            T temp = array[index1];
            array[index1] = array[index2];
            array[index2] = temp;
        }

        // Method to print an array
        public static <T> void printArray(T[] array) {
            for (T element : array) {
                System.out.print(element + " ");
            }
            System.out.println();
        }


        public static void main(String[] args) {
            // Integer array
            Integer[] intArray = {1, 2, 3, 4, 5};
            System.out.println("Before swap:");
            printArray(intArray);

            swap(intArray, 1, 3);

            System.out.println("After swap:");
            printArray(intArray);

            // String array
            String[] strArray = {"A", "B", "C", "D"};
            System.out.println("\nBefore swap:");
            printArray(strArray);

            swap(strArray, 0, 2);

            System.out.println("After swap:");
            printArray(strArray);
        }
    }


