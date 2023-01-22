package Programs;

public class Problem8 {
    public static void main(String[] args) {
        int num=0;
        int num1=1;
        for (int i=0; i<10;i++){
            System.out.println(num+ " ");
            int num2=num1+num;
            num=num1;
            num1=num2;


        }
    }
}
