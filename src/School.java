
public class School {
	String schoolName;
	int classNumber;
	int labNumber;
	
	public void showCenter(){
		System.out.println(schoolName+ "实验中心\n" + "配备："+ classNumber + "间教室" + labNumber + "间机房");
	}
	
	public void data(){
		int num=0;	
		School Num[] = new School[50];
		for(int i=0;i<Num.length;i++){
			Num[i]=new School();
		}
		Num[0].schoolName="电子技术";
		Num[0].classNumber=3;
		Num[0].labNumber=2;		
	}
}