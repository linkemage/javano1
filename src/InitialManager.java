import java.util.Scanner;


public class InitialManager {
	
	
	public static void main(String[] args){	
			Data initial=new Data();
			System.out.println("Ĭ���˺�admin1,���룺111111");
			initial.UserPswds();
			initial.login();
			initial.menu();
		}
}
	
	/*public static void menu(){
		//Data initial=new Data();
		System.out.println("1.�鿴���й���Ա�˺�����");	
		System.out.println("2.�޸�����");			
		System.out.println("��������Ӧ��ţ�");	
		Scanner num=new Scanner(System.in);
		int n=num.nextInt();
		switch(n){
			case 1:initial.outpswd(); break;
			case 2:initial.changepswd(); break;
			default: System.out.println("��������������������");
				menu();
		}
	}*/

	/*public static void showMana(){
		Data initial2=new Data();
		System.out.println("������"+initial2.manager[0].name+"�����룺"+initial2.manager[0].passw);
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