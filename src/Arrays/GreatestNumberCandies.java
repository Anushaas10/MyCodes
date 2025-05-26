package Arrays;

import java.util.ArrayList;
import java.util.List;

public class GreatestNumberCandies {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 1, 3};
        System.out.println(kidsWithCandies(arr, 3));
    }

    static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> res = new ArrayList<>();
        int max = Integer.MIN_VALUE;
        for (int candy : candies) {
            if (candy > max) {
                max = candy;
            }
        }
        for (int candy : candies) {
            if (candy + extraCandies >= max) {
                res.add(true);
            } else {
                res.add(false);
            }
        }
        return res;
    }
}
