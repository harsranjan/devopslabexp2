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
// Function to create a pattern of asterisks
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



//Function created by Girish 
public static void subtract(String[] args) {
        int num1 = 10;
        int num2 = 5;
        
        int result = subtract(num1, num2);
        
        System.out.println("The result of subtraction is: " + result);
    }
    
    // Function to subtract two numbers
    static int subtract(int a, int b) {
        return a - b;
    }

	//function by abhijeet nautiyal
		static int sum(int []arr) 
	{ 
		int sum = 0;  
		int i; 

		
		for (i = 0; i < arr.length; i++) 
			sum += arr[i]; 

		return sum; 
	}

		//end of the function
		
}
// Contributed by Gitika Thakur
         public class PrimeNumbers {
    public static void main(String[] args) {
        int limit = 50; 
        System.out.println("Prime numbers up to " + limit + ":");
        for (int num = 2; num <= limit; num++) {
            if (isPrime(num)) {
                System.out.print(num + " ");
            }
        }
    }

    // Function to check if a number is prime
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
}

		// Function to multiply 2 numbers by afreen
public static int multiplyafreen(int num1, int num2) {
        return num1 * num2;
    }
	
	

