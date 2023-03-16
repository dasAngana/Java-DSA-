public class Quicksort {

static int  partition(int[] arr,int low,int high){

    int pivot=arr[high];
    int index=low-1;

    for(int i=low;i<high;i++)
    {
       if(arr[i]<pivot)
       {
index++;
int temp=arr[index];
arr[index]=arr[i];
arr[i]=temp;
       }
    }
    //index++;
    int temp=arr[index+1];  //[index]
    arr[index+1]=arr[high];  //[index]
    arr[high]=temp; 



    return index+1; //[index]
}



static void Quick(int[] arr,int low,int high)
{
    if(low<high)
    {
        int pi=partition(arr,low,high);

        Quick(arr, low,pi-1);
        Quick(arr, pi+1, high);
    }
}
    
    
    
    static void display(int []arr)
    {
        for(int i=0;i<arr.length;i++)
        System.out.print(arr[i]+" ");
    }
    

    public static void main(String args[])
    {
        int arr[]={70,90,10,30,50,20,60,89};
        System.out.print("Before Sorting: ");
        display(arr);

        Quick(arr,0,7);

        System.out.print("after Sorting: ");
        display(arr);
    }
    
}
