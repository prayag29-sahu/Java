import java.util.*;

public class arrays {
    public static void main(String[] args) {
        // int[] array = new int[5];
        // array[0]=10; 
        // array[1]=50; 
        // array[2]=40; 
        // array[3]=30; 
        // array[4]=20; 
        // System.out.println(array[0]+" "+array[1]+" "+array[2]+" "+array[3]+" "+array[4]+" ");

        // int[] a = {1,2,3,4,5};
        // System.out.println(a[0]+" "+a[1]+" "+a[2]+" "+a[3]+" "+a[4]+" ");

        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];

        // input of an array
        for(int i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }

        // o/p of an array elements
        // for(int i=0;i<size;i++)
        // {
        //     System.out.print(arr[i]+" ");
        // }

        // input / output the string array 
        // String[] names = new String[size];
        // for(int i=0;i<size;i++)
        // {
        //     names[i]=sc.next();
        // }
        // for(int i=0;i<size;i++)
        // {
        //     System.out.print("Name"+(i+1)+" is "+names[i]+" ");
        // }


        // find the max and min element of an array
        // int max = arr[0];
        // int min = arr[0];
        // for(int j=1;j<=size;j++)
        // {
        //     if(arr[j]>max)
        //     {
        //         max=arr[j];
        //     }
        //     if(arr[j]<min)
        //     {
        //         min=arr[j];
        //     }
        // }
        // System.out.println("Maximum Element : "+max+" Minimum Element : "+min);

        // check elements of array are sorted ?
        // int sort =1;
        // for(int i=0;i<size-1;i++)
        // {
        //     if(arr[i]>arr[i+1])
        //     {
        //         sort = 0;              
        //     }
        // }
        // if(sort==1)
        // {
        //     System.out.println("Inputed Array elements are sorted ");
        // } else{
        //     System.out.println("Inputed Array elements are Not sorted.");
        // }


    }
}
