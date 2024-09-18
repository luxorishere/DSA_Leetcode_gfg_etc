public static boolean sortedArray(int[] arr, int index){
        if (arr.length == 1){
            return true;
        }
        if (index == arr.length - 1){
            return arr[index] >= arr[index - 1];

        }
        else if (arr[index] > arr[index + 1]){
            return false;
        }
        return sortedArray(arr, index + 1);
    }
