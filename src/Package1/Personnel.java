package Package1;

class Personnel {
	private String number;
	private String name;
	private String sex;
	private int age;
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}
class Student extends  Personnel{
	String course;

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}
	}
class Teacher extends Personnel{
	String teaching;

	public String getTeaching() {
		return teaching;
	}

	public void setTeaching(String teaching) {
		this.teaching = teaching;
	}
}
class Secourse{
	 String name;
	private String coursenumber;
	private String coursename;
	private String place;
	private String time;
	private String teacher;
	String [] a= {"java","java web","人文素养"};
	public  String getNumber() {
		return coursenumber;
	}
	public void setCoursenumber(String coursenumber) {
		this.coursenumber = coursenumber;
	}
	public String getCoursename() {
		return coursename;
	}
	public void setCoursename(String coursename) {
		this.coursename = coursename;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getTeacher() {
		return teacher;
	}
	public void setTeacher(String teacher) {
		this.teacher = teacher;
	}	
	public void xuanke(String name){
		Student xuesheng=new Student();
		xuesheng.getName();
		xuesheng.setNumber("2020322111");
		xuesheng.setName("小明");		
		xuesheng.getNumber();
	    if(xuesheng.getNumber()=="2020322111") {
	    	place="综"+601;time="9点40分";
	    	System.out.println("学生姓名："+xuesheng.getName());
	    	System.out.println("学生选择的课程 ："+a[2]);
	    	System.out.println("上课地点："+place+"教室");
	    	System.out.println("上课时间："+time); 	
	    }
	    else  {
	    	System.out.println("你输入的课程有误");
	    }
	}
	public void tuike(String name) {
		Student xuesheng=new Student();
		xuesheng.getName();
		xuesheng.setNumber("2020322111");
		xuesheng.setName("小明");
		xuesheng.getNumber();
		if(xuesheng.getNumber()=="2020322111") {
			System.out.println("学生姓名："+xuesheng.getName());
			System.out.println("你已经退课了，请重新选课");
		}
	}
}