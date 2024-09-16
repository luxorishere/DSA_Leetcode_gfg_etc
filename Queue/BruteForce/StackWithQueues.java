class StackUsingQueues{
    private Queue<Integer> queue;
    private Queue<Integer> queue1;

    StackUsingQueues(){
        queue = new LinkedList<>();
        queue1 = new LinkedList<>();
    }

    public void push(int val){
        queue.offer(val);
    }

    public void pop(){

            while (!queue.isEmpty()){
                if (queue.size() == 1){
                    queue.poll();
                    break;
                }
                queue1.offer(queue.poll());


        }
        while (!queue1.isEmpty()){
            queue.offer(queue1.poll());
        }



    }
    public int peek(){
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
    public int size(){
        if (queue.isEmpty()){
            return queue1.size();
        }
        else{
            return queue.size();
        }
    }
    public void show(){
        System.out.println(queue);
    }


}
