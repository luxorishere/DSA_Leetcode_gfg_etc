public static boolean palindromeString(int start, int end, String string){
        if (start > end){
            return true;
        }
        else if (string.charAt(start) != string.charAt(end)){
            return false;
        }
        return palindromeString(++start, --end, string);
    }
