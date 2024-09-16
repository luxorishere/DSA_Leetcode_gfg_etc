public static int postfix(String expression){
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < expression.length(); i++) {
            if (expression.charAt(i) == '+'){
                if (stack.size() > 1){
                    int first = stack.pop();
                    int second = stack.pop();
                    first = second + first;
                    stack.push(first);

                }
                else{
                    System.out.println("The Stack contains just one element");
                }
            }
            else if (expression.charAt(i) == '-'){
                if (stack.size() > 1){
                    int first = stack.pop();
                    int second = stack.pop();

                    first = second - first;

                    stack.push(first);

                }
                else{
                    System.out.println("The Stack contains just one element");
                }
            }
            else if (expression.charAt(i) == '*'){
                if (stack.size() > 1){
                    int first = stack.pop();
                    int second = stack.pop();

                    first = second * first;

                    stack.push(first);

                }
                else{
                    System.out.println("The Stack contains just one element");
                }
            }
            else if (expression.charAt(i) == '%'){
                if (stack.size() > 1){
                    int first = stack.pop();
                    int second = stack.pop();

                    first = second % first;

                    stack.push(first);

                }
                else{
                    System.out.println("The Stack contains just one element");
                }
            }
            else if (expression.charAt(i) == '/'){
                if (stack.size() > 1){
                    int first = stack.pop();
                    int second = stack.pop();

                    first = second / first;

                    stack.push(first);

                }
                else{
                    System.out.println("The Stack contains just one element");
                }
            }
            else{
                int num = Character.getNumericValue(expression.charAt(i));
                stack.push(num);
            }




        }
        return stack.pop();
    }


}
