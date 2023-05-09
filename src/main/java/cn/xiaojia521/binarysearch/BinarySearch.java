package cn.xiaojia521.binarysearch;

/**
 * @author xiaojia
 * @date 2023/5/9 20:20
 */
public class BinarySearch {

    /**
     * 二分查找基础版
     * @param arr 升序数组
     * @param target 待查数字
     * @return 找到target返回索引，找不到返回-1
     */
    public static int binarySearchBasic(int[] arr, int target) {
        int i = 0, j = arr.length - 1;
        while (i <= j) {
            int m = (i + j) / 2;
            if (target < arr[m]) {
                j = m - 1;
            } else if (target > arr[m]) {
                i = m + 1;
            } else {
                return m;
            }
        }

        return -1;
    }
}
