package test.java.main;

import java.util.ArrayList;
/**
 * Created by m2shad0w on 18/1/4.
 */
public class ListNodeTest {

    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    public ListNode addTwoNumbersFinal(ListNode l1, ListNode l2) {
        int addFlag = 0;
        ListNode firstNode = new ListNode(0);
        ListNode newNode = firstNode;
        while (l1 != null || l2 != null) {
            int x = (l1 != null) ? l1.val : 0;
            int y = (l2 != null) ? l2.val : 0;
            int sum = x + y + addFlag;
            addFlag = sum / 10;
            newNode.next = new ListNode(sum % 10);
            newNode = newNode.next;
            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }
        if(addFlag == 1) {
            newNode.next = new ListNode(1);
        }
        return firstNode.next;
    }

    public ListNode createListNodeInt(int[] sumChar) {
        ListNode firstNode = null, lastNode = null, newNode = null;
        for (int i = 0; i < sumChar.length; i++) {
            newNode = new ListNode(sumChar[i]);
            newNode.next = null;
            if (firstNode == null) {
                firstNode = newNode;
                lastNode = newNode;
            } else {
                lastNode.next = newNode;
                lastNode = newNode;
            }
        }
        return firstNode;
    }

//    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    public ListNode addTwoNumbers(int[] a, int[] b) {
        ListNode l1 = createListNodeInt(a);
        ListNode l2 = createListNodeInt(b);

        ArrayList<Integer> list = getListNodeData(l1,l2);
        return createListNode(list);
    }

    public ListNode createListNode(ArrayList<Integer> sumChar) {
        ListNode firstNode = null, lastNode = null, newNode = null;
        for (int i = 0; i < sumChar.size(); i++) {
            int d = Integer.parseInt(String.valueOf(sumChar.get(i)));
            newNode = new ListNode(sumChar.get(i));
            newNode.next = null;
            if (firstNode == null) {
                firstNode = newNode;
                lastNode = newNode;
            } else {
                lastNode.next = newNode;
                lastNode = newNode;
            }
        }
        return firstNode;
    }

    public ArrayList<Integer> getListNodeData(ListNode l1, ListNode l2) {
        ArrayList<Integer> list = new ArrayList<>();
        boolean addFlag = false;
        while (l1 != null || l2 != null) {
            int x = (l1 != null) ? l1.val : 0;
            int y = (l2 != null) ? l2.val : 0;
            int sum = x + y;
            if (addFlag) {
                sum += 1;
                addFlag = false;
            }
            if (sum >= 10) {
                addFlag = true;
                sum = sum - 10;
            }
            list.add(sum);
            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }
        if (addFlag) list.add(1);
        return list;
    }

}
