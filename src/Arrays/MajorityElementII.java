package Arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MajorityElementII {
    public static void main(String[] args) {
        int[] arr = {2, 1, 5, 5, 5, 5, 6, 6, 6, 6, 6};
        System.out.println(findMajority(arr));

    }

    static List<Integer> findMajority(int[] arr) {
        List<Integer> result = new ArrayList<>();
        int n = arr.length;

        if (n == 0) {
            return result;
        }

        //Boyer-Moore Majority Voting Algorithm
        int candidate1 = 0;
        int count1 = 0;
        int candidate2 = 0;
        int count2 = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] == candidate1) {
                count1++;
            } else if (arr[i] == candidate2) {
                count2++;
            } else if (count1 == 0) {
                candidate1 = arr[i];
                count1 = 1;
            } else if (count2 == 0) {
                candidate2 = arr[i];
                count2 = 1;
            } else {
                count1--;
                count2--;
            }
        }

        int actualCount1 = 0;
        int actualCount2 = 0;

        for (int x : arr) {
            if (x == candidate1) {
                actualCount1++;
            }
            if (x == candidate2) {
                actualCount2++;
            }
        }

        if (actualCount1 > n / 3) {
            result.add(candidate1);
        }
        if (actualCount2 > n / 3 && candidate1 != candidate2) {
            result.add(candidate2);
        }

        Collections.sort(result);

        return result;
    }
}

