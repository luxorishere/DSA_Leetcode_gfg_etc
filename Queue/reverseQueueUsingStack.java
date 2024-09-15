 public static void reverseQueue(Queue<Integer> queue){
        Stack<Integer> stack = new Stack<>();
        System.out.println(queue);
        while (!queue.isEmpty()) {
            stack.push(queue.poll());
        }
        while (!stack.isEmpty()){
            queue.offer(stack.pop());
        }
        System.out.println(queue);
    }
