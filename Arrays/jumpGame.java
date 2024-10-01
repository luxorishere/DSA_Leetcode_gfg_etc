 public static boolean jumpGame(int[] arr){
            int goal = arr.length - 1;

            int pointer = arr.length - 2;
            boolean check = false;
            while (pointer >= 0){
                if (arr[pointer] == 0){
                    pointer--;
                    check = false;
                    continue;
                }
                if (pointer + arr[pointer] >= goal){
                    goal = pointer;
                    pointer--;
                    check = true;

                }
                else{
                    check = false;
                    pointer--;
                }
            }
            return check;
        }
