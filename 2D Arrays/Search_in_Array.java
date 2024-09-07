class Solution {
    public boolean searchMatrix(int[][] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid][0] <= target && arr[mid][arr[mid].length - 1] >= target) {
                return binarySearchInRow(arr, mid, target);
            } else if (arr[mid][0] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return false;
    }

    private boolean binarySearchInRow(int[][] arr, int row, int target) {
        int start = 0;
        int end = arr[row].length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[row][mid] == target) {
                return true;
            } else if (arr[row][mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return false;
    }
}
