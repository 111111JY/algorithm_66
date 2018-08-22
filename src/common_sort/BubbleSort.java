package common_sort;

/**
 * 冒泡排序
 *
 * 排序效率低，但实现简单
 * 思想：
 * 对当前还未排好序的范围内的全部数，自上而下对相邻的俩个数依次进行比较和调整，
 * 让较大的数下沉，较小的数往上冒。即：每当俩相邻的数比较后发现他们的排序与排
 * 序的要求相反时，就将他们交换。每次遍历都可确定一个最大值放到待排数组的末尾，
 * 下次遍历，对该最大值以及它之后的元素不再排序（已经排好）。
 */
public class BubbleSort {
    private int[] array;

    public BubbleSort(int[] array) {
        this.array = array;
    }

    //按顺序打印数组中的元素
    public void display() {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
        }
        System.out.println();
    }

    //冒泡排序
    public void bubbleSort() {
        int temp;
        int len = array.length;

        for (int i = 0; i < len - 1; i++) {  //外层循环：每循环一次就确定了一个相对最大元素
            for (int j = 1; j < len - i; j++) {  //内层循环：有i个元素已经排好，根据i确定本次的比较次数
                if (array[j - 1] > array[j]) {  //如果前一位大于后一位，交换位置
                    temp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = temp;
                }
            }
            System.out.print("第" + (i + 1) + "轮排序结果：");
            display();
        }
    }

    /**
     * 主程序入口
     *
     * @param args
     */
    public static void main(String[] args) {
        int[] a = {1, 5, 4, 11, 2, 20, 18};
        BubbleSort sort = new BubbleSort(a);
        System.out.print("未排序时的结果：");
        sort.display();
        sort.bubbleSort();

    }

}
