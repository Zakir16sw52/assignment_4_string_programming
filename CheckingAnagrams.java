class CheckingAnagrams 
{ 
	public	static void	main(String[] args)	
	{ 
		String word="star".toLowerCase(); 
		String	anagram="rats".toLowerCase();

		 System.out.println("Word is ::	"+word); 
		 System.out.println("Anagram is	::	"+anagram);	
		 char current=' '; 
		 int count1 = 0; 
		 int count2 = 0;

		for(int	i=0;i<word.length();i++) 
		{
			current=word.charAt(i); 
			count1 =0; 
			count2=0;
			for(int k=0;k<word.length();k++) 
			{	
				if(current==word.charAt(k))	
				{
					count2++;	
				} 
			}					  

			for(int	j=0;j<anagram.length();j++)	
			{ 
				if(current==anagram.charAt(j))
				{ 
					count1++; 
				} 
			}
			
			if(count1!=count2 && current!=' ')
			{
				System.out.println(anagram+	" is not anagram of	"+word);		
				return; 
			}

		
		}

		System.out.println(anagram+	" is anagram of	"+word); 
		
	} 
}
