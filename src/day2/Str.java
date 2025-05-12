package day2;

public class Str {
    public boolean palindrome(String str) {
        int left = 0;
        int right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public int count(String str, char ch) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                count++;
            }
        }
        return count;
    }
    public String reverse(String str) {
        StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString();
    }
    public String toLowerCase(String str) {
        str = str.toLowerCase();
        return str;
    }
    public String toUpperCase(String str) {
        str = str.toUpperCase();
        return str;
    }
    public boolean containsSubstring(String str, String sub) {
        return str.contains(sub);
    }
    public String replaceCharacter(String str, char oldChar, char newChar) {
        return str.replace(oldChar, newChar);
    }
    public String findLongestString(String[] str) {
        String longest = "";
        for (int i = 0; i < str.length; i++) {
            if (str[i].length() > longest.length()) {
                longest = str[i];
            }
        }
        return longest;
    }
    
}
