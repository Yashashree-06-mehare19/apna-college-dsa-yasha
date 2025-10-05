import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Union {

    public int[] unionArray(int[] nums1, int[] nums2) {
        int i = 0, j = 0;
        List<Integer> res = new ArrayList<>();

        // Traverse both arrays simultaneously
        while (i < nums1.length && j < nums2.length) {
            // Skip duplicates inside nums1
            while (i > 0 && i < nums1.length && nums1[i] == nums1[i - 1]) i++;
            // Skip duplicates inside nums2
            while (j > 0 && j < nums2.length && nums2[j] == nums2[j - 1]) j++;
            if (i >= nums1.length || j >= nums2.length) break;

            if (nums1[i] < nums2[j]) {
                res.add(nums1[i]);
                i++;
            } else if (nums1[i] > nums2[j]) {
                res.add(nums2[j]);
                j++;
            } else {
                res.add(nums1[i]); // same element, add once
                i++;
                j++;
            }
        }

        // Add remaining elements of nums1
        while (i < nums1.length) {
            if (i == 0 || nums1[i] != nums1[i - 1])
                res.add(nums1[i]);
            i++;
        }

        // Add remaining elements of nums2
        while (j < nums2.length) {
            if (j == 0 || nums2[j] != nums2[j - 1])
                res.add(nums2[j]);
            j++;
        }

        // Convert List to array
        int[] result = new int[res.size()];
        for (int k = 0; k < res.size(); k++)
            result[k] = res.get(k);

        return result;
    }

    public static void main(String[] args) {
        Union sol = new Union();
        int[] nums1 = {3, 4, 6, 7, 9, 9};
        int[] nums2 = {1, 5, 7, 8, 8};
        System.out.println(Arrays.toString(sol.unionArray(nums1, nums2)));
        // Output: [1, 3, 4, 5, 6, 7, 8, 9]
    }
}
