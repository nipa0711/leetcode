class Solution {
    class Pixel {
        int x, y;
        public Pixel(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
    int[][] isVisited;
    
    public int processIsland(Queue<Pixel> queue, int[][] grid) {     
        int width = grid[0].length;
        int height = grid.length;
        int count = 0;
        
        while (!queue.isEmpty()) {
            Pixel pixel = queue.poll();
            if (isVisited[pixel.x][pixel.y] == -1) {
                continue;
            }
            isVisited[pixel.x][pixel.y] = -1;
            count++;
            
            if (pixel.x-1 >= 0 && grid[pixel.x-1][pixel.y] == 1) {
                queue.add(new Pixel(pixel.x-1, pixel.y));
            }
            
            if (pixel.x+1 <= height-1 && grid[pixel.x+1][pixel.y] == 1) {
                queue.add(new Pixel(pixel.x+1, pixel.y));
            }
            
            if (pixel.y-1 >= 0 && grid[pixel.x][pixel.y-1] == 1) {
                queue.add(new Pixel(pixel.x, pixel.y-1));
            }
            
            if (pixel.y+1 <= width -1 && grid[pixel.x][pixel.y+1] == 1) {
                queue.add(new Pixel(pixel.x, pixel.y+1));
            }
        }
        return count;
    }
    
    public int maxAreaOfIsland(int[][] grid) {
        int width = grid[0].length;
        int height = grid.length;
        isVisited = new int[height][width];   
        int max = 0;
        Queue<Pixel> queue = new LinkedList<>();
        
        for (int i=0; i<height; i++) {
            for (int j=0; j<width; j++) {
                if (grid[i][j] == 1 && isVisited[i][j] != -1) {
                    queue.add(new Pixel(i, j));
                    int count = processIsland(queue, grid);
                    max = Math.max(max, count);
                }
            }
        }
        return max;
    }
}