class MyStack {
    Queue<Integer> queue;

    public MyStack() {
        queue = new LinkedList<>();
    }
    
    public void push(int x) {
        queue.offer(x);
    }
    
    public int pop() {
        System.out.println("pop");
        for (int i=0; i<queue.size()-1; i++) {
            int num = queue.poll();
            queue.offer(num);
        }
        System.out.println("queue : " + queue);
        System.out.println("queue.peek : " + queue.peek());
        return queue.poll();
    }
    
    public int top() {
        System.out.println("top");
        System.out.println("queue : " + queue);
        Queue<Integer> temp = new LinkedList<>();
        for (int num : queue) {
            temp.offer(num);
        }
        for (int i=0; i<temp.size()-1; i++) {
            int num = temp.poll();
            temp.offer(num);
        }
        System.out.println("queue : " + queue);
        System.out.println("temp.peek() : " + temp.peek());
        return temp.peek();
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