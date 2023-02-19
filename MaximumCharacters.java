public class MaximumCharacters
{
	public static void main(String args[])
	{
		
		String str="A quick brown fox jumps over the lazy dog".toLowerCase();
		System.out.println("Enterd word is:: "+str);
		char current=' ';
		String newStr=null;
		int count=0;
		int max=0;
		char maxCh=str.charAt(0);
		
		for(int i=0;i<str.length();i++)
		{
			count=0;
			newStr="";
			current=str.charAt(i);
			for(int j=0;j<str.length();j++)
			{
				if(str.charAt(j)==current && current!=' ')
				{
					count++;
				}
			}
			  
			 if(count>max){
				 max=count;
				 maxCh=current;
			 }
		}
		System.out.println("Maximum Character is: "+maxCh+" occurence of "+maxCh+" are::"+max);
	}

}