package programPractice;

public class MinValueOfDataType {

	public static void main(String[] args)
	{
       /* what is the value of doubleMin
        * 
       
        */
		System.out.println(Double.MIN_VALUE);// 4.9 E-324
		System.out.println(Float.MIN_VALUE); // 1.4 E-45
		System.out.println(Math.min(Double.MIN_VALUE, 0.0d));
		System.out.println(Math.min(Float.MIN_VALUE, 0.0d));
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Math.min(Integer.MIN_VALUE, 0));
	}

}
