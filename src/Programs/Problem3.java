package Programs;

public class Problem3 {
    public static void main(String[] args) {
        int[][] d2arr={
                {12,23,45},
                {34,45,56},
                {67,78,89},
        };
        int sum=0;
        for (int i=0;i< d2arr.length;i++){
            for (int j=0;j<d2arr[i].length;j++){
                sum=sum+d2arr[i][j];
            }

        }
        System.out.println(sum);
    }
}
