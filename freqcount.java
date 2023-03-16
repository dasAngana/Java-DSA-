import java.util.Arrays;

class freqcount{

static void frequency(int[] arr)
{
    Arrays.sort(arr);
int i=0,n=arr.length;
    while(i<n){
          
        int count=1;
        while(i<n-1 && arr[i]==arr[i+1])
        {
            i++;
            count++;
            
        }
        System.out.print("no of count "+arr[i]+":"+count+"\n");
        i++;

    }


}


    public static void main(String args[])
    {
        int arr[] = {10,10,2,3,2,8,9};

        frequency(arr);
    }
}