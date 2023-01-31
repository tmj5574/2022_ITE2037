public class Sort {
        public static void main(String[] args) {
            int[] arr = {7, 4, 5, 1, 3};

            printArr(arr);
            bubbleSort(arr, arr.length);
            printArr(arr);
        }

        public static void bubbleSort(int arr[], int n) {
            // To do
            int temp = 0;

            for (int i = 1; i < n; i++) {
                for (int j = 0; j < n - i ; j++) {
                    if (arr[j] > arr[j + 1]) {
                        temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                    }
                }
            }
        }

        public static void printArr(int arr[]) {
            // To do
            for(int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }System.out.println();
        }
    }


