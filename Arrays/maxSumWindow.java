class QueueDSA{
        private int size;
        private final Queue<Integer> queue;
        private int sum;

        QueueDSA(){
            queue = new LinkedList<>();
            size = 0;
            sum = 0;
        }

        public void push(int data){
            queue.add(data);
            size += 1;
            sum += data;
        }

        public void poll(){
            if (queue.isEmpty()){
                throw new IllegalArgumentException("Queue is empty");
            }
            int lastItem = queue.poll();
            sum -= lastItem;
        }

        public int getSum(){
            return sum;
        }
        public int getSize(){
            return size;
        }



    }
public static int maxSum(int[] arr, int size){
            int sum = 0;
            QueueDSA queueDSA = new QueueDSA();
            for (int i = 0; i < size; i++) {

                queueDSA.push(arr[i]);


            }
            sum = queueDSA.getSum();

            for (int i = size; i < arr.length; i++) {
                queueDSA.push(arr[i]);
                queueDSA.poll();
                sum = Math.max(sum, queueDSA.getSum());

            }
            return sum;
        }
