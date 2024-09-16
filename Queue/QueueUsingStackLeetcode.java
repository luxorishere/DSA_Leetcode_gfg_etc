class MyStack {
  private Queue<Integer> queue;
    private Queue<Integer> queue1;
    public MyStack() {
      queue = new LinkedList<>();
        queue1 = new LinkedList<>();   
    }
    
    public void push(int x) {
         queue.offer(x);
    }
    
    public int pop() {
        int top = 0;
         while (!queue.isEmpty()){
                if (queue.size() == 1){
                    top =  queue.poll();
                    break;
                    
                }
                queue1.offer(queue.poll());


        }
        while (!queue1.isEmpty()){
            queue.offer(queue1.poll());
        }
        return top;



    }

    
    public int top() {
         int peek = 0;
        while (!queue.isEmpty()){
            if (queue.size() == 1){
                peek = queue.peek();
            }
            queue1.offer(queue.poll());

        }
        while (!queue1.isEmpty()){
            queue.offer(queue1.poll());
        }
        System.out.println(queue);
        return peek;

    }
    
    public boolean empty() {
        return queue.isEmpty();
}
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */
