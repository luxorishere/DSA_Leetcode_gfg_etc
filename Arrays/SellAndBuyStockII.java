class Solution {
    public int maxProfit(int[] arr) {
        if (arr.length == 1){
                return 0;
            }
            int min = arr[0];
            int max = arr[0];
            int totalAmount = 0;

            for (int i = 1; i < arr.length; i++) {
                if (arr[i] < max){
                    totalAmount += (max - min);
                    min = arr[i];
                    max = arr[i];
                }
                else if (arr[i] >= max){
                    max = arr[i];
                }

                if (i == arr.length - 1){
                    totalAmount += (max - min);

                }

            }
            return totalAmount;

    }
}
