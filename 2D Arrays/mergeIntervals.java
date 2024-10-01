 public static void intervals(int[][] arr){
            Arrays.sort(arr, Comparator.comparingInt(a -> a[0]));
            int max = Integer.MIN_VALUE;
            ArrayList<int[]> list = new ArrayList<>();
            int i = 0;
            int j = 0;
            while (j < arr.length){
                if (j == arr.length - 1){
                    if (arr[j][0] > max){
                        list.add(new int[] {arr[j][0], arr[j][1]});
                    }
                    else{
                        max = Math.max(max, arr[j][1]);
                        list.add(new int[] {arr[i][0], max});
                    }
                    break;
                }
                max = Math.max(max, arr[j][1]);
                if (arr[j + 1][0] <= max){
                    j++;
                }
                else{
                    list.add(new int[] {arr[i][0], max});
                    j++;
                    i = j;
                }
            }
            for (int k = 0; k < list.size(); k++) {
                System.out.println(Arrays.toString(list.get(k)));
            }
        }
