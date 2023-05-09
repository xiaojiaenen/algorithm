package cn.xioajia521.binarySearch;

import cn.xiaojia521.binarysearch.BinarySearch;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


/**
 * @author xiaojia
 * @date 2023/5/9 20:25
 */
public class TestBinarySearch {
    int[] arr={7,13,21,30,38,44,52,53};
    @Test
    @DisplayName("binarySearchBasic找到了")
    public void test1(){
        Assertions.assertEquals(0, BinarySearch.binarySearchBasic(arr,7));
        Assertions.assertEquals(1, BinarySearch.binarySearchBasic(arr,13));
        Assertions.assertEquals(2, BinarySearch.binarySearchBasic(arr,21));
        Assertions.assertEquals(3, BinarySearch.binarySearchBasic(arr,30));
        Assertions.assertEquals(4, BinarySearch.binarySearchBasic(arr,38));
        Assertions.assertEquals(5, BinarySearch.binarySearchBasic(arr,44));
        Assertions.assertEquals(6, BinarySearch.binarySearchBasic(arr,52));
        Assertions.assertEquals(7, BinarySearch.binarySearchBasic(arr,53));
    }

    @Test
    @DisplayName("binarySearchBasic没有找到")
    public void test2(){
        Assertions.assertEquals(-1, BinarySearch.binarySearchBasic(arr,0));
        Assertions.assertEquals(-1, BinarySearch.binarySearchBasic(arr,15));
        Assertions.assertEquals(-1, BinarySearch.binarySearchBasic(arr,60));
    }
}
