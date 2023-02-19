public class PrintingUniqueLetters
{
	public static void main(String args[])
	{
		
		String str="A quick brown fox jumps over the lazy dog".toLowerCase();
		System.out.println("Enterd word is:: "+str);
		char current=' ';
		String newStr=null;
		int count=0;
		
		for(int i=0;i<str.length();i++)
		{
			count=0;
			newStr="";
			current=str.charAt(i);
			for(int j=0;j<str.length();j++)
			{
				if(str.charAt(j)==current)
				{
					count++;
				}
			}
			 if(i==0){
					System.out.print("Unique Characters are:: ");
				 }
			 if(count==1){
				System.out.print(current);
				if(i!=str.length()-2){
					System.out.print(" , ");
				}
			 }
		}
	}

}