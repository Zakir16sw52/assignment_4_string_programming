public class RemoveDuplicates
{
	public static void main(String args[])
	{
		String str="zakir hussain";
		char current=' ';
		String newStr=null;
		System.out.println("Word before removing duplicates: "+str);
		for(int i=0;i<str.length();i++)
		{
			newStr="";
			current=str.charAt(i);
			for(int j=0;j<str.length();j++)
			{
				if(str.charAt(j)!=current)
				{
					newStr+=str.charAt(j);
				}
			}
			 
			newStr=current+newStr;
			str=newStr;
			 
		}
		newStr="";
		for(int i=str.length()-1 ;i>=0;i--){
			newStr+=str.charAt(i);
		}
	System.out.println("Word after removing duplicates: "+newStr);
	}
}