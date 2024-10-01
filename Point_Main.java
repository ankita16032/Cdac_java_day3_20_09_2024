package day3_23_09_2024;

public class Point_Main {

	public static void main(String[] args) 
	{
		Point obj=new Point();
		Point p=new Point();
		obj.Set_Data(12,34);
		p.Set_Data(6,66);
		if(obj.comp() >p.comp())
		obj.show_info();
		else
		p.show_info();
		}
}
