class CheckPalindrome 
{
	public static void main(String[] args) 
	{
		String str="2552";
		String palin="";

		for(int i=str.length()-1;i>=0;i--){
			
			palin+=str.charAt(i);
		}

		if(str.equals(palin)){
			System.out.println(str+" is a palindrome");
		}else{
			System.out.println(str+" is not a palindrome");
		}
	}
}
