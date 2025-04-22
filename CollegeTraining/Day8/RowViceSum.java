public class RowViceSum {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3,4,5},{6,7,8,9,0}};
        for(int i=0;i<arr.length;i++){
            int rowsum = 0;
            for(int j=0;j<arr[i].length;j++){
                rowsum=rowsum+arr[i][j];
            }
            System.out.println("Sum of Row : "+ (i+1) + " elemnts are : "+rowsum);
        }
    }
    
}
/*
Sum of Row : 1 elemnts are : 15
Sum of Row : 2 elemnts are : 30
 */