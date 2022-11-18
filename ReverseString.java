package net.texala;

import java.util.Scanner ;

public class ReverseString {

	public static boolean isVowel(char ch)
	{
		if(ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O'|| ch == 'U')
		{
			return true ;
		}
		else if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o'|| ch == 'u')
		{
			return true ;
		}
		else
		{
			return false ;
		}
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in) ;
		
		System.out.println("Enter a String: ");
		String str = sc.next() ;
		
		System.out.println("The String contains: ");
		
		for(int i = 0 ; i < str.length() ; i++)
		{
			if(isVowel(str.charAt(i)))
			{
				System.out.println("Vowel : "+str.charAt(i));
			}
			else
			{
				System.out.println("Consonant : "+str.charAt(i));
			}
		}
		sc.close(); 
		
		
//		char [] vowels = new char[str.length()] ;
//		
//		char [] consonants = new char[str.length()] ;
//		
//		int  j = 0 , k = 0 ;
		
		
		
//		for(int vowel : vowels)
//		{
//			System.out.print(vowel+" ");
//		}
//		System.out.println();
//		
//		for(int cons : consonants)
//		{
//			System.out.print(cons+" ");
//		}
		
	}
}
