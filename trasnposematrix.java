public class trasnposematrix {
    public static void main(String[] args) {
        // program to find transpose of a matrix
          int a[][] = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int k[][] =  new int[3][3];
        // now we will create another matrix where we will interchange rows and columns
        for (int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                k[i][j] = a[j][i];

            }
        }
        System.out.println("The original matrix was: ");
        for (int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                System.out.print(a[i][j]+ " ");

            }
            System.out.println();
        }
        System.out.println("The transpose of matrix is: ");
        for (int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                System.out.print(k[i][j] +" ");
            }
            System.out.println();
        }
    }
}
