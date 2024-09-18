public static int numProduct(int num){
        if (num == 0){
            return 1;
        }
        return num % 10 * numProduct(num / 10);
    }
