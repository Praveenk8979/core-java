package Strings;

import java.util.Arrays;

public class StringPrectice {
    public static String longestCommonPrefix(String[] strings) {
        if (strings == null || strings.length == 0) {
            return "";
        }

        // Sort the strings to ensure that the common prefix is among the shortest ones
        Arrays.sort(strings);

        // Compare the first and last strings (after sorting)
        String firstStr = strings[0];
        String lastStr = strings[strings.length - 1];

        StringBuilder commonPrefix = new StringBuilder();
        for (int i = 0; i < firstStr.length(); i++) {
            if (i < lastStr.length() && firstStr.charAt(i) == lastStr.charAt(i)) {
                commonPrefix.append(firstStr.charAt(i));
            } else {
                break;
            }
        }

        return commonPrefix.toString();
    }

    public static void main(String[] args) {
        // Example usage:
        String[] stringArray = {"flower", "flow", "flight"};
        String result = longestCommonPrefix(stringArray);
        System.out.println(result);
    }
}
