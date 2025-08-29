package day11;

public class Student {
  int      Sid;
  String sname;
  char grad;
	
  void printStudentDate()
  {
	  System.out.println(sid+" "+sname+" "+grad);
  }
	
  void SetStudentDate(int id, String name,char gr);
  
  {
  Sid=id;
  sname=name;
  grad=gr;
  }  
  
  Student(int id, String name,char gr )
  {

	  Sid=id;
	  sname=name;
	  grad=gr;
  }
  

}