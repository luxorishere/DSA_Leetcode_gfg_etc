public static String longestNonRepeatingString(String string){
            if (string.length() == 1){
                return string;
            }

            Set<Character> characters = new HashSet<>();
            StringBuilder stringBuilder = new StringBuilder();

            String maxString = "";

            for (int i = 0; i < string.length() - 1; i++) {
                if (characters.contains(string.charAt(i + 1))){
                    characters.add(string.charAt(i));
                    stringBuilder.append(string.charAt(i));
                    if (stringBuilder.length() > maxString.length()){
                        maxString = stringBuilder.toString();
                    }
                    characters.clear();
                    stringBuilder = new StringBuilder();
                }
                else{
                    characters.add(string.charAt(i));
                    stringBuilder.append(string.charAt(i));
                }


            }
            if (!characters.contains(string.charAt(string.length() - 1))){
                stringBuilder.append(string.charAt(string.length() - 1));
            }
            if (stringBuilder.length() > maxString.length()){
                return stringBuilder.toString();
            }
            return maxString;
        }
 public static String longestNonRepeating(String string) {
            if (string.length() == 1){
                return string;
            }
            HashMap<Character, Boolean> hashMap = new HashMap<>();

            StringBuilder stringBuilder = new StringBuilder();
            String maxString = "";

            for (int i = 0; i < string.length() - 1; i++) {
                if (hashMap.containsKey(string.charAt(i + 1))) {
                    hashMap.put(string.charAt(i), true);
                    stringBuilder.append(string.charAt(i));
                    if (stringBuilder.length() > maxString.length()) {
                        maxString = stringBuilder.toString();


                    }
                    hashMap.clear();
                    stringBuilder = new StringBuilder();

                } else {



                    hashMap.put(string.charAt(i), true);
                    stringBuilder.append(string.charAt(i));
                }
            }
            if (!hashMap.containsKey(string.charAt(string.length() - 1))){
                stringBuilder.append(string.charAt(string.length() - 1));
            }
            if (stringBuilder.length() > maxString.length()){
                maxString = stringBuilder.toString();
            }
            return maxString;
        }
