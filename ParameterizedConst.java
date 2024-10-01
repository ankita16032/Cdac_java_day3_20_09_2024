package day3_23_09_2024;

public class ParameterizedConst {

		private
		int a;
		float b;
		
		public
		ParameterizedConst()
		{
			a=25;
			b=2.5f;
		}
		
		ParameterizedConst(int a)
		{
			this.a=a;
		}
		ParameterizedConst(int a, float b)
		{
			this.a=a;
			this.b=b;
		}
		
		void show_data() 
		{
			System.out.println(a);
			System.out.println(b);
		}
}
