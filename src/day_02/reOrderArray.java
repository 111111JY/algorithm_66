package day_02;

/**
 * 题目描述
 * 输入一个整数数组，实现一个函数来调整该数组中数字的顺序，
 * 使得所有的奇数位于数组的前半部分，所有的偶数位于数组的后半部分，
 * 并保证奇数和奇数，偶数和偶数之间的相对位置不变。
 */
public class reOrderArray {
    public void reOrderArray(int[] array) {
        if (array.length == 0) {
            return;
        }
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] % 2 == 0 && array[j + 1] % 2 == 1) {
                    int t = array[j];  //奇偶交换位置
                    array[j] = array[j + 1];
                    array[j + 1] = t;
                }
            }
        }
    }
}
