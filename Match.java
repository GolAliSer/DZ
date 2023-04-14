package DZ;

public class Match {
    public static boolean empty(String s) {return s == null || s.length() == 0;}
    public static int countmatches(String a, String b)
    {
        if (empty(a) || empty(b)) {
            return 0;
        }
        return a.split(b, -1).length - 1;
    }
}