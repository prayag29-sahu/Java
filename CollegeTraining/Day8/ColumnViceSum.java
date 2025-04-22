public class ColumnViceSum {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3,4,5},{6,7,8,9,0}};
        for(int i=0;i<arr[0].length;i++){
            int sumcol = 0;
            for(int j=0;j<arr.length;j++){
                sumcol=sumcol+arr[j][i];
            }
            System.out.println("The column vice sum of column "+(i+1)+" elements are : "+sumcol);
        }
    }
    
}
/*
The column vice sum of column 1 elements are : 7
The column vice sum of column 2 elements are : 9
The column vice sum of column 3 elements are : 11
The column vice sum of column 4 elements are : 13
The column vice sum of column 5 elements are : 5
 */