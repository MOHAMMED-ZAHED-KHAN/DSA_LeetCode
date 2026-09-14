class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {
        for(int i = 0 ; i<4 ;i++){
            if(isEqual(mat,target)) return true;
            rotate(mat);
        }
        return false;
    }
    public void rotate(int[][] mat){
        int n = mat.length;
        int m = mat[0].length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<m;j++){
                int temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;
            }
        }
        for(int i=0;i<n;i++){
            int low=0;
            int high=n-1;
            while(low<=high){
                int temp = mat[i][low];
                mat[i][low] = mat[i][high];
                mat[i][high] = temp;
                low++;
                high--;
            }
        }
    }
    public boolean isEqual(int[][] mat , int[][] target){
        int n = mat.length;
        int m = mat[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(mat[i][j]!=target[i][j]){
                    return false;
                }
            }
        }
        return true;
    }
}