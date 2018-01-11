package test.java.main;

/**
 * Created by m2shad0w on 18/1/11.
 */
public class ReverseTest {
    public int reverse(int x) {
        int result = 0;
        StringBuilder str = new StringBuilder();
        char[] xstr = String.valueOf(Math.abs(x)).toCharArray();
        str.append(xstr);
        try {
            result = Integer.parseInt(str.reverse().toString());
        }catch (Exception o) {
            return 0;
        }
        return (x < 0)?-result:result;
    }
}
