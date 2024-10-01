package day3_23_09_2024;

public class Point {

	
		private int a;
		private int b;
		private int c;
		
		public
		void Set_Data(int x,int y)
		{
			a=x;
			b=y;
			c=a+b;
		}
		void show_info()
		{
			System.out.println("A="+a);
			System.out.println("B="+b);
			System.out.println("C="+c);
			
		}
		//which return value of c
		int comp()
		{
			return(c);
		}
		
}



