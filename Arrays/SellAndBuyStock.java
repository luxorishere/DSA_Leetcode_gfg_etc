class Solution {
    public int maxProfit(int[] arr) {
        if (arr.length == 1){
            return 0;
        }
        int min = arr[0];
            int max = arr[0];
            int amount = 0;
            int finalAmount = Integer.MIN_VALUE;
            for (int i = 1; i < arr.length; i++) {
                if (arr[i] < min){
                    max = arr[i];
                    min = arr[i];
                }
                if (arr[i] > min){
                    if (arr[i] > max){
                        max = arr[i];
                        amount = max - min;
                    }
                    else{
                        continue;
                    }
                }
                finalAmount = Math.max(amount, finalAmount);

            }
            return finalAmount;
    }
}
