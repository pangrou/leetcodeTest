package test.java.main;

/**
 * Created by m2shad0w on 18/1/9.
 */
public class Zigzang {
    public String convert(String s, int numRows) {
        if (s.length() <= numRows || numRows == 1) return s;
        int oneClo = (numRows > 2)?2:1;
        int oneCnt = (numRows > 2)?(numRows + numRows - 2):numRows;
        int cloNum = s.length()/oneCnt;
        int lastCnt = s.length()%oneCnt;
        int lastRows = 0;
        if (lastCnt == 0) lastRows = 0;
        else if (lastCnt <= numRows) lastRows = 1;
        else lastRows = 2;
        int cloumn = (cloNum==0)?(1+lastRows):(cloNum*oneClo + lastRows);
        StringBuilder result = new StringBuilder();
        int index = 0;
        for (int r = 0; r < numRows; r++) {
            for (int c = 0; c < cloumn; c++) {
                if (c % oneClo == 0) {
                    index = (c/oneClo) * oneCnt + r;
                    if (index < s.length()) result.append(s.charAt(index));
                } else if (r > 0 && r < numRows-1) {
                    index = (c/oneClo) * oneCnt + numRows + numRows - r - 2 ;
                    if (index < s.length()) result.append(s.charAt(index));
                }
            }
        }
        return result.toString();
    }
}
