
public class InitialSchool {
	public static void main(String[] args) {
		School center = new School();
		System.out.println("***��ʼ����Ա����ǰ***");
		center. showCenter();

		center.schoolName = "�����ʵ������";		
		center.classNumber = 10;				
		center.labNumber = 10;				
		System.out.println("\n***��ʼ����Ա������***");
		center.showCenter();
	}
}
