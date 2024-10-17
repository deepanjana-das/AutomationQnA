package PGM;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

import javax.print.attribute.standard.MediaSize.NA;

import hashmap.hashmap;

public class Demo1 {
	
	private static Map<Integer, Long> fibCache = new HashMap<>();
	
	// Fibonacci series print //
	public static long fibonacci(int n)
	{	
		if (n <= 1) {
			return n;
		}
		
		if (fibCache.containsKey(n)) {
			return fibCache.get(n);
		}
		
		long result = fibonacci(n-1) + fibonacci(n-2);
		
		fibCache.put(n,  result);
		
		return result;
		
	}
	// Factorial Value print //
	public static int fact(int n) {
		if (n <= 1) {
			return 1;
		}
		
		return n * fact(n-1);
	}

	// armstrong number checking//
	
	public static boolean armstrong(int n) {
		
		int sum =0; 
		int n1=n;
	    
		while (n>0)
		{
			int rem= n%10;
			sum = sum+(rem*rem*rem);
			n=n/10;
			
		}
		if (n1 == sum)
		{
			System.out.println("number is armstrong");
		    return true;
		
		}
		else
		{			
			System.out.println("number is not armstrong");
			return false;
		}
	}
	// palindrome number checking//
	
	public static boolean palindrome(int n) {
		
		int sum =0; 
		int n1=n;
	    
		while (n>0)
		{
			int rem= n%10;
			sum = rem+(sum*10);
			n=n/10;
			
		}
		if (n1 == sum)
		{
			System.out.println("number is palindrome");
		    return true;
		
		}
		else {
			System.out.println("number is not palindrome");
			return false;
		}
	}
	
	// palindrome String  checking//
	
	public static boolean palindromeString(String input) {
		
		char c[]=input.toCharArray();
		String output="";
	    for (int i=c.length-1;i>=0;i--)
	    {
	      output=output+c[i];
	    }

		if (input.equals(output))
		{
			System.out.println("string is palindrome");
		    return true;
		
		}
		else {
			System.out.println("string is not palindrome");
			return false;
		}
	}
	
	// krishamurti number checking//
	
