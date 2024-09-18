public static int maxSumSubArray(int[] arr){
        int sum = Integer.MIN_VALUE;
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            temp += arr[i];
            sum = Math.max(sum, temp);
            if (temp < 0){
                temp = 0;
            }
        }
        return sum;
    }
