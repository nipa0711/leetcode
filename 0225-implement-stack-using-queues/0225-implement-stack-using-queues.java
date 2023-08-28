class MyStack {
    Queue<Integer> queue;

    public MyStack() {
        queue = new LinkedList<>();
    }
    
    public void push(int x) {
        queue.offer(x);
    }
    
    public int pop() {
        for (int i=0; i<queue.size()-1; i++) {
            int num = queue.poll();
            queue.offer(num);
        }
        return queue.poll();
    }
    
    public int top() {
        Queue<Integer> temp = new LinkedList<>();
        for (int num : queue) {
            temp.offer(num);
        }
        for (int i=0; i<temp.size()-1; i++) {
            int num = temp.poll();
            temp.offer(num);
        }
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