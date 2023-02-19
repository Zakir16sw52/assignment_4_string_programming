public class PrintDuplicates
{
	public static void main(String args[])
	{
		
		String str="zakir hussain";
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
					
				}else{
					newStr+=str.charAt(j);
				}
			}
			 if(i==0){
					System.out.print("Duplicate Characters are:: ");
				 }
			 if(count>=2){
				

				System.out.print(current);
				if(i!=str.length()-2){
					System.out.print(" , ");
				}
			 }
			newStr=current+newStr;
			str=newStr;
			 
		}
	}

}