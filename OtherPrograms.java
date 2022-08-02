import java.util.Scanner;

public class OtherPrograms {
	public static void main(String[] args)
	{
		
//		 Scanner sc = new Scanner(System.in);
//		 System.out.println("Enter Size of Array"); 
		 int askInputLength = 3;
		
//		findInputEvenOdd(99);
//		findFactorial(10);
//		primeNumber(83);
//		largestAmoungInput(sc,askInputLength);
//		swapTwoNumbers(52,35);
//		fibonacciSeries(10);
//		palindromeString();
//		pascalTriangle();
//		leapYear(2025);
//		perfectNumber(29);
		armstrongNumber(370);
		 
	}
	
	public static void armstrongNumber(int n)
	{
		int power = 0;
		int sum = 0;
		int quotient = n;
		
		
		while(quotient>0) 
		{
			power = quotient%10;
			quotient = quotient/10;
			sum += power * power * power;
		}
		if(sum == n)
			System.out.println(n+" is Armstrong Number");
		else
			System.out.println(n+" is not Armstrong Number");

	}
	
	public static void perfectNumber(int n)
	{
		int sum = 0;
		for(int i=0; i<n; i++)
		{
			if(sum == n)
			{
				System.out.println("Inputed Number is a PERFECT Number : "+sum);
				return;
			}
			sum += i;
		}
		
	}
	
	public static void leapYear(int year)
	{
		if(year%400 == 0)
		{
			System.out.println("Leap year by 400");
		}
		else if(year%100 == 0)
		{
			System.out.println("Not a Leap Year 100");
		}
		else if(year % 4 == 0)
			System.out.println("Leap year by 4");
		else
			System.out.println("Not a Leap Year 100");
	}
	
	
	//for pascal triangle
	public int factorial(int n)
	{
		if(n==0)
			return 1;
		
		return n*factorial(n-1);
	}
	public static void pascalTriangle()
	{
		/*
				1
			   1 1
			  1 2 1
			 1 3 3 1
			1 4 6 4 1
		*/
		
		int n = 4;
		int i,j;
		OtherPrograms prg = new OtherPrograms();
		
		for(i=0; i<=n; i++)
		{
			for(j=0; j<=n-i; j++)
			{
				System.out.print(" "); // left order space
			}
			
			for( j=0; j<=i; j++)
			{
//				nCr Formula = n!/(n-r)! * r! 
				System.out.print(" "+prg.factorial(i)/(prg.factorial(i-j)*prg.factorial(j)));
			}
			System.out.println("");
		}
	}
	
	public static void palindromeString()
	{
		String str = "121";
		int length = str.length();
		char[] arr_string = new char[length];
		
		String rev_str="";

		while(length>0)
		{
			length--;
//			System.out.println(str.charAt(length));
			arr_string[length] = str.charAt(length); 
		}
		
		for(int value : arr_string)
		{
			rev_str += (char)value;
		}
		
		if(str.equals(rev_str))
			System.out.println(rev_str+" is Plaindrome String");
	}
	
	public static void fibonacciSeries(int input)
	{
		int result=0;
		int first = 0;
		int second = 1;
		
		System.out.print(first+ " " + second+" ");
		for(int i=2; result<input; i++)
		{
			result = first+second; 
			System.out.print(result+" ");
			first = second;
			second = i;
		}

	}
	
	public static void swapTwoNumbers(int a, int b)
	{
		/*
			//using third variable
			int temp=0;
			temp = a;
			a = b;
			b = temp;
		*/
		
		//without using third variable
		a = a+b;
		b = a-b;
		a = a-b;
		
		System.out.println("value of a : "+a+" & b : "+b);
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
			if(max<arr[i])
			{
				max = arr[i];
			}
//			for(int j=i+1; j<arr.length; j++)
//			{
//				if(max < arr[j])
//				{
//					max = arr[j];
//					maxIndex = j+1;
//				}
//			}
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
