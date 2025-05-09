public class printsubsequ {
    public static void subseq(String str,int idx,String res)// abc,0,"" /  abc,1,a / abc,2,ab/abc,3,abc/abc,3,ab/abc,2,a/abc,3,ab
    {
        // System.out.println(str.length());
        if(idx==str.length())//0!=3/1!=3/2!=3/3==3/3==3/2!=3/3==3
        {
            System.out.println(res);//abc / ab / ab
            return;// r/r/
        }
        // System.out.println(str+" "+ idx+1 +" "+ res+str.charAt(idx));
        subseq(str, idx+1, res+str.charAt(idx));// abc,1,a /" abc,2,ab"/ "abc,3,abc"/abc,3,ab
        // System.out.println(str+" "+ idx+1 +" "+res);
        subseq(str, idx+1, res);//abc,3,ab/abc,2,a /

    }
    public static void main(String[] args) {
        String str = "abc";
        subseq(str,0,"");// abc,0,""
    }
    
}
