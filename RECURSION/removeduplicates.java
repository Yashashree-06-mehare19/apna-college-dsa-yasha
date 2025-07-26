public class removeduplicates {

    public static void remove_duplicates(String str, int idx, StringBuilder newstr, boolean[] map) {
        if (idx == str.length()) {
            System.out.println(newstr);
            return;
        }

        char currchar = str.charAt(idx);
        if (map[currchar - 'a']) {
            // duplicate
            remove_duplicates(str, idx + 1, newstr, map);
        } else {
            map[currchar - 'a'] = true;
            remove_duplicates(str, idx + 1, newstr.append(currchar), map);
        }
    }

    public static void main(String[] args) {
        String str = "appnacollege";
        remove_duplicates(str, 0, new StringBuilder(""), new boolean[26]);
    }
}
