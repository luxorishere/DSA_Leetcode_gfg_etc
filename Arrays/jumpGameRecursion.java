        public static boolean jumpGameRecursion(int[] arr, int pointer, boolean check, int goal){
            if (pointer < 0){
                return check;
            }


            if (pointer + arr[pointer] >= goal){
                return jumpGameRecursion(arr, pointer - 1, true, pointer);
            }
            else {
                return jumpGameRecursion(arr, pointer - 1, false, goal);
            }

        }
