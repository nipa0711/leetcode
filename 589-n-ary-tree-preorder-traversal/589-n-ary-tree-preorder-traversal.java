/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public List<Integer> preorder(Node root) {
        List<Integer> answer = new ArrayList<>();
        if (root == null) {
            return answer;
        }
        Deque<Node> stack = new ArrayDeque<>();

        stack.push(root);

        while (!stack.isEmpty()) {
            Node node = stack.pop();
            answer.add(node.val);
            if (node.children != null) {
                Collections.reverse(node.children);
                for (Node temp : node.children) {
                    stack.push(temp);
                }
            }
        }
        return answer;
    }
}