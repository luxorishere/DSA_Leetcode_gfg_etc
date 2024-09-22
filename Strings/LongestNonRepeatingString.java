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

