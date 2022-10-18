
public class ReverseLastWordInString 
{


	public static void main (String args[])
	{
		String s= "i am yogesh Biaradr";
		String[] s1 = s.split(" ");
		int l = s1.length;
		String add1="";
		String add="";
		for(int j=0;j<l;j++)
		{
			if(j==3)
			{
				String word= s1[j];
				//System.out.println(word);
				int l1 = word.length();
				//System.out.println(l1);
				for(int i=l1-1;i>=0;i--)
				{
					char ch=word.charAt(i);
					add1= add1+ch;
					add=add1+" ";
				}
				//				System.out.println(add);
			}
			else if(j==0||j==1||j==2)
			{
				String word1= s1[j];
				add= word1+" ";
			}
			System.out.print(add);
		}
	}

}
