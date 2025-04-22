public class MinElem2D {
    public static void main(String[] args) {
        int[][] arr1 = {{11,2,300,4,55},{23,45,12,45,65}};
        int min = arr1[0][0];
        for(int i = 0;i<arr1.length;i++){
            for(int j=0;j<arr1[i].length;j++){
                if(arr1[i][j]<min){
                    min=arr1[i][j];
                }
            }
        }
        System.out.println("Minimum element : "+min);

    }
}
// Minimum element : 2