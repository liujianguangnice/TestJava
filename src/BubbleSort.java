import java.util.List;

/**
 * author:ljg
 * Data:2019/11/7 00:30
 * Description:
 */
public class BubbleSort{

    public static void  BubbleSort(int[] args){
        for (int i = 0; i < args.length -1; i++){    //最多做n-1趟排序
            for(int j = 0 ;j < args.length - i - 1; j++){    //对当前无序区间score[0......length-i-1]进行排序(j的范围很关键，这个范围是在逐步缩小的)
                if(args[j] < args[j + 1]){    //把小的值交换到后面
                    int temp = args[j];
                    args[j] = args[j + 1];
                    args[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args){
        int score[] = {67, 69, 75, 87, 89, 90, 99, 100};
        BubbleSort(score);
        System.out.print("最终排序结果：");
        for(int a = 0; a < score.length; a++){
            System.out.print(score[a] + "\t");
        }
    }
}
