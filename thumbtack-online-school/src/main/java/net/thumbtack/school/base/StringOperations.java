package net.thumbtack.school.base;

public class StringOperations {

    public static int getSummaryLength(String[] strings) {
        int length = 0;
        for (String num : strings) {
            length += num.length();
        }
        return length;
    }

    public static String getFirstAndLastLetterString(String string) {
        StringBuilder s = new StringBuilder("");
        s.append(string.charAt(0)).append(string.charAt(string.length() - 1));
        return s.toString();
    }

    public static boolean isSameCharAtPosition(String string1, String string2, int index) {
        return string1.charAt(index) == string2.charAt(index);
    }

    public static boolean isSameFirstCharPosition(String string1, String string2, char character) {
        return string1.indexOf(character) == string2.indexOf(character);
    }

    public static boolean isSameLastCharPosition(String string1, String string2, char character) {
        return string1.lastIndexOf(character) == string2.lastIndexOf(character);
    }

    public static boolean isSameFirstStringPosition(String string1, String string2, String str) {
        return string1.indexOf(str) == string2.indexOf(str);
    }

    public static boolean isSameLastStringPosition(String string1, String string2, String str) {
        return string1.lastIndexOf(str) == string2.lastIndexOf(str);
    }

    public static boolean isEqual(String string1, String string2) {
        return string1.equals(string2);
    }

    public static boolean isEqualIgnoreCase(String string1, String string2) {
        return string1.equalsIgnoreCase(string2);
    }

    public static boolean isLess(String string1, String string2) {
        return string1.compareTo(string2) < 0;
    }

    public static boolean isLessIgnoreCase(String string1, String string2) {
        return string1.compareToIgnoreCase(string2) < 0;
    }

    public static String concat(String string1, String string2) {
        return string1.concat(string2);
    }

    public static boolean isSamePrefix(String string1, String string2, String prefix) {
        return string1.startsWith(prefix) && string2.startsWith(prefix);
    }

    public static boolean isSameSuffix(String string1, String string2, String suffix) {
        return string1.endsWith(suffix) && string2.endsWith(suffix);
    }

    public static String getCommonPrefix(String string1, String string2) {
        StringBuilder rezult = new StringBuilder("");
        int s = 0;
        if (string1.length() > string2.length()) {
            s = string2.length();
        } else {
            s = string1.length();
        }
        for (int i = 0; i < s; i++) {
            if (string1.charAt(i) == string2.charAt(i)) {
                rezult.append(string1.charAt(i));
            } else {
                return rezult.toString();
            }
        }
        return rezult.toString();
    }

    public static boolean isPalindrome(String string) {
        int lenStr = string.length();
        if ((lenStr == 0) || (lenStr == 1)) {
            return (true);
        }
        for (int i = 0; i < lenStr / 2; i++) {
            if (string.charAt(i) != string.charAt(lenStr - i - 1)) {
                return false;
            }
        }
        return true;
    }

    public static boolean isPalindromeIgnoreCase(String string) {
        return isPalindrome(string.toLowerCase());
    }

    public static String getLongestPalindromeIgnoreCase(String[] strings) {
        String rezult = "";
        for (String num : strings) {
            if (isPalindromeIgnoreCase(num) && rezult.length() < num.length()) {
                rezult = num;
            }
        }
        return rezult;
    }

    public static boolean hasSameSubstring(String string1, String string2, int index, int length) {
        if (string1.length() < length + index || string2.length() < length + index) {
            return false;
        }
        String s1 = string1.substring(index, length + index);
        String s2 = string2.substring(index, length + index);
        return isEqualIgnoreCase(s1, s2);
    }

    public static boolean isEqualAfterReplaceCharacters(String string1, char replaceInStr1, char replaceByInStr1, String string2, char replaceInStr2, char replaceByInStr2) {
        return isEqual(string1.replace(replaceInStr1, replaceByInStr1), string2.replace(replaceInStr2, replaceByInStr2));
    }

    public static boolean isEqualAfterReplaceStrings(String string1, String replaceInStr1, String replaceByInStr1, String string2, String replaceInStr2, String replaceByInStr2) {
        return isEqual(string1.replaceAll(replaceInStr1, replaceByInStr1), string2.replace(replaceInStr2, replaceByInStr2));
    }

    public static boolean isPalindromeAfterRemovingSpacesIgnoreCase(String string) {
        return isPalindromeIgnoreCase(string.replace(" ", ""));
    }

    public static boolean isEqualAfterTrimming(String string1, String string2) {
        return isEqual(string1.trim(), string2.trim());
    }

    public static String makeCsvStringFromInts(int[] array) {
        String[] rezult = new String[array.length];
        if (array.length == 0) return "";
        for (int i = 0; i < array.length; i++) {
            rezult[i] = Integer.toString(array[i]);
        }
        return String.join(",", rezult);
    }

    public static String makeCsvStringFromDoubles(double[] array) {
        String[] s1 = new String[array.length];
        if (array.length == 0) return "";
        for (int i = 0; i < array.length; i++) {
            s1[i] = String.format("%(.2f", array[i]);
        }
        return String.join(",", s1);
    }

    public static StringBuilder makeCsvStringBuilderFromInts(int[] array) {
        StringBuilder rezult = new StringBuilder("");
        return rezult.append(makeCsvStringFromInts(array));
    }

    public static StringBuilder makeCsvStringBuilderFromDoubles(double[] array) {
        StringBuilder rezult = new StringBuilder("");
        return rezult.append(makeCsvStringFromDoubles(array));
    }

    public static StringBuilder removeCharacters(String string, int[] positions) {
        StringBuilder rezult = new StringBuilder("");
        rezult.append(string);
        for (int i = 0; i < positions.length; i++) {
            rezult.deleteCharAt(positions[i] - i);
        }
        return rezult;
    }

    public static StringBuilder insertCharacters(String string, int[] positions, char[] characters) {
        StringBuilder rezult = new StringBuilder("");
        rezult.append(string);
        for (int i = 0; i < positions.length; i++) {
            rezult.insert(positions[i] + i, characters[i]);
        }

        return rezult;
    }
}















