class Solution {
    public int calPoints(String[] ops) {
        Deque<Integer> deque = new ArrayDeque<>();
        for (String str : ops) {
            switch (str) {
                case "C":
                    deque.removeLast();
                    break;
                case "D":
                    deque.addLast(2 * deque.peekLast());
                    break;
                case "+":
                    int sum = 0;
                    Stack<Integer> stack = new Stack<>();
                    stack.add(deque.removeLast());
                    stack.add(deque.removeLast());
                    while (!stack.isEmpty()) {
                        int num = stack.pop();
                        sum+=num;
                        deque.addLast(num);
                    }
                    deque.addLast(sum);
                    break;
                default:
                    deque.addLast(Integer.parseInt(str));
                    break;
            }
        }
        int sum = 0;
        for (int num : deque) {
            sum += num;
        }
        
        return sum;
    }
}