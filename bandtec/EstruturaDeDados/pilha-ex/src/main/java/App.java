public class App {

    public static void main(String[] args) {

        int[] arr1 = {1, 3, 3, 1};
        int[] arr2 = {10, 20, 30, 40};
        int[] arr3 = {10, 20, 30, 30, 20, 10};
        int[] arr4 = {1, 2, 3, 2, 1};

        System.out.println(isPalindromo(arr1));
        System.out.println(isPalindromo(arr2));
        System.out.println(isPalindromo(arr3));
        System.out.println(isPalindromo(arr4));
    }

    public static String isPalindromo(int[] arr) {

        Pilha pilha = new Pilha(arr.length);
        for (int i = 0; i < arr.length; i++) {
            pilha.push(arr[i]);
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != pilha.pop()) {
                return "Não é palíndromo";
            }
        }
        return "É palíndromo";
    }
}
