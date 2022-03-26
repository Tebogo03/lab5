package Com.Task;

public class Matrix {
    public static void main(String[] args) {
        int[][] matrix = new int[10][10];
        int a =0;
        System.out.println(matrix.length);
        for (int i=0;i< matrix.length;i++){
            for (int j=0;j< matrix.length;j++){

                if (i==j){
                    matrix[i][j]= j;
                    a+=j;

                }
                else {
                    matrix[i][j]=0;
                }

            }
        }
        for (int i=0;i< matrix.length;i++){
            for (int j=0;j< matrix.length;j++){
                System.out.print(matrix[i][j]+" ");

            }
            System.out.println();
        }
        System.out.println();
        System.out.println("The Sum of the diagonal is "+ a);

    }
}
