package day_03;

import java.util.ArrayList;

/**
 * 输入一个矩阵，按照从外向里以顺时针的顺序依次打印出每一个数字，
 * 例如，如果输入如下4 X 4矩阵： 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16
 * 则依次打印出数字1,2,3,4,8,12,16,15,14,13,9,5,6,7,11,10.
 * <p>
 * 往上下走是行动列不动，走的方向就看是往startRow还是endRow了。
 * 往左右走是列动行不动，走的方向就看是往startCol还是endCol了。
 * 没想出思路
 * 参考别人答案
 */
public class printMatrix {
    public ArrayList<Integer> printMatrix(int[][] matrix) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        if (matrix == null || matrix.length == 0) {
            return result;
        }
        printMatrixMethod(matrix, 0, 0, matrix.length - 1, matrix[0].length - 1, result);
        return result;
    }

    public void printMatrixMethod(int[][] matrix, int startRow,
                                  int startCol, int endRow, int endCol,
                                  ArrayList<Integer> result) {
        if (startRow < endRow && startCol < endCol) {
            for (int j = startCol; j <= endCol; j++) {
                result.add(matrix[startRow][j]);
            } //right
            for (int i = startRow + 1; i <= endRow - 1; i++) {
                result.add(matrix[i][endCol]);
            } //down
            for (int j = endCol; j >= startCol; j--) {
                result.add(matrix[endRow][j]);
            }   //left
            for (int i = endRow - 1; i >= startRow + 1; i--) {
                result.add(matrix[i][startCol]);
            }  //up
            printMatrixMethod(matrix, startRow + 1, startCol + 1, endRow - 1, endCol - 1, result);
        } else if (startRow == endRow && startCol < endCol) {
            for (int j = startCol; j <= endCol; j++) {
                result.add(matrix[startRow][j]);
            }
        } else if (startRow < endRow && startCol == endCol) {
            for (int i = startRow; i <= endRow; i++) {
                result.add(matrix[i][endCol]);
            }
        } else if (startRow == endRow && startCol == endCol) {
            result.add(matrix[startRow][startCol]);
        } else {
            return;
        }
    }
}
