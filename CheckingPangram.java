import java.util.Arrays;
class CheckingPangram 
{ 
	public	static void	main(String[] args)	
	{ 
		String word="A quick brown fox jumps over the lazy dog".toLowerCase(); 
			 
		 System.out.println("Sentence is ::	"+word); 
 
		 String current=""; 
		 int count = 0; 
		String[] traversedChar=new String[26]; 

		for(int	i=0;i<word.length();i++) 
		{
			current=word.charAt(i)+"";
			
			if(!current.equals(" ")&& !isDuplicate(current,traversedChar)){
				traversedChar[count++]=current;
			} 
		
		}
		
		System.out.println(Arrays.toString(traversedChar));
		for(int i=0;i<traversedChar.length;i++){
			if(traversedChar[i].equals(" ")){
				System.out.println(word+	" is not anagram"); 
				return ;
			}

		}
		System.out.println(word+	" is anagram"); 
		
	} 

	public static boolean isDuplicate(String ch, String[] traversedChars)
	{
		for(int i=0;i<traversedChars.length;i++)
		{
			if(ch.equals(traversedChars[i]))
			{
				return true;
			}

		}
		return false;
	}
	
}
