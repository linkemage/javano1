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
		System.out.println("1.�鿴���й���Ա�˺�����");	
		System.out.println("2.�޸�����");			
		System.out.println("��������Ӧ��ţ�");	
		Scanner num=new Scanner(System.in);
		int n=num.nextInt();
		switch(n){
			case 1:outpswd(); break;
			case 2:changepswd(); break;
			default: System.out.println("��������������������");
				menu();
		}
}
	
	public void outpswd(){
		//for (int j = 0; j < manager.length; j++) {
			//manager[0].showMana();
		//}
		String n=manager[0].name;
		int ps=manager[0].passw;
		System.out.println("������"+n+"�����룺"+ps);
	}
	
	public void login(){
		Scanner upwsd=new Scanner(System.in);
		System.out.println("�����û�����");
		String us=upwsd.next();
		System.out.println("�������룺");
		int pw=upwsd.nextInt();
		if(us.equals(manager[0].name)&&pw==manager[0].passw){
			System.out.println("��½�ɹ�");
		}
		else {
			System.out.println("�����û��������벻ƥ�䣬��û��Ȩ�޸��¹���Ա��Ϣ");
			System.out.println("ϵͳ�����˳�");
			System.exit(0);
		}
	}
	
	public void changepswd(){
		Scanner user=new Scanner(System.in);
		System.out.println("�����û�����");
		String u=user.next();
		System.out.println("�������룺");
		int p=user.nextInt();
		/*String user1="admin1";
		String user2="admin2";	
		int pwd1=111111;
		int pwd2=222222;*/
		if(u.equals(manager[0].name)&&p==manager[0].passw){
			System.out.println("���������룺");
			int np=user.nextInt();
			manager[0].passw=np;
			System.out.println("�޸�����ɹ�������������Ϊ��"+np);
		}
		else {
			System.out.println("�����û����������������������");
			changepswd();
		}
}

}
	