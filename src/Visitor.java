import java.util.Scanner;

public class Visitor {
	String name;	//����
	int age;		//����
	//��ʾ��Ϣ����
	public void show(){
		Scanner input = new Scanner(System.in);
		while(!"n".equals(name)){
			if(age>=18 && age<=60){		//�ж�����
				System.out.println(name+ "����Ϊ"+age+ ",��Ʊ�۸�Ϊ20Ԫ" );break;
			}				
			else{
				System.out.println(name + "������Ϊ��"+age+"����Ʊ���");break;
			}			
		}
		System.out.println("�˳�����");
	}
}
