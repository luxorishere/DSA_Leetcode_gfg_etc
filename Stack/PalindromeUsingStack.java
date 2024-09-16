 public static boolean palindrome(String string){
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < string.length(); i++) {
            stack.push(string.charAt(i));

        }
        for (int j = 0; j < string.length(); j++) {
            if (stack.peek() != string.charAt(j)){
                return false;
            }

        }
        return true;
    }
