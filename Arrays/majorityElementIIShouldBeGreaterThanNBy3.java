public static void majorityElementIIShouldBeGreaterThanNBy3(int[] arr){
            int element = 0;
            int count = 0;
            int outerElement = 0;
            int outerCount = 0;

            int i = 0;
            int j = i + 2;

            while (j <= arr.length - 1){
                for (int k = i; k <= j; k++) {
                    if (count == 0){
                        element = arr[k];
                        count++;


                    }
                    else if (arr[i] != element){
                        count--;
                    }
                    else{
                        count++;
                    }
                }
                if (outerCount == 0){
                    outerElement = element;
                    outerCount++;
                }
                else if (element != outerElement){
                    outerCount--;
                }
                else{
                    outerCount++;
                }
                i = j;
                j += 2;
            }
            System.out.println(outerElement);



        }
