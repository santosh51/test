package day11;

public class Studentmain {

	public static void main(String[] args) {
		{
			Student stu=new Student();
			
			
			//1)using object reference variables
		/*	stu.sid=101;
			stu.sname="john";
			stu.grad='A';
			
			stu.printStuduntDate();
		
		}*/
			
			//using method
			//stu.setStudentDate(101, "david", 'A');
			//stu.printstudentdate();
			
			//using constructor
			Student stu=new Student(101,"John",'A');
			stu.printstudentdate();
			
			
			
	}

	}
