public static void leetcode(String[] directions, int[][] value){
        String[] arr = new String[directions.length];
        MinStack stack = new MinStack();
        for (int i = 0; i < directions.length; i++) {
            if (directions[i].equals("push")){
                stack.push(value[i][0]);
                arr[i] = null;
            }
            else{
                switch (directions[i]) {
                    case "MinStack" -> arr[i] = null;
                    case "getMin" -> arr[i] = Integer.toString(stack.getMin());
                    case "pop" -> {
                        stack.pop();
                        arr[i] = null;
                    }
                    case "top" -> arr[i] = Integer.toString(stack.top());
                    default -> arr[i] = "Error";
                }
            }

        }
        System.out.println(Arrays.toString(arr));


    }

}
class MinStack {
    private final Stack<Integer> stack;
    private final Stack<Integer> store;

    public MinStack() {
        stack = new Stack<>();
        store = new Stack<>();
    }

    public void push(int val) {
        stack.push(val);
        if (store.isEmpty() || store.peek() > val){
            store.push(val);
        }

    }

    public void pop() {

        int popped = stack.pop();
        if (!store.isEmpty() && store.peek() == popped){
            store.pop();
        }


    }

    public int top() {
        return stack.peek();

    }

    public int getMin() {
        return  store.peek();
    }
    public void show(){
        System.out.println(stack);
    }
}
