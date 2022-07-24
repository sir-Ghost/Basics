import java.util.Scanner;

public class PatternPrograms {
	public static void main(String[] args)
	{
		/*
		 * Scanner sc = new Scanner(System.in); int input = sc.nextInt();
		 */

//		printStarBlock(input);
//		printNumberSequence(input);
//		printNumberSequenceReverse(input);
//		printIndexPosition(input);
//		printNumberVertically(input);
//		printNumberVerticallyReverse(input);
//		printNumberVerticallyInPath(input);
//		printNumberVerticallyInPathReverse(input);
//		printNumberIncrementOrder(input);
//		printOddNumberIncrementOrder(5);
		
		// 0 1 programs
		
//		printBinaryNumbers(5);
//		printBinaryNumbersReverse(5);
//		printBinaryNumberReverseEvenPostionZero(5);
		
		// Alphabetical pattern
			/*
			 * A = 65
			 * Z = 90
			 * a = 97
			 * z = 122
			 */
//		printSimpleAlphabet();
//		printAlphabets();
//		printAlphabet();
//		printAlphabetReverse();
//		printAlphabetRowDuplicate();
		printAlphabetSequentially();
	}
	
	public static void printAlphabetSequentially()
	{
		/*
			A B C D E 
			F G H I J 
			K L M N O 
			P Q R S T 
			U V W X Y 
		 */
		int temp = 65;
		for(int row=0; row<5; row++)
		{
			for(int col=0; col<5; col++)
			{
				System.out.print((char) temp+" ");
				temp++;
			}
			
			System.out.println("");
		}
	}
	
	
	public static void printAlphabetRowDuplicate()
	{
		/*		 
			E D C B A 
			E D C B A 
			E D C B A 
			E D C B A 
			E D C B A 
		 */
		for(int row='A'; row<'F'; row++)
		{
			for(int col='E'; col>='A'; col--)
			{
				System.out.print((char) col+" ");
			}
			System.out.println("");
		}
	}
	
	public static void printAlphabetReverse()
	{
		/*
			E E E E E 
			D D D D D 
			C C C C C 
			B B B B B 
			A A A A A 
		 */
		for(int row='E'; row>='A'; row--)
		{
			for(int col='A'; col<'F'; col++)
			{
				System.out.print((char) row+" ");
			}
			System.out.println("");
		}
	}
	
	
	public static void printAlphabet()
	{
		/*
		 	A B C D E 
			A B C D E 
			A B C D E 
			A B C D E 
			A B C D E
		 */
		
		for(int row='A'; row<'F'; row++)
		{
			for(int col='A'; col<'F'; col++)
			{
				System.out.print((char) col+" ");
			}
			System.out.println("");
		}
	}

	public static void printAlphabets()
	{
		
		/*
		  	A A A A A 
			B B B B B 
			C C C C C 
			D D D D D 
			E E E E E 
		 */
		for(int row='A'; row<'F'; row++)
		{
			for(int col='A'; col<'F'; col++)
			{
				System.out.print((char) row+" ");
			}
			System.out.println("");
		}
	}
	
	public static void printSimpleAlphabet()
	{
		int alphabet = 65;
		System.out.print((char) 65);
	}
	
	
	
	public static void printBinaryNumberReverseEvenPostionZero(int input)
	{
		/*
		 1 0 1 0 1 
 		 0 0 0 0 0 
		 1 0 1 0 1 
		 0 0 0 0 0 
		 1 0 1 0 1 
		 */
		for(int row=0; row<input; row++)
		{
			for(int col=input; col>0; col--)
			{
				if(row%2 != 0)
					System.out.print("0 ");
				else
					System.out.print((row+col)%2+" ");
			}
			System.out.println("");
		}
	}
	
	public static void printBinaryNumbersReverse(int input)
	{
		/*
		 	1 0 1 0 1 
			0 1 0 1 0 
			1 0 1 0 1 
			0 1 0 1 0 
			1 0 1 0 1
		 */
		
		for(int row=0; row<input; row++)
		{
			for(int col=input; col>0; col--)
			{
				System.out.print((row+col)%2+" ");
			}
			System.out.println("");
		}
	}
	
	
	
	public static void printBinaryNumbers(int input)
	{
		/*
		 	0 1 0 1 0 
			1 0 1 0 1 
			0 1 0 1 0 
			1 0 1 0 1 
			0 1 0 1 0
		 */
		for(int row=0; row<input; row++)
		{
			for(int col=0; col<input; col++)
			{
				System.out.print((row+col)%2+" ");
			}
			System.out.println("");
		}
	}
	
	public static void printOddNumberIncrementOrder(int input)
	{
		for(int row=1; row<=input; row++)
		{
			for(int col=1; col<=input; col++)
			{
				System.out.print(2*(row+col)-3 +" ");
			}
			System.out.println("");
		}
	}
	
	
	
