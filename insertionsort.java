public class insertionsort {
    
static void display(int arr[])
{
     for(int i=0;i<arr.length;i++)
    {
    System.out.print(arr[i]+" ");
    }
}


static void insertion(int arr[])
{ int temp;
    for(int i=1;i<arr.length;i++)
    {
        temp=arr[i];
        int j=i-1;
        while(j>=0 && arr[j]>temp)
        {
            arr[j+1]=arr[j];
            j--;
        }
        arr[j+1]=temp;
    }
}

    public static void main(String args[]){

        int arr[]={10,20,22,1,34,11,5};

        System.out.print("Before sorting: ");
        display(arr);

        insertion(arr);

        System.out.print("After insertion: ");
        display(arr);
    }
}
