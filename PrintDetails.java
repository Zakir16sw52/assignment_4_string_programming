public class PrintDetails 
{
	public static void main(String[] args) 
	{
		 String str="2sezuzaeodf234dfasd13ada123zczq;1252%#@%@)(8";
		int vowels=0;
		int consonant=0;
		int specialChar=0;
		char current = ' ';
		 for(int i=0;i<str.length();i++)
		{
			 current=str.charAt(i);
			if(Character.isLetter(current))
			{	current = Character.toLowerCase(current);
				if(current =='a'||current=='e'||current=='i'||current=='o'||current=='u')
				{
					vowels++;
				}
				else
				{
					consonant++;		
				}
			}
			else if(!Character.isDigit(current)){
				specialChar++;
			}
		}
		System.out.println("The enterd word is :: "+str);
		System.out.println("Number of vowels are:: "+vowels);
		System.out.println("Number of consonats are:: "+consonant);
		System.out.println("Number of special characters are:: "+specialChar);
	}
}
