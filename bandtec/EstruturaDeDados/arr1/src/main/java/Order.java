public class Order {
    public static void main(String[] args) {
        int[] arr = { 13, 5, 7, 44, 8, 23, 9, 0, 1, 14, 3, 6};
        selectionSort(arr);
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
            System.out.println(arr[i]);
        }
    }
}
