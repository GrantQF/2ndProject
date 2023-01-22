package Programs;

import java.util.Scanner;

public class Problem10 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int[] arr=new int[5];
        for (int i=0;i< arr.length;i++)
            arr[i]= input.nextInt();
        int high=arr[0];
        int second=0;
        for(int i=1;i< arr.length;i++) {
            if (arr[i] > high) {
                high = arr[i];
            }
        }for (int j=0;j< arr.length;j++){
        if (arr[j] < high && arr[j] > second)
            second = arr[j];
        }

        System.out.println("The second highest number is "+second);
    }
}
