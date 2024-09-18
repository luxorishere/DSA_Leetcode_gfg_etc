public static int numSum(int num){
        if (num == 0){
            return 0;
        }
        return num % 10 + numSum(num / 10);
    }
