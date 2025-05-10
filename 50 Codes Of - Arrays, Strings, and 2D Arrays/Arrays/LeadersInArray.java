

public class LeadersInArray {
        public static void main(String[] args) {
        int[] arr = {16, 17, 4, 3, 5, 2};
        int n = arr.length;
        for(int i=0;i<n;i++){
        boolean check = false;
            for(int j=i;j<n;j++){
                if(arr[i]>=arr[j]){
                    check=true;
                }else{
                    check=false;
                    break;
                }
            }
            if(check==true){
                System.out.println(arr[i]);
            }
        }
    }    
}
/*
17
5
2
 */