	public static boolean krishamurti(int n) {
		
		int sum =0;
		int n1=n;
	    
		while (n>0)
		{
			int rem= n%10;
			sum = sum+fact(rem);
			n=n/10;
			
		}
		if (n1 == sum)
		{
			System.out.println("number is krishamurti");
		    return true;
		
		}
		else {
			System.out.println("number is not krishamurti");
			return false;
		}
	}
	
public static String reverseString(String input) {
		
	  String s1[]=input.split("\\W+");
	  String output="";
      for (int i=s1.length-1;i>=0;i--)
      {
         output=output+s1[i];
         
     	if(i>0) {
    		output = output + " ";
    	}
      }

		return output;
	}

public static String reverseWords(String input) {
	
	  String s1[]=input.split("\\W+");
	  String output="";
    for (int i=0;i<s1.length;i++)
    {
    	for (int j=s1[i].length()-1;j>=0;j--)
    	{
    		output=output+s1[i].charAt(j);
    	}
    	if(i+1 != s1.length) {
    		output = output + " ";
    	}
       
    }
     output = output + ".";
		return output;
	}
public static void arraySwap() {
	
	  String s1[]={"White", "Black"};
	  String s2[]={"blue", "green"};
	  
	  String temp = "";
	    if (s1.length==s2.length)
	    {
		  for (int index=0;index<s1.length;index++)
		  {

			  temp = s1[index];
			  s1[index]=s2[index];
			  s2[index]=temp;
			 
		  }
	        System.out.println("Post swapping, first Array is :");
			for (int i=0;i<s1.length;i++)
			{
				System.out.println(s1[i]);
			}
			System.out.println("Post swapping ,second Array is :");
			for (int i=0;i<s2.length;i++)
			{
				System.out.println(s2[i]);
			}
	    }else {
	    	System.out.println("arrays are not equal");
	    }

	}

public static void swapInto2IntegersWithoutusing3rdVariable() {
	 
	     int a =12, b= 14;
	     
	     a=a+b-(b=a);
	//     b=a-b;
	 //    a=a-b;
         System.out.println("Post swapping:: a is :"+a);
         System.out.println("Post swapping:: b is :"+b);
	}

public static void seggregateFunc()

{   
	int a[]= {1,0,1,0,1,0,0,0,1,1,1,0};
	for (int i=0;i<a.length;i++)
	{
		for (int j=i+1;j<a.length;j++)
		{
			if (a[i]>a[j]) {
			int temp=a[i];
			a[i]=a[j];
			a[j]=temp;
			}
		}
    }
	
    for (int i=0;i<a.length;i++)
    {
    	System.out.print(a[i]);
    }
	System.out.println("");
}

public static void sortingArray()
{
	
	int temp=0, a[]= {2,7,9,3,6,4};
	for (int i=0;i<a.length;i++)
	{
		for (int j=i+1;j<a.length;j++)
		{
			if (a[i]>a[j]) {
			temp=a[i];
			a[i]=a[j];
			a[j]=temp;
			}
		}
		System.out.print(a[i]);
	}	
	System.out.println("");
}

public static void sortingArraylist()
{
	
	int temp=0;
	
	ArrayList<Integer> list= new ArrayList<>();
	list.add(2);
	list.add(5);
	list.add(9);
	list.add(3);
	list.add(10);
	for (int i=0;i<list.size();i++)
	{
		for (int j=i+1;j<list.size();j++)
		{
			if (list.get(i)>list.get(j)) {
			temp=list.get(i);
			list.set(i, list.get(j));
			list.set(j, temp);
			}
		}	
	}	
	System.out.println(list);
}

public static int vowelOccurance(String word, char letter)
{
	
	int count=0;
	word.toLowerCase();
	char c[]=word.toCharArray();
	ArrayList<Character> vowels= new ArrayList<>(Arrays.asList('a','e','i','o','u'));
	for (int i=0;i<c.length;i++)
	{
		if(c[i]==letter)
		{
		if (vowels.contains(letter))
		{
			count++;			
		}
		continue;
		}
	
      }
	return count;
}

public static HashMap<Character, Integer> allvowelOccurance(String word)
{
	
	int count=0;
	word.toLowerCase();
	char c[]=word.toCharArray();
	HashMap<Character, Integer> map = new HashMap<>();
	ArrayList<Character> vowels= new ArrayList<>(Arrays.asList('a','e','i','o','u'));
	for (int i=0;i<c.length;i++)
	{
		if (vowels.contains(c[i]) )
		{
			if (map.containsKey(c[i]))
			{
				map.put(c[i], map.get(c[i])+1);
			}
			else
			{
				map.put(c[i], 1);
			}
			
		}
		}
	

	return map  ;
}

public static int sumOfIntegersInAlphaNeumericString (String input)
{
	
	input.toLowerCase();
	int sum=0;
	for (int i=0;i<input.length();i++)
	{
      if (Character.isDigit(input.charAt(i)))
      {
    	  sum= sum + Integer.parseInt(input.valueOf(input.charAt(i)));
      }
	}
	return sum  ;
}

public static int lengthOfLongestString(String s) { //abcabcde
	HashSet<Character> set = new HashSet<>();
	int maxLength = 0;
	int i = 0;
	
	for(int j=0; j<s.length(); j++) {
		char currentChar =  s.charAt(j);
		
		while(set.contains(currentChar)) {
			set.remove(s.charAt(i));
			i++;
		}
		
		set.add(currentChar);
		
		maxLength = Math.max(maxLength, j-i+1);
	}
	
	
	return maxLength;
}

	public static void main(String[] args) {
		
		
		long fib =fibonacci(5);
		System.out.println(fib);
		
		int factValue = fact(5);
		System.out.println(factValue);	
		
		boolean armstrongValue = armstrong(154);		
		System.out.println(armstrongValue);
		
		boolean plaindromeValue = palindrome(151);		
		System.out.println(plaindromeValue);
		
		boolean plaindromestring = palindromeString("Madam");		
		System.out.println(plaindromestring);
		
		boolean krishamurtiValue = krishamurti(143);		
		System.out.println(krishamurtiValue);
		
		String reverseline = reverseString("Dee is good");		
		System.out.println(reverseline);
		
		String reversewords = reverseWords("Ram is a good boy.");		
		System.out.println(reversewords);
		
		arraySwap();
		swapInto2IntegersWithoutusing3rdVariable();
		seggregateFunc();
		
		sortingArray();
		sortingArraylist();
		
		int voweloccurance = vowelOccurance("deepanjana", 'e');
		System.out.println(voweloccurance);
		
		HashMap<Character, Integer> allvowelOccurance = allvowelOccurance("Deepanjana");
		System.out.println(allvowelOccurance);
		
		int sumOfIntegersInAlphaNeumericString = sumOfIntegersInAlphaNeumericString("dfJ67R23p11");
		System.out.println(sumOfIntegersInAlphaNeumericString);
		
		System.out.println(lengthOfLongestString("abcde"));
		System.out.println(lengthOfLongestString("abcabcde"));
		System.out.println(lengthOfLongestString("abbcdb"));
	}
	
	
}
