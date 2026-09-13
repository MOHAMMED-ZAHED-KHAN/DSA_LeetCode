class Solution {
    public void setZeroes(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        boolean firstrowhas0=false;        
        boolean firstcolhas0=false;
        for(int i=0;i<n;i++){
            for(int j =0;j<m;j++){
                if(matrix[i][j]==0){
                    if(i==0) firstrowhas0 = true;
                    if(j==0) firstcolhas0 = true;
                    matrix[0][j]=0;
                    matrix[i][0]=0;
                }
            }
        }
        for(int i=1;i<n;i++){
            for(int j=1;j<m;j++){
                if(matrix[i][0]==0 || matrix[0][j]==0){
                    matrix[i][j]=0;
                }
            }
        }
        if(firstrowhas0){
            for(int j=0;j<m;j++){
                matrix[0][j]=0;
            }
        }
        if(firstcolhas0){
            for(int i=0;i<n;i++){
                matrix[i][0]=0;
            }
        }
    }
}