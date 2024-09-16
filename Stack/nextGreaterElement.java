public static void nextGreaterElement(int[] arr){
        Stack<Integer> stack = new Stack<>();
        ArrayList<int[]> list = new ArrayList<>();
        for (int j : arr) {
            stack.push(j);
        }
        int count = arr.length;
        int max = Integer.MIN_VALUE;
        int temp = 0;
        while (!stack.isEmpty()){
            if (stack.size() == count){
                max = stack.pop();
                list.add(new int[] {max, -1});
            }
            else if (stack.size() > 1){
                temp = stack.pop();

                if (temp > stack.peek()){
                    if (temp < max) {
                        list.add(new int[] {temp, max});
                    }
                    else{
                        list.add(new int[] {temp, -1});
                    }
                    max = temp;
                }
                else{
                    if (temp < max) {
                        list.add(new int[] {temp, max});
                    }
                    else{
                        list.add(new int[] {temp, -1});
                    }
                }
            }
            else{
                int last = stack.pop();

                if (last > max){
                    list.add(new int[] {last, -1});
                }
                else{
                    list.add(new int[] {last, max});
                }
            }
        }
        for (int[] innerArray : list) {
                System.out.println(Arrays.toString(innerArray));
              }
          }
      }
