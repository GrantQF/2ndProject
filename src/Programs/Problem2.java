package Programs;

import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String[] arr=new String[3];
        String[] arr1={"Washingotn, DC", "Ontario", "Paris"};
        for (int i =0;i< arr.length;i++){
            System.out.println("Please enter a Country:");
            arr[i]= input.nextLine();
        }for (int i=0;i< arr.length;i++){
            System.out.print(arr[i]+" "+arr1[i]);
            System.out.println("");
        }
    }
}
