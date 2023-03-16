class Bubblesort{

static void display(int arr[])
{
    for(int i=0;i<arr.length;i++)
    System.out.print  (arr[i]+" ");
}


static void bubble(int arr[])
{
    int temp;
    for(int i=0;i<arr.length-1;i++)
    {
        int swap=0;
        for(int j=0;j<arr.length-i-1;j++)
        {
            if(arr[j]>arr[j+1])
            {
                temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
                swap=1;
            }
        }
if(swap==0)
break;

    }
}

    public static void main(String args[]){
         
        int arr[]={23,32,12,18,19,20};

        System.out.println("before sorting:");
        display(arr);

        bubble(arr);

        System.out.println("After Sorting:");
        display(arr);


    }
}
