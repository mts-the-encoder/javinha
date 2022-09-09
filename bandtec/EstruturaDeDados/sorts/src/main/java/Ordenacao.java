public class Ordenacao {
    public static void main(String[] args) {
        int[] arr = { 13, 5, 7, 44, 8, 23, 9, 0, 1
                , 14, 3, 6};
        selectionSort(arr);
        bubbleSort(arr);
    }

    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int x = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    x = arr[i];
                    arr[i] = arr[j];
                    arr[j] = x;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Selection Sort: " + arr[i]);
        }
    }


    static void bubbleSort(int[] arr) {
        int n = arr.length;
        int temp = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (arr[j - 1] > arr[j]) {
                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("\n");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Bubble Sort: " + arr[i]);
        }
    }
}



