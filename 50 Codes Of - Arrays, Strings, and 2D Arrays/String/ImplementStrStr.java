class ImplementStrStr {
    public static void main(String[] args) {
        String str = "mississippi";
        String substr = "issip";
        int n = str.length();
        int m = substr.length();
        boolean found = false;
        for(int i=0;i<=n-m;i++){
            if(str.substring(i,i+m).equals(substr)){
                System.out.println("Substring obtain in string b/w position "+(i+1)+" to "+(i+m));
                found=true;
                break;
            }
        }
        if(!found){
                System.out.println("Substring was not match.");
        }
    }
}
//Substring obtain in string b/w position 5 to 9