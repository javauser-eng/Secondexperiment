#  2020322086 郑强 计G202 
# Java-LabReport
## 一.实验目的

+ 1.初步了解分析系统需求，从学生选课角度了解系统中的实体及其关系，学会定义类中的属性以及方法；
+ 2.掌握面向对象的类设计方法（属性、方法）；
+ 3.掌握类的继承用法，通过构造方法实例化对象；
+ 4.学会使用super()，用于实例化子类；
+ 5.掌握使用Object根类的toString（）方法,应用在相关对象的信息输出中。

## 二.业务要求  

### 说明：
学校有“人员”，分为“教师”和“学生”，
教师教授“课程”，学生选择“课程”。  
从简化系统考虑，每名教师仅教授一门课程，每门课程的授课教师   &emsp;  
也仅有一位，每名学生选仅选一门课程。

## 三.实验设计

1.创建了Personnel类，并设置了多种不同的对象；
```
class Personnel { 
 private String number; 
 private String name; 
 private String sex; 
 private int age; 
```
2.运用Get,Set方法实现值得传递关系； 
```
public String getNumber() { 
 return number; 
 } 
 public void setNumber(String number) { 
 this.number = number; 
 } 
```
3.运用extends关键字额外创建了Personnel类的子类Student类和Teacher类。
&emsp;在继承父类方法的基础上，创建了course对象(课程)和taeching对象(授课)；
```
class Student extends Personnel{ 
 String course; 
```
```
class Teacher extends Personnel{ 
 String teaching; 
```
4.创建了Secourse类(选课)实现课程；
```
class Secourse{ 
 String name; 
 private String coursenumber; 
 private String coursename; 
 private String place; 
 private String time; 
 private String teacher; 
 String [] a= {"java","java web","人文素养"}; 
```
5.创建了xuanke(选课),tuike(退课)类实现学生选课和退课操作；
```
public void xuanke(String name){
		Student xuesheng=new Student();
    public void xuanke(String name){
	    if(xuesheng.getNumber()=="") {
	    }
	    else  {
	    	System.out.println("");
	    }
	}
	public void tuike(String name) {
		Student xuesheng=new Student();	
    -------------------------------
	}
```
## 三.核心方法  
1.  这里调用Stuentds类中的对象；
```
public class Test{
	private static String name;
	public static void main(String args[]){
		Student xs= new Student();
		Secourse c=new Secourse();
		xs.setNumber("2020322111");
		xs.setName("小明");
		xs.setSex("男");
		xs.setAge(23);
```
2.  调用Teacher类中的对象；
```
Teacher js= new Teacher();
		js.setNumber("132123");
		js.setName("大明");
		js.setSex("男");
		js.setAge(34);
```  
3.调用xunke类,tuike类中的对象；
```
c.xuanke(name);
c.tuike(name);
```
4.由这里进行输出；
```
System.out.println("学生编号:"+xs.getNumber());
System.out.println("学生姓名:"+xs.getName());
```
## 四.实验结果  
```

```  
## 五.实验感想  
1.通过这次实验我学习了public、private两种修饰符的作用区域；  
2.练习了构建方法；  
3.练习了多种类型的定义；  
4.练习了包外调用。
