package axisLocator;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelfLocator 
{
	public static void main(String args[])
	{
		
	        String s= "my name is yogesh";
	    
	      String []  s1=s.split(" ");
	      int l=s1.length;
	      System.out.println(l);
	     String rev= "";

	  for(String w: s1)
	{
	         int l1 =w.length();
	         System.out.println(l1);
	        
	      String rev_word="";
	       for(int j=l1-1;j>=0;j--)
	  {
	               
	          rev_word= rev_word+ w.charAt(j);;
              
	 }
	  rev= rev+rev_word+" ";
	
	    }
	  System.out.println(rev);
	    }
	   
	}


