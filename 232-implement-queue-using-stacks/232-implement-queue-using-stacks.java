class MyQueue {
    Stack<Integer> stack;
    Stack<Integer> stack2;

    public MyQueue() {
        stack = new Stack<>();
        stack2 = new Stack<>();
    }
    
    public void push(int x) {
        stack.push(x);
    }
    
    public int pop() {
        System.out.println("pop");
        stack2.clear();
        int stackSize = stack.size();
        for (int i=0; i<stackSize-1; i++) {
            int num = stack.pop();
            System.out.println("stack.size() : " + num);
            stack2.push(num);
        }
        System.out.println("stack : " + stack);
        System.out.println("stack2 : " + stack2);
        int answer = stack.pop();
        stack.clear();
        int stack2Size = stack2.size();
        for (int i=0; i<stack2Size; i++) {
            int num = stack2.pop();
            stack.push(num);
        }
        System.out.println("stack : " + stack);
        System.out.println("stack2 : " + stack2);
        return answer;
    }
    
    public int peek() {
        System.out.println("peek");
        stack2.clear();
        int stackSize = stack.size();
        for (int i=0; i<stackSize-1; i++) {
            int num = stack.pop();
            stack2.push(num);
        }
        int answer = stack.peek();
        stack2.push(answer);
        stack.clear();
        while (!stack2.isEmpty()) {
            int num = stack2.pop();
            stack.push(num);
        }
        System.out.println("stack : " + stack);
        System.out.println("stack2 : " + stack2);
        return answer;
    }
    
    public boolean empty() {
        return stack.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */