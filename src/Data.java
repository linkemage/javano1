import java.util.Scanner;

public class Data {
	public Manager manager[]=new Manager[20];
	
	public void UserPswds()
	{
		for (int i = 0; i < manager.length; i++) {
			manager[i] = new Manager();
		}
		manager[0].name="admin1";
		manager[0].passw=111111;
	}
	
	public void menu(){
		System.out.println("1.查看所有管理员账号密码");	
		System.out.println("2.修改密码");			
		System.out.println("请输入相应序号：");	
		Scanner num=new Scanner(System.in);
		int n=num.nextInt();
		switch(n){
			case 1:outpswd(); break;
			case 2:changepswd(); break;
			default: System.out.println("您输入有误，请重新输入");
				menu();
		}
}
	
	public void outpswd(){
		//for (int j = 0; j < manager.length; j++) {
			//manager[0].showMana();
		//}
		String n=manager[0].name;
		int ps=manager[0].passw;
		System.out.println("姓名："+n+"，密码："+ps);
	}
	
	public void login(){
		Scanner upwsd=new Scanner(System.in);
		System.out.println("输入用户名：");
		String us=upwsd.next();
		System.out.println("输入密码：");
		int pw=upwsd.nextInt();
		if(us.equals(manager[0].name)&&pw==manager[0].passw){
			System.out.println("登陆成功");
		}
		else {
			System.out.println("您的用户名或密码不匹配，您没有权限更新管理员信息");
			System.out.println("系统即将退出");
			System.exit(0);
		}
	}
	
	public void changepswd(){
		Scanner user=new Scanner(System.in);
		System.out.println("输入用户名：");
		String u=user.next();
		System.out.println("输入密码：");
		int p=user.nextInt();
		/*String user1="admin1";
		String user2="admin2";	
		int pwd1=111111;
		int pwd2=222222;*/
		if(u.equals(manager[0].name)&&p==manager[0].passw){
			System.out.println("输入新密码：");
			int np=user.nextInt();
			manager[0].passw=np;
			System.out.println("修改密码成功，您的新密码为："+np);
		}
		else {
			System.out.println("您的用户名或密码错误，请重新输入");
			changepswd();
		}
}

}
	