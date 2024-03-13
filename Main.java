public class Main
{
	public static void main(String[] args) {
		System.out.println("This is DevOps lab experiment Github part-2.");
		//below code is done by harsh ranjan
		static void sortarraybubblebyharsh(int[] arr)
	{
	    int length = arr.length;
	    
	    for(int i=0;i<length;i++)
	    {
	        for(int j =i+1;j<length;j++)
	        {
	            if(arr[i]>arr[j])
	            {
	                int temp;
	                temp= arr[i];
	                arr[i]=arr[j];
	                arr[j]= temp;
	            }
	        }
	    }
	}
    }
}

		
	

