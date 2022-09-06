public class Order {
    public static void main(String[] args) {
        int[] arr = { 2, 5, 5, 44, 8, 3, 9, 0, 1, 2, 93, 6};
        selectionSort(arr);
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static int[] selectionSort(int[] arr) {
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
        return arr;
    }
}
