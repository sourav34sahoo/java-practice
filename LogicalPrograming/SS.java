//1-> FIBONACCI SERIES-----(DONE)
//2->ARMSTRONG NUMBER      (    ) 
//3->PERFECT NUMBER        (    )
//4->PRIME NUMBER -------- (    )
//5->FACTORIAL OF A NUMBER-(Done)
//6->REVERSE A STRING ---- (Done)
//7->REVERSE A NUMBER -----(DONE)
//8->PALINDROME NUMBER ----(DONE)
//9->PALINDROME STRING     (Done)
//10->FIND DUPLICATES CHARACTER IN A STRING (    )

/* 1->Fibonacci Series in which the next turm is sum of the previous two term if 0&1 next ter will be //o + 1 = 1;
class SS
{
	public static void main(String...args)
	{
		int a = 0;
	    int b = 1;
	    int c = 0;
	    System.out.println(a +" "+ b);
		
		for (int i = 0;c < 100;i++)
			{
			 c = a+b;
			 a=b;
			 b=c;
			 System.out.println(c);
			}
	}
} */
/* 7-> Reverse a number, if the Number is 12345 then the output is 54321.like... 
import java.util.*;
class SS
{
	public static void main(String...args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int OriginalNo = sc.nextInt();
		int result =0;
		int no = OriginalNo;
		
		while (no != 0)
		{
			int reminder = no % 10;
			result = result*10+reminder;
			no = no / 10;
		}
		System.out.println("The riverse number is "+result);
	}
} */
/* 8-> Palindrome Number which means, if we have input a number then the riverse of the number is also same ex- if the no is 1331 then the riverse is also same 1331 which is called palindromeNo.
import java.util.*;
class SS
{
	public static void main(String...args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number");
		int OriginalNo =sc.nextInt();
		int result = 0;
		int no = OriginalNo;
		
		while (no != 0)
		{
			int reminder = no % 10;
			result = result*10+reminder;
			no = no / 10;
		}
		System.out.println(result);
		
		if (result == OriginalNo)
		{
			System.out.println(OriginalNo+" is a PalindromeNo");
		}
		else
		{
			System.out.println(OriginalNo+ " is not a PalindromeNo"); 
		}
	}
} */
/*4-> PRIME Number. if a number devieded by 1 or itself then that no is called prime number and the one even prime no is 2 either every prime number should be odd.*/

/*6-> RIVERSE A STRING. if the string is abc then the output of the string is cba.
import java.util.*;
class SS
{
	public static void main(String...args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String inputstr = sc.next();
		char[] ch = inputstr.toCharArray();
		
		for (int i = ch.length-1;i >= 0; --i)
		{
			System.out.print(ch[i]);
		}
	}
}*/
/*9->String palindrome means if we write a string then its riverse is also same like is the string is noon then its riverse is also same noon.

import java.util.*;
class SS
{
	public static void main(String...args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		String inputstr =sc.next();
		String result = "";
		
		char[] ch = inputstr.toCharArray();
		for (int i=ch.length-1;i>=0;i--)
		{
			result = result+ch[i];
			System.out.print(ch[i]);
		}
		if (inputstr.equals(result))
		{
			System.out.print(" is a string palindrome");
		}
		else
		{
			System.out.print(" is not a string palindrome");
		}
	}
}*/
/*5->factorial of a number which means if the number is 5 then its factorial is 1*2*3*4*5 which is 120.

import java.util.*;
class SS
{
	public static void main (String...args)
    {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number");
		int fno=sc.nextInt();
		
		int z=1;
		for (int i=1;i<=fno;i++)
		{
			z=z*i;
			System.out.println(fno+"! = "+z);
		}
	}	
}*/


