package test.java.main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by m2shad0w on 18/1/5.
 */
public class MedianSortedTest {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int len = nums1.length + nums2.length;
        List<Integer> list = new ArrayList<>();
        int[] newNum = null;
        if (nums1.length != 0 && nums2.length != 0) {
            int index1 = 0, index2 = 0;
            for (int i = 0; i < len; i++) {
                if (nums1[index1] < nums2[index2]) {
                    list.add(nums1[index1++]);
                    if (index1 == nums1.length) {
                        newNum = Arrays.copyOfRange(nums2, index2, nums2.length);
                        break;
                    }
                } else {
                    list.add(nums2[index2++]);
                    if (index2 == nums2.length) {
                        newNum = Arrays.copyOfRange(nums1, index1, nums1.length);
                        break;
                    }
                }
            }
        } else {
            newNum = (nums1.length == 0) ? nums2 : nums1;
        }
        if (newNum.length != 0) {
            for (int j = 0; j < newNum.length; j++) {
                list.add(newNum[j]);
            }
        }
        if (len == 0) {
            return list.get(0);
        }else if (len % 2 != 0) {
            return list.get(len/2);
        } else {
            return (double) (list.get(len/2) + list.get(len/2-1))/2;
        }
    }

//    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
//        if (nums1.length <= 2 || nums2.length <= 2) {
//           return getMinValue(nums1, nums2);
//        }
//
//        int len1 = nums1.length/2;
//        int len2 = nums2.length/2;
//        if (nums1[len1] == nums2[len2]) {
//            return nums1[len1];
//        } else if (nums1[len1] < nums2[len2]){
//            return findMedianSortedArrays(Arrays.copyOfRange(nums1,len1,nums1.length),Arrays.copyOfRange(nums1,0,len2));
//        } else {
//            return findMedianSortedArrays(Arrays.copyOfRange(nums1,0,len1),Arrays.copyOfRange(nums1,len2,nums2.length));
//        }
//    }

}
