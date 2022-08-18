class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        Stack<Integer> stack = new Stack<>();
        for (int i=0; i<image.length; i++) {
            stack.clear();
            for (int num : image[i]) {
                stack.add(num);
            }
            int j=0;
            while (!stack.isEmpty()) {
                int num = stack.pop();
                if (num == 0) {
                    image[i][j] = 1;
                } else {
                    image[i][j] = 0;
                }
                j++;
            }
        }
        return image;
    }
}