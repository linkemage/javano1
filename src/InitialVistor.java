import java.util.Scanner;

public class InitialVistor {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Visitor v = new Visitor();		
		System.out.print("������������");
		v.name = input.next();			
		System.out.print("���������䣺");
		v.age = input.nextInt();		
		v.show();                       
	}
}
