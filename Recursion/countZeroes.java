public static int countZeroes(int num, int count){
        if (num % 10 == num){
            if (num == 0){
                return count + 1;
            }
            else{
                return count;
            }
        }
        if (num % 10 == 0){
            count++;
        }
        return countZeroes(num / 10, count);

    }
