package Arrays;

import java.util.Arrays;

public class ImageMatrix {
    public static void main(String[] args) {
        int[][] arr = {{1, 1, 0, 0}, {1, 0, 0, 1}, {0, 1, 1, 1}, {1, 0, 1, 0}};
        System.out.println(Arrays.deepToString(flipAndInvertImage(arr)));
    }

    static int[][] flipAndInvertImage(int[][] image) {
        int n = image.length;
        int temp;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < image[i].length / 2; j++) {
                temp = image[i][j];
                image[i][j] = image[i][image[i].length - j - 1];
                image[i][image[i].length - j - 1] = temp;
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < image[i].length; j++) {
                if (image[i][j] != 0) {
                    image[i][j] = 0;
                } else {
                    image[i][j] = 1;
                }
            }
        }
        return image;
    }
}
