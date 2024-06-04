package simple;

public class Employee {
public void studentdetails(String name) {
	System.out.println(name);
}
public void studentdetails(short age) {
	System.out.println(age);
}
public void studentdetails(int userid) {
	System.out.println(userid);
}
public void studentdetails(char initial) {
	System.out.println(initial);
}
public static void main(String[]args) {
	Employee obj=new Employee();
	obj.studentdetails('M');
	obj.studentdetails(3115);
	obj.studentdetails(22);
	obj.studentdetails("Poorani");
}
}
