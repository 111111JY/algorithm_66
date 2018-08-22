package common_sort;

/**
 * 快速排序
 * <p>
 * 快速排序也是基于分治算法得。步骤如下：
 * （1）选择一个基准元素，通常选择第一个元素或者最后一个元素；
 * （2）通过一趟排序讲待排序的记录分割成独立的两部分，
 * 其中一部分记录的元素值均比基准元素值小。另一部分记录的元素值比基准值大；
 * （3）此时基准元素在其排好序后的正确位置；
 * （4）然后分别对这两部分记录用同样的方法继续进行排序，直到整个序列有序。
 */
public class QuickSort {
    int array[];

    public QuickSort(int array[]) {
        this.array = array;
    }

    public void quickSort() {
        recursiveQuickSort(0, array.length - 1);
    }

    private void display() {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
        }
        System.out.println();
    }

    /**
     * 递归的快速排序
     *
     * @param low  数组的最小下标
     * @param high 数组的最大下标
     */
    private void recursiveQuickSort(int low, int high) {
        if (low >= high) {
            return;
        } else {
            int pivot = array[low];  //以第一个元素为基准
            int partition = partition(low, high, pivot);  //对数组进行划分，比pivot小的元素在低位段，比pivot大的元素在高位段
            display();
            recursiveQuickSort(low, partition - 1);  //对划分后的低位段进行快速排序
            recursiveQuickSort(partition + 1, high);  //对划分后的高位段进行快速排序
        }
    }

    /**
     * 以pivot为基准对下标low到high的数组进行划分
     *
     * @param low   数组段的最小下标
     * @param high  数组段的最大下标
     * @param pivot 划分的基准元素
     * @return 划分完成后基准元素所在位置的下标
     */
    private int partition(int low, int high, int pivot) {
        while (low < high) {
            while (low < high && array[high] >= pivot) {  //从右端开始扫描，定位到第一个比pivot小的元素
                high--;
            }
            swap(low, high);
            while (low < high && array[low] <= pivot) {  //从左端开始扫描，定位到第一个比pivot大的元素
                low++;
            }
            swap(low, high);
        }
        return low;
    }

    /**
     * 交换数组中两个元素的数据
     *
     * @param low  欲交换元素的低位下标
     * @param high 欲交换元素的高位下标
     */
    private void swap(int low, int high) {
        int temp = array[high];
        array[high] = array[low];
        array[low] = temp;
    }

    /**
     * 主程序入口
     *
     * @param args
     */
    public static void main(String[] args) {
        int[] a = {30, 8, 4, 21, 2, 20, 18};
        QuickSort sort = new QuickSort(a);
        System.out.println("快速排序过程：");
        sort.quickSort();
        System.out.println("快速排序后的结果：");
        sort.display();
    }
}
