package Programs;

import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int[] arr=new int[5];
        for (int i =0;i< arr.length;i++){
            arr[i]= input.nextByte();
        }int sum=0;
        for (int i=0;i< arr.length;i++){
         sum=sum+arr[i];

        }
        System.out.println(sum);


    }
}
