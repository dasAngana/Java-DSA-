class linear{

static boolean search(int arr[],int item)
{int n=arr.length;
       for(int i=0;i<n;i++)
          if(arr[i]==item)
          return true;
  return false;
}


    public static void main(String args[]){

        int arr[]={23,22,18,16,64,33};
        int item = 34;
     

        if(search(arr,item) )
        System.out.println("found at item.");
else 
System.out.println("not found");


    }
}