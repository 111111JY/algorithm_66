package day_01;

/**
 * 把一个数组最开始的若干个元素搬到数组的末尾，
 * 我们称之为数组的旋转。 输入一个非减排序的数组的一个旋转，
 * 输出旋转数组的最小元素。 例如数组{3,4,5,1,2}为{1,2,3,4,5}
 * 的一个旋转，该数组的最小值为1。 NOTE：给出的所有元素都大于0，
 * 若数组大小为0，请返回0。
 */

public class minNumber {
    public int minNumberInRotateArray(int[] array) {
        if (array.length == 0) {
            return 0;
        }
        if (array.length == 1) {
            return array[0];
        }
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {    //3，4，5，1，2
                return array[i + 1];
            } else {
                if (i == array.length - 2) {  //1，2，3，4，5
                    return array[0];          //array.length-2是为了确保只有3个数字的情况，不需要到array.length-1是因为题目说明了非递减
                }
            }
        }
        return 0;
    }
}