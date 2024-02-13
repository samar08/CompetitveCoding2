import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[][] matrix=new int[5][5];
        int i,j,r=0,c=0;
        for(i=0;i<5;i++){
            for(j=0;j<5;j++){
                matrix[i][j]=sc.nextInt();
                if(matrix[i][j]==1){
                    r=i;
                    c=j;
                }
            }
        }
        System.out.println(Math.abs(r-2)+Math.abs(c-2));

    }
}
