class Solution {
 public int countNegatives(int[][] grid){
        int output =0;
        int lengthofy = grid.length-1; 
        int x = 0; 
        int lengthofx = grid[lengthofy].length;
        while(lengthofy>=0 && x<lengthofx){
            if(grid[lengthofy][x]<0){
                lengthofy--;
                output = output+lengthofx-x;
            }else{
                x++;
            }
        }
        return output;
    }
}