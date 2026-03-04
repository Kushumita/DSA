public class SelectionSort {
    public static void selectionSort(int n[]) {
        for (int i = 0; i < n.length - 1; i++) {
            int minpos = i;
            for (int j = i + 1; j < n.length; j++) {
                if (n[minpos] > n[j]) {
                    minpos = j;
                }
            }
            // Swap
            int temp = n[minpos];
            n[minpos] = n[i];
            n[i] = temp;
        }
    }

    public static void print(int n[]) {
        for (int i = 0; i < n.length; i++) {
            System.out.print(n[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] n = {65, 64, 61, 63, 62};
        selectionSort(n);
        print(n);
    }
}
