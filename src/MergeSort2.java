import java.util.Arrays;

class Mergesort2 {

    public static void mergeSort(int[] input){
        mergeSort(input, 0 , input.length - 1);
    }

    public static void mergeSort(int[] input, int start, int end) {
        //bc
        if(input.length <= 1 || start >= end){
            return;
        }


        //divide into 2 parts using mid and call merge sort on small arrays
        int mid = (start + end)/2;
        mergeSort(input, start,  mid);
        mergeSort(input, mid + 1, end);

        //Now the two parts are sorted , we need to merge them into a new arr . Copy elemnts back to oriignal array.
        merge(input, start, end , mid);
    }

    public static void merge(int[] input, int start, int end, int mid) {
        int len = end - start + 1;
        int temp [] = new int[len];

        int start1 = start;
        int start2 = mid + 1;
        int end1 = mid;
        int end2 = end;

        for(int index = 0; index < len; index++){
            if(start1 <= end1 && start2<=end2){
                if (input[start1] <= input[start2]) {
                    temp[index] = input[start1];
                    start1++;
                } else {
                    temp[index] = input[start2];
                    start2++;
                }
            }
            else if(start1 <= end1){
                temp[index] = input[start1];
                start1++;
            }
            else{
                temp[index] = input[start2];
                start2++;
            }
        }

        for(int count = 0; count < len ; count++){
            input[start] = temp[count];
            start++;
        }
    }
    public static void main(String[] args) {
        int[] array = {38, 27, 43, 3, 9, 82, 10};
        System.out.println("Original array:");
        System.out.println(Arrays.toString(array));
        mergeSort(array); // Perform Merge Sort
        System.out.println("Sorted array:");
        System.out.println(Arrays.toString(array));
    }
}