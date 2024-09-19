public static int[] intersectionArray(int[] arr, int[] arr1){
        HashMap<Integer, Boolean> hashMap = new HashMap<>();

        for (int i : arr){
            if (!hashMap.containsKey(i)){
                hashMap.put(i, false);
            }

        }
        for (int j : arr1){
            if (hashMap.containsKey(j)){
                hashMap.put(j, true);

            }

        }
        ArrayList<Integer> list = new ArrayList<>();

        for (Map.Entry<Integer, Boolean> entry : hashMap.entrySet()){
            int key = entry.getKey();
            boolean value = entry.getValue();
            if (value){
                list.add(key);
            }
        }
        int[] ans = new int[list.size()];

        for (int i = 0; i < list.size(); i++) {
            ans[i] = list.get(i);

        }
        return ans;

    }
