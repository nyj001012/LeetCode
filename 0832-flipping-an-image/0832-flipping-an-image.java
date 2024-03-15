class Solution {
    public int[][] flipImage(int[][] image, int length) {
        for (int row = 0; row < length; row++) {
            for (int col = 0; col < length / 2; col++) {
                int temp = image[row][col];
                image[row][col] = image[row][length - col - 1];
                image[row][length - col - 1] = temp;
            }
        }
        return image;
    }
    
    public int[][] invertImage(int[][] image, int length) {
        for (int row = 0; row < length; row++) {
            for (int col = 0; col < length; col++) {
                image[row][col] ^= 1;
            }
        }
        return image;
    }
    
    public int[][] flipAndInvertImage(int[][] image) {
        image = flipImage(image, image.length);
        image = invertImage(image, image.length);
        
        return image;
    }
}