//write a program create MyTest class create 3 parameterized constructor
	//1.Pass 3 integer
	//2.pass 2 string value
	//3. 1 float value
package day3_23_09_2024;

public class TestMain {

		public static void main(String[] args)
		{
			Test T1=new Test(2,5,7);
			T1.show_data();
			Test T2=new Test("Shweta","Ankita");
			T2.show_data();
			Test T3=new Test(2.5f);
			T3.show_data();
			
		}
}


