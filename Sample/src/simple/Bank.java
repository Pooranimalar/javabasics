package simple;

public class Bank extends Sbi{
public  void current() {
	System.out.println("current acc");
}
public void salary() {
	System.out.println("salary acc");
}
public static void main(String[]args) {
	Bank obj=new Bank();
	obj.salary();
	obj.savings();
	obj.current();
}
}
