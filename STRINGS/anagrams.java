import java.util.Arrays;

public class anagrams {
    public static void main(String[] args) {

        String str1 = "earth";
        String str2 = "heart";

        // Convert both strings to lowercase
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        // Check if lengths are equal
        if (str1.length() == str2.length()) {

            // Convert strings to char arrays
            char[] str1chararray = str1.toCharArray();
            char[] str2chararray = str2.toCharArray(); // ✅ fixed this line

            // Sort the char arrays
            Arrays.sort(str1chararray);
            Arrays.sort(str2chararray);

            // Compare sorted arrays
            boolean result = Arrays.equals(str1chararray, str2chararray);

            if (result) {
                System.out.println(str1 + " and " + str2 + " are anagrams of each other.");
            } else {
                System.out.println(str1 + " and " + str2 + " are NOT anagrams of each other.");
            }
        } else {
            // If lengths are not equal
            System.out.println(str1 + " and " + str2 + " are NOT anagrams of each other.");
        }
    }
}
