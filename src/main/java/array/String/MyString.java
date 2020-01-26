package array.String;

public class MyString {
    final int maxnum = 100;
    char Ch[] = new char[maxnum];
    int length;

    public int indexOf(String s, String t) {
        if (t == null) {
            return 0;
        }
        int sLength = s.length();
        int tLength = t.length();
        int i = 0;
        if (sLength < tLength) {
            return 0;
        }

        while (i <= (sLength - tLength)) {
            if (t.equals(s.substring(i, i + tLength))) {
                return i;
            }
            i++;
        }
        return 0;
    }

    public String concat(String s, String t) {
        String l = null;
        if (s.length() + t.length() < maxnum) {
            l = s + t;
        }

        if (s.length() + t.length() > maxnum && s.length() < maxnum) {
            l = s + t.substring(0, maxnum - s.length());
        }

        if (s.length() > maxnum) {
            l = s.substring(0, maxnum);
        }

        return l;
    }

    public static String subStr(String sub, String s, int start, int len) {
        if (sub.length() == 0) {
            return null;
        }

        if ((start > 0 && start < s.length()) && (len >= 0 && len < s.length() - start)) {
            char[] temp = s.toCharArray();
            for (int i = start; i < start + len; i++) {
                sub = sub + temp[i];
            }
        }

        return sub;
    }

    public int index_bf(String s, String t) {
        int i = 0, j = 0;
        while ((i < s.length()) && (j < t.length())) {
            if (s.substring(i, i + 1).equals(t.substring(j, j + 1))) {
                i = i + 1;
                j = j + 1;
            } else {
                i = i - j + 1;
                j = 0;
            }
        }

        if (j >= t.length()) {
            return i - t.length() + 1;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        MyString myString = new MyString();
        System.out.println(myString.index_bf("abcdabceabcf", "abcf"));
    }
}