	public static void printNumberIncrementOrder(int input)
	{
		
		/*
		 	1 2 3 4 5 
			2 3 4 5 6 
			3 4 5 6 7 
			4 5 6 7 8 
			5 6 7 8 9
		*/
		for(int row = 1; row <= input; row++)
		{
			for(int col = 1; col <= input; col++ )
			{
				System.out.print(row+col-1+" ");
			}
			System.out.println();
		}
	}
	
	
	public static void printNumberVerticallyInPathReverse(int input)
	{
		int posEven=0;
		int posOdd=0;
		
		for(int row = input; row > 0; row--)
		{
			posOdd = row;
			posEven = input - row + 1;
			
			for(int col = input; col>0; col--)
			{
				if(col%2 == 0) //even
				{ 
					System.out.print(posEven+" ");
				}
				else
				{
					System.out.print(posOdd+" ");
				}
				
				posEven += input;
				posOdd += input;
			}
			System.out.println();
		}
	}
	
	
	
	public static void printNumberVerticallyReverse(int input)
	{
		/*
		
			5 10 15 20 25 
			4 9 14 19 24 
			3 8 13 18 23 
			2 7 12 17 22 
			1 6 11 16 21 
		
		*/
		int num = input;
		
		for(int row=input; row>0; row--)
		{
			num = row;
			for(int col=input; col>0; col--)
			{
				System.out.printf(num+" ");
				num = num + input;	
			}
			System.out.println("");
		}
	}
	
	
	
	
	
	public static void printNumberVerticallyInPath(int input)
	{
		/*
		 	1 '9'10 '1' 11 '9' 20 '1' 21
			2 '7' 9 '3' 12 '7' 19 '3' 22
			3 '5' 8 '5' 13 '5' 18 '5' 23
			4 '3' 7 '7' 14 '3' 17 '7' 24
			5 '1' 6 '9' 15 '1' 16 '9' 25

		 */
		
		int posEven=0;
		int posOdd=0;
		
		for(int i=1; i<=input; i++)
		{
			posEven = i;
			posOdd = input-i+1;
			for(int j=1; j<=input; j++)
			{	
				if(j%2 == 1)
				{
					System.out.print(posEven+" ");	
				}
				else
				{
					System.out.print(posOdd+" ");	
				}
				
				posEven += input;
				posOdd += input;

			}
			System.out.println();
		}
		
		
	}
	
	public static void printNumberVertically(int input)
	{
		int num=1;
		
		for(int row=1; row<=input; row++)
		{
			num = row;
			
			for(int col=1; col<input; col++)
			{
				System.out.printf(num+" ");
				num = num + input;
			}
			
			System.out.println("");
		}
	}
	
	/* OUTPUT where input = 5
	 	1 6 11 16 
		2 7 12 17 
		3 8 13 18 
		4 9 14 19 
		5 10 15 20 

	 */
	
	
	public static void printIndexPosition(int input)
	{	
		for(int row=0; row<input; row++)
		{
			for(int col=0; col<input; col++)
			{
				System.out.print("("+row+"," + col+")	");
			}
			System.out.println('\n');
		}
	}
	
	/* OUTPUT where input = 5
	
	 	(0,0)	(0,1)	(0,2)	(0,3)	(0,4)	

		(1,0)	(1,1)	(1,2)	(1,3)	(1,4)	
		
		(2,0)	(2,1)	(2,2)	(2,3)	(2,4)	
		
		(3,0)	(3,1)	(3,2)	(3,3)	(3,4)	
		
		(4,0)	(4,1)	(4,2)	(4,3)	(4,4)	
		

	 */
	
	
	public static void printNumberSequenceReverse(int input)
	{
		for(int row=0; row<input; row++)
		{
			for(int col=input; col >0; col--)
			{
				System.out.print(col+" ");
			}
			System.out.println("");
		}
	}
	/* OUTPUT where input = 5
	 	5 4 3 2 1 
		5 4 3 2 1 
		5 4 3 2 1 
		5 4 3 2 1 
		5 4 3 2 1 
	 */
	
	
	public static void printNumberSequence(int input)
	{
		for(int row=0; row < input; row++)
		{
			for(int col=1; col <= input; col++)
			{
				System.out.print(col+" ");
			}
			System.out.println("");
		}
	}
	
	/* OUTput where input = 5
		
		1 2 3 4 5 
		1 2 3 4 5 
		1 2 3 4 5 
		1 2 3 4 5 
		1 2 3 4 5 

		
	 */
	
	
	
	
	
	
	
	public static void printStarBlock(int input)
	{
		for(int row=0; row<input; row++)
		{
			for(int col=0; col<input; col++)
			{
				System.out.print("* ");
			}
			System.out.println("");
		}
	}
	/*	OUTPUT where input = 5

	 	* * * * * 
	 	* * * * * 
	 	* * * * * 
	 	* * * * * 
	 	* * * * * 
	 
	  */
}
