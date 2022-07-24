import java.util.Scanner;

public class OtherPrograms {
	public static void main(String[] args)
	{
		
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter Size of Array"); 
		 int askInputLength = sc.nextInt();
		
		//		findInputEvenOdd(99);
//		findFactorial(10);
//		primeNumber(83);
		largestAmoungInput(sc,askInputLength);
	}
	
	public static void largestAmoungInput(Scanner sc ,int askInputLength)
	{
		  int[] arr = new int[askInputLength];
		  for(int input=0; input<askInputLength; input++) 
		  {
			  System.out.print("Enter a value for index "+(input+1)+" => ");
			  arr[input] = sc.nextInt(); 
		}
		 
//		int[] arr1 = {3,53,7,67,11,3};
		
		int max=0;
		int maxIndex = 0;
		for(int i=0; i<arr.length; i++)
		{
			for(int j=i+1; j<arr.length; j++)
			{
				if(max < arr[j])
				{
					max = arr[j];
					maxIndex = j+1;
				}
			}
		}
		System.out.println("Lagest Value in Array is : "+max+ " at index "+ maxIndex);
	}
	
	
	public static void primeNumber(int input)
	{
		int count=0;
		for(int i=1; i<=input; i++)
		{
			if(input%i == 0)
				count++;
		}
		if(count == 2)
			System.out.println("Prime");
		else
			System.out.println("Not Prime");
		
	}
	
	public static void findFactorial(int input)
	{
		int result = 1;
		while(input>0)
		{
			result = result * input;
			input--;
		}
		System.out.println(result);
	}
	
	public static void findInputEvenOdd(int input)
	{
		//normal way
		if(input%2==0)
			System.out.println("Even");
		else
			System.out.println("Odd");		
	}
}
