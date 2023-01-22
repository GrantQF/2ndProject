package Programs;

import java.util.Scanner;

public class Problem11 {
    public static void main(String[] args) {
        /*Scanner input = new Scanner(System.in);
        String[] arr = new String[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.next();
        }*/
        String[] arr = {"Monday", "Tuesday", "Wednesday", "Monday", "Thursday", "Tuesday", "Friday", "Friday", "Saturday"};
        for (int i = 0; i < arr.length; i++) {
            String repeat = arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                String repeat1 = arr[j];
                if (repeat == repeat1) {
                    System.out.println(arr[i]);
                }
            }
        }
    }
}


