public static void interleaveQueue(Queue<Integer> queue){
        Queue<Integer> queue1 = new LinkedList<>();
        Queue<Integer> queue2 = new LinkedList<>();

        if (queue.size() % 2 == 0){
            int middle = queue.size() / 2;
            int count = 0;

            while (count < middle){
                queue1.offer(queue.poll());
                count++;

            }
            while (!queue.isEmpty() && !queue1.isEmpty()){
                queue2.offer(queue1.poll());
                queue2.offer(queue.poll());

            }
            System.out.println(queue2);


        }
        else{
            int temp = 0;

            int count = 0;
            int middle = queue.size() / 2;

            while (count <= middle){
                if (count == middle){
                    if (!queue.isEmpty()) {
                        temp = queue.peek();
                        queue.poll();
                        count++;
                    }
                    else{
                        System.out.println("The Stack is empty");
                        break;
                    }
                }
                else{
                    queue1.offer(queue.poll());
                    count++;



                }

            }
            while (!queue1.isEmpty() && !queue.isEmpty()){
                queue2.offer(queue1.poll());
                queue2.offer(queue.poll());
            }
            queue2.offer(temp);

            System.out.println(queue2);
        }
    }
