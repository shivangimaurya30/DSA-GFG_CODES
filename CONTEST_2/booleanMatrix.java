class Geeks
{
    public static void booleanMatrix(int mat[][],int m,int n)
    {
        
        //Your code here
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (mat[i][j] == 1) {
                    for (int k = 0; k < n; k++) {
                        mat[i][k] = 1;
                    }
                    break;
                }
            }
        }
    }
}
