import java.util.Scanner;

public class Visitor {
	String name;	//姓名
	int age;		//年龄
	//显示信息方法
	public void show(){
		Scanner input = new Scanner(System.in);
		while(!"n".equals(name)){
			if(age>=18 && age<=60){		//判断年龄
				System.out.println(name+ "年龄为"+age+ ",门票价格为20元" );break;
			}				
			else{
				System.out.println(name + "的年龄为："+age+"，门票免费");break;
			}			
		}
		System.out.println("退出程序");
	}
}
