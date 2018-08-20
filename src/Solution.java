/**
 * 在一个二维数组中（每个一维数组的长度相同），每一行都按照从左到右递增的顺序排序，
 * 每一列都按照从上到下递增的顺序排序。请完成一个函数，输入这样的一个二维数组和一
 * 个整数，判断数组中是否含有该整数。
 */
public class Solution {
    public boolean Find(int target, int[][] array) {
        int len = array.length - 1;
        int i = 0;
        while (len >= 0 && i < array[0].length) {
            if (target < array[len][i]) {
                len--;
            } else if (target > array[len][i]) {
                i++;
            } else {
                return true;
            }
        }
        return false;
    }
}