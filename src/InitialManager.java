import java.util.Scanner;


public class InitialManager {
	
	
	public static void main(String[] args){	
			Data initial=new Data();
			System.out.println("默认账号admin1,密码：111111");
			initial.UserPswds();
			initial.login();
			initial.menu();
		}
}
	
	/*public static void menu(){
		//Data initial=new Data();
		System.out.println("1.查看所有管理员账号密码");	
		System.out.println("2.修改密码");			
		System.out.println("请输入相应序号：");	
		Scanner num=new Scanner(System.in);
		int n=num.nextInt();
		switch(n){
			case 1:initial.outpswd(); break;
			case 2:initial.changepswd(); break;
			default: System.out.println("您输入有误，请重新输入");
				menu();
		}
	}*/

	/*public static void showMana(){
		Data initial2=new Data();
		System.out.println("姓名："+initial2.manager[0].name+"，密码："+initial2.manager[0].passw);
	}*/
	/*public static void outpswd(){
		Manager admin=new Manager();
		Manager admin1=new Manager();
		admin.name="admin1";
		admin1.name="admin2";
		admin.passw=111111;
		admin1.passw=222222;
		admin.showMana();
		admin1.showMana();
	}*/