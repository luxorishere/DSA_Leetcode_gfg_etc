public static int unionOfArray(int[] a1, int[] a2){
        HashMap<Integer, Boolean> hashMap = new HashMap<>();

        for (int j : a1) {
            hashMap.put(j, true);

        }
        for (int j : a2) {
            hashMap.put(j, true);


        }
        System.out.println(hashMap);
        return hashMap.size();

    }
