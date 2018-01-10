package test.java.main;

import java.io.*;
import java.util.Scanner;

/**
 * Created by m2shad0w on 17/12/23.
 */
public class FileTest {
    public static void main(String[] args) throws IOException {
//        fileInputTest();
//        CodeTest codeTest = new CodeTest();
//        int[] num = new int[]{3,2,4};
//        int[] result = codeTest.toSum2(num, 6);
//        System.out.println("result " + result[0] + "," + result[1]);
//
//        ListNodeTest listNodeTest = new ListNodeTest();
//        int[] a = new int[]{9};
//        int[] b = new int[]{9};
//        listNodeTest.addTwoNumbers(a, b);

//        SubStringTest subStringTest = new SubStringTest();
//        subStringTest.lengthOfLongestSubstring("abcabcbb");

//        MedianSortedTest medianSortedTest = new MedianSortedTest();
//        int[] a = new int[]{1,2};
//        int[] b = new int[]{1,2,3};
//        double result = medianSortedTest.findMedianSortedArrays(a, b);
//        System.out.println("result "+ result);

//        PalindromeStr palindromeStr = new PalindromeStr();
//        String s = palindromeStr.longestPalindrome("ccsccc");
//        System.out.println("s: " + s);

        Zigzang zigzang = new Zigzang();
        String s = zigzang.convert("PAYPALISHIRING",5);
        System.out.println("s: " + s);

    }

    // 从键盘读取数据
    public static void scannerDemo() {
        Scanner scan = new Scanner(System.in);
        System.out.println("nextline");
        if (scan.hasNextLine()) {
            String str = scan.nextLine();
            System.out.println("str " + str);
        }
    }

    private static void fileOutputTest() {
        File file = new File("fileTest/output.txt");
        try {
            OutputStream output = new FileOutputStream(file);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    private static void fileInputTest() {
        String fileName = "fileTest/test.txt";
        File file = new File(fileName);
        try {
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String tempStr = null;
            StringBuffer sb = new StringBuffer();
            while ((tempStr = reader.readLine()) != null) {
                sb.append(tempStr).append(",");
            }
            System.out.println("sb " + sb);
            reader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void fileInputCharTest() {
        String fileName = "fileTest/test.txt";
        try {
            InputStream f = new FileInputStream(fileName);
            InputStreamReader reader = new InputStreamReader(f, "UTF-8");
            StringBuffer sb = new StringBuffer();
            while (reader.ready()) {
                sb.append(reader.read());
            }
            reader.close();
            f.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
