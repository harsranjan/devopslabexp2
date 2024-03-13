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

}

// Contributed by Girish Kumar

public static void main(String[] args) {
        int[] array = {12, 11, 13, 5, 6, 7};
        System.out.println("Original array:");
        printArray(array);

        // Call the quickSort function
        quickSort(array, 0, array.length - 1);

        System.out.println("Sorted array:");
        printArray(array);
    }

    // Quick Sort Function
    
    static void quickSort(int arr[], int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);

            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    static int partition(int arr[], int low, int high) {
        int pivot = arr[high];
        int i = (low - 1);
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;

                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

    static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
}

		
	

