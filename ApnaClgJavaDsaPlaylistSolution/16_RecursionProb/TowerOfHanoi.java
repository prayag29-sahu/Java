
public class TowerOfHanoi {
    public static void TOH(int num, char source,char medium, char destination)
    {
        if(num==1)
        {
            System.out.println("Transfer Disk "+num+" From "+source+" To "+destination);
            return;
        }
        TOH(num-1,source,destination,medium);
        System.out.println("Transfer Disk "+num+" From "+source+" To "+destination);
        TOH(num-1,medium,source,destination);
    }
    public static void main(String[] args) {
        int num = 3;
        TOH(num,'s','m','d');
    }
    
}
