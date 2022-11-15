package javaInterviewProgramQuestion;

public class AlphabateStarProgram {

	public static void main(String[] args) {
		/* A
		 * A B
		 * A B C
		 * A B C D
		 * A B C D E
		 */
    //    int alph=97; Start a
    //    int alph=65 ; start A    
          int alph= 49; // start 1
        for(int i=0;i<=4;i++)
        {
        	for(int j=0;j<=i;j++)
        	{
        		System.out.print((char)(alph+j)+" ");
        	}
        	System.out.println();
        }
        /* A
		 * B B
		 * C C C
		 * D D D D
		 * E E E E E
		 */
        int alpha=65 ;
        for(int i=0;i<=4;i++)
        {
        	for(int j=0;j<=i;j++)
        	{
        		System.out.print((char)alpha+" ");
        	}
        	alpha++;
        	System.out.println();
        }
        
	}

}
