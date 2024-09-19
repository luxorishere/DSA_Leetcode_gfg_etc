 public static void cyclicSort(int[] arr){
        for (int i = 0; i < arr.length; i++) {

            while (arr[arr[i] - 1] != arr[i]){
                int correctIndex = arr[i] - 1;
                int temp = arr[correctIndex];
                arr[correctIndex] = arr[i];
                arr[i] = temp;
            }

        }
 }
