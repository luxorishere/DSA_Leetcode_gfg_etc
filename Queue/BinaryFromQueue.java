public static void decimalToBinary(int N){
      Queue<String> queue = new LinkedList<>();
      queue.offer("1");
      int count = 0;
      while (count < N){
          String current = queue.poll();
          System.out.println(current);
          queue.offer(current + "0");
          queue.offer(current + "1");
          count++;
      }

    }
