package Package1;

public class Test{
	private static String name;
	public static void main(String args[]){
		Student xs= new Student();
		Secourse c=new Secourse();
		xs.setNumber("2020322111");
		xs.setName("С��");
		xs.setSex("��");
		xs.setAge(23);
		Teacher js= new Teacher();
		js.setNumber("132123");
		js.setName("����");
		js.setSex("��");
		js.setAge(34);
		Secourse kc= new Secourse();
		kc.setCoursenumber("21321321");
		kc.setCoursename("java");               
		kc.setPlace("��601");
		kc.setTime("9��40��");
		kc.setTeacher("����");
		System.out.println("ѧ�����:"+xs.getNumber());
		System.out.println("ѧ������:"+xs.getName());
		System.out.println("�Ա�:"+xs.getSex());
		System.out.println("����:"+xs.getAge());
		System.out.println("��ʦ���:"+js.getNumber());
		System.out.println("��ʦ����:"+js.getName());
		System.out.println("�Ա�:"+js.getSex());
		System.out.println("����:"+js.getAge());
		System.out.println("�γ̱��:"+kc.getNumber());
		System.out.println("�γ�����:"+kc.getCoursename());
		System.out.println("�Ͽεص�:"+kc.getPlace());
		System.out.println("�Ͽ�ʱ��:"+kc.getTime());
		System.out.println("�ڿ���ʦ:"+kc.getTeacher());
		System.out.println("--------------------------------------------");
		c.xuanke(name);
		System.out.println("---------------------------------------------");
		c.tuike(name);
	}
}