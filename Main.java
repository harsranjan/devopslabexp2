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


	public static void add(String[] args) {  
        Scanner scanner = new Scanner(System.in);  
          
        System.out.print("Enter a number: ");  
        int num1 = scanner.nextInt();  
          
        System.out.print("Enter another number: ");  
        int num2 = scanner.nextInt();  
        int sum = add(num1, num2);  
        System.out.println("The sum of " + num1 + " and " + num2 + " is " + sum + ".");    public static int add(int a, int b) {  
        return a + b;  
    
	}  
}

}

		
	

