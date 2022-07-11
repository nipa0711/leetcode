class Solution {
    
    public void printArr(int[][] image) {
        for (int i=0; i<image.length; i++) {
            for (int j=0; j<image[0].length; j++) {
                System.out.print(""+image[i][j]);
            }
            System.out.println("");
        }
    }
    
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        if (image[sr][sc] == color) {
            return image;
        }
        
        int width = image[0].length;
        int height = image.length;
        
        int[][] isVisited = new int[height][width];
                
        final int firstColor = image[sr][sc];
        Queue<Pixel> queue = new LinkedList<>();
        Pixel start = new Pixel(sr, sc);
        queue.add(start);
        
        while (!queue.isEmpty()) {
            Pixel pixel = queue.poll();
            if (isVisited[pixel.x][pixel.y] == -1) {
                continue;
            }
            isVisited[pixel.x][pixel.y] = -1;
            image[pixel.x][pixel.y] = color;
            
            if (pixel.x-1 >= 0 && image[pixel.x-1][pixel.y] == firstColor) {
                queue.add(new Pixel(pixel.x-1, pixel.y));
            }
            
            if (pixel.x+1 <= height-1 &&  image[pixel.x+1][pixel.y] == firstColor) {
                queue.add(new Pixel(pixel.x+1, pixel.y));
            }
            
            if (pixel.y-1 >= 0 && image[pixel.x][pixel.y-1] == firstColor) {
                queue.add(new Pixel(pixel.x, pixel.y-1));
            }
            
            if (pixel.y+1 <= width -1 &&  image[pixel.x][pixel.y+1] == firstColor) {
                queue.add(new Pixel(pixel.x, pixel.y+1));
            }
        }
        
        //printArr(image);
        return image;
    }
    
    class Pixel {
        int x, y;
        public Pixel(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}