public class FindMissMoreElem {
    public static void main(String[] args) {
        int[] a = {2,4,6};
        int m = 0;
        for(int i=1;i<a.length;i++){
            if(a[i]>m){
                m=a[i];
            }
        } 
        int p=0;
        for(int j=1;j<=m;j++){
            for(int i = 0;i<a.length;i++){
                if(j==a[i]){
                    p=1;
                    break;
                }else{
                    p=0;
                }
            }
            if(p==0){
                System.out.println(j);
            }
        }
    }
    
}
