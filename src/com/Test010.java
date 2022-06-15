package com;

public class Test010 {
    public static int maximalSquare(char[][] matrix) {
        int heilength = matrix.length;
        int widlength = matrix[0].length;
        int maxS = 0;
        int count = 0;
        for (int i = 0; i < heilength; i++) {
            for (int j = 0; j < widlength; j++) {
                if(matrix[i][j]==1){
                    count++;
                    for(int k=1;;count++,k++){
                        if(matrix[i+1][j+1]==0){}

                    }
                }
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        char[][] c = {{1, 0, 1, 0, 0}, {1, 0, 1, 1, 1}, {1, 1, 1, 1, 1}, {1, 0, 0, 1, 0}};
        int rs = maximalSquare(c);
        System.out.println(rs);
    }
}
