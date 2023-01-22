package Programs;

import java.util.Scanner;

public class Problem9 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int[] arr=new int[5];
        for (int i=0;i< arr.length;i++)
            arr[i]= input.nextInt();
        int high=arr[0];
        int low=arr[0];
        for (int i=1; i< arr.length;i++){
            if(arr[i]>high){
                high=arr[i];
            }else if(arr[i] < low){
                low=arr[i];
            }

        }
        System.out.println("the lowest number is "+low+" and the highest number is "+high);
        }
    }
