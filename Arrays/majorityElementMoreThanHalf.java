public static int majorityElementI(int[] arr){
            int element = 0;

            int count = 0;

            for (int j : arr) {

                if (count == 0) {
                    element = j;
                    count++;
                } else if (j != element) {
                    count--;
                } else {
                    count++;
                }


            }
            return element;
        }
