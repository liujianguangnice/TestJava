/**
 * author:ljg
 * Data:2019/11/7 01:26
 * Description:快速排序
 */
public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {6, 1, 2, 7, 3, 91, 41, 2, 8};
        quickSort(arr, 0, arr.length - 1);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ",\t");
        }
    }

    /*四个参数，先和基准位比较，然后交换不符合规则的i和j角标数值，当i和j相等时候，将i所在数值与基准位交换
    * 再递归调用左右半边数组quickSort(arr, low, i-1);quickSort(arr, i+1, high);
    * */
    private static void quickSort(int[] arr, int low, int high) {
        int i, j, tmp, t;
        if (low > high) {
            return;
        }

        i = low;
        j = high;

        //tmp 是基准位(保证右边永远大于基准位，左边永远小于基准位)
        tmp = arr[low];
        /*System.out.println("===================");
        System.out.println("基准是："+tmp);*/

        while (i < j) {
            //先看右边依次向左递减（）
            while (i < j && tmp <= arr[j]) {
                j--;
            }

            //再看左边依次向右递增
            while (i < j && tmp >= arr[i]) {
                i++;
            }

            //如果满足条件交换
            if(i<j){
                t = arr[j];
                arr[j] = arr[i];
                arr[i] = t;

            }
            /*for (int s = 0; s < arr.length; s++) {
                System.out.print(arr[s] + ",\t");
            }
            System.out.println();*/
        }
        //最后将基准 同 i和j相等的位置的数值交换；
        arr[low] = arr[i];
        arr[i] = tmp;

        /*System.out.println("基准 同 i和j相等的位置的数值交换:");
        for (int s = 0; s < arr.length; s++) {
            System.out.print(arr[s] + ",\t");
        }
        System.out.println();*/

        //递归调用左半边数组
        quickSort(arr, low, i-1);
        //递归调用右半边数组
        quickSort(arr, i+1, high);
    }
}
