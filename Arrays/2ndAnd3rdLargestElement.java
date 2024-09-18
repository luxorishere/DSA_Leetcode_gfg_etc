public static int thirdLargest(int[] arr) {
        if (arr == null || arr.length < 3) {
            throw new IllegalArgumentException("Array must have at least three elements.");
        }

        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        int thirdMax = Integer.MIN_VALUE;

        for (int i : arr) {
            if (i > max) {
                thirdMax = secondMax;
                secondMax = max;
                max = i;
            } else if (i > secondMax && i < max) {
                thirdMax = secondMax;
                secondMax = i;
            } else if (i > thirdMax && i < secondMax) {
                thirdMax = i;
            }
        }

        if (thirdMax == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("No third largest element found.");
        }

        return thirdMax;
    }
