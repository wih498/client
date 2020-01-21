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
}
