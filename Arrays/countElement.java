public static void countElement(int[] arr){
        HashMap<Integer, Integer> hashMap = new HashMap<>();

        for (int i : arr){
            int count = hashMap.getOrDefault(i, 0) + 1;
            hashMap.put(i, count);
        }
        System.out.println(hashMap);
    }
