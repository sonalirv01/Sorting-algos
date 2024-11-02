
import java.util.Arrays;public class BubbleSort{


    public  void bubbleSorting(int[] arr)
    {
        boolean swaping;

        for (int i = 0; i < arr.length; i++) {
            swaping=false;

            for (int j = 1; j < arr.length - i; j++) {
                if(arr[j] < arr[j-1])
                {
                    int temp = arr[j];
                    arr[j]= arr[j-1];
                    arr[j-1] = temp;
                    swaping=true;
                }
            }
            if(!swaping)
            {
                break;
            }
        }
    }
    public static void main(String[] args){
        int[] arr={3,4,6,5,7,2,1};
        BubbleSort bs =new BubbleSort();
        bs.bubbleSorting(arr);
        System.out.println(Arrays.toString(arr));
    }
}