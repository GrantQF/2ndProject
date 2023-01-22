package Programs;

import java.util.Scanner;

public class Problem7 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        boolean flag=true;
        System.out.println("Input a number");
        int num1= input.nextInt();
        for (int i=2; i<num1;i++){
            if (num1%i==0){
                flag=false;
            }
        }if (flag)
            System.out.println(num1+" is a prime number");
        else
            System.out.println(num1+" is not a prime number");
    }
}
