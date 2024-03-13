public class Main
{
	public static void main(String[] args) {
		System.out.println("This is DevOps lab experiment Github part-2.");
		
		
		
//below function is done by harsh ranjan
public static void sortarraybubblebyharsh(int[] arr)
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
    		


	
// Contributed by: Yashvir Singh
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

		


		
		//Function by Abhinav Kumar
		static int largest(int []arr) 
	{ 
		int i; 
		
		 
		int max = arr[0]; 
		
		 
		for (i = 1; i < arr.length; i++) 
			if (arr[i] > max) 
				max = arr[i]; 
		
		return max; 
	} 
		//end of the function




//Function created by harsh verma
public static void createPattern(int rows) {
        // Iterate over the rows
        for (int i = 0; i < rows; i++) {
            // Iterate over the columns
            for (int j = 0; j <= i; j++) {
                // Print an asterisk for each column
                System.out.print("* ");
            }
            // Move to the next line after printing each row
            System.out.println();
        }
    }

		
		
}

}

		
	

