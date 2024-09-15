// 1. **Use a Stack:**
//    - Push each element from the queue onto a stack to reverse their order

// 2. **Repopulate the Queue:**
//    - Pop elements from the stack back into the queue

// this leverages the LIFO property of stacks to reverse the queue efficiently

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
