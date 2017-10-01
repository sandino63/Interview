Given an integer n, generate a square matrix filled with elements from 1 to n2 in spiral order.

For example,
Given n = 3,

You should return the following matrix:
[
 [ 1, 2, 3 ],
 [ 8, 9, 4 ],
 [ 7, 6, 5 ]
]



class Solution {
    public int[][] generateMatrix(int n) {
        
        int matrix[][]  = new int[n][n];
        
         if(n == 0 )
            return matrix;
        
        int colstart = 0;
        int colend =n-1;
        
        
        int rowstart = 0;
        int rowend = n-1;
        
        int num  = 1;
        
        while(rowstart <= rowend && colstart <=colend ){
        for(int i = colstart ; i <=colend ; i++ ){
        matrix[rowstart][i]=num++;
        }
        rowstart++;
        
         for(int i = rowstart ; i <=rowend ; i++ ){
                matrix[i][colend] = num++;
        }
        colend--;
     if(rowstart <= rowend){
            for(int j = colend ; j>=colstart ; j-- ){
         matrix[rowend][j]=num++;
        }
        }
        rowend--;
        
            if(colstart <= colend){
     for(int j = rowend ; j>=rowstart ; j-- ){
        matrix[j][colstart]=num++;
        }
        }
        colstart++;
    }
        return matrix;
        
    }
}
