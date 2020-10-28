package Package1;

public class Test{
	private static String name;
	public static void main(String args[]){
		Student xs= new Student();
		Secourse c=new Secourse();
		xs.setNumber("2020322111");
		xs.setName("小明");
		xs.setSex("男");
		xs.setAge(23);
		Teacher js= new Teacher();
		js.setNumber("132123");
		js.setName("大明");
		js.setSex("男");
		js.setAge(34);
		Secourse kc= new Secourse();
		kc.setCoursenumber("21321321");
		kc.setCoursename("java");               
		kc.setPlace("综601");
		kc.setTime("9点40分");
		kc.setTeacher("大明");
		System.out.println("学生编号:"+xs.getNumber());
		System.out.println("学生姓名:"+xs.getName());
		System.out.println("性别:"+xs.getSex());
		System.out.println("年龄:"+xs.getAge());
		System.out.println("教师编号:"+js.getNumber());
		System.out.println("教师姓名:"+js.getName());
		System.out.println("性别:"+js.getSex());
		System.out.println("年龄:"+js.getAge());
		System.out.println("课程编号:"+kc.getNumber());
		System.out.println("课程名称:"+kc.getCoursename());
		System.out.println("上课地点:"+kc.getPlace());
		System.out.println("上课时间:"+kc.getTime());
		System.out.println("授课老师:"+kc.getTeacher());
		System.out.println("--------------------------------------------");
		c.xuanke(name);
		System.out.println("---------------------------------------------");
		c.tuike(name);
	}
}