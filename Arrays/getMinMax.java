 public static int[] getMinMax(int[] arr){
        int min  = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i : arr){
            min = Math.min(min, i);
            max = Math.max(max, i);
        }
        return new int[] {min, max};
    }
