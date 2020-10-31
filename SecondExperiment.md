#  2020322086 郑强 计G202 
# Java-LabReport
## 一.实验目的

+ 1.初步了解分析系统需求，从学生选课角度了解系统中的实体及其关系，学会定义类中的属性以及方法；
+ 2.掌握面向对象的类设计方法（属性、方法）；
+ 3.掌握类的继承用法，通过构造方法实例化对象；
+ 4.学会使用super()，用于实例化子类；
+ 5.掌握使用Object根类的toString（）方法,应用在相关对象的信息输出中。

## 二.实验要求
1.编写上述实体类以及测试主类（注意类之间继承关系的适用）  
2.在测试主类中，实例化多个类实体，模拟学生选课操作、打印课程信息（  
&emsp;信息包括：编号、课程名称、上课地点、时间、授课教师 等）；    
&emsp;模拟学生退课操作，再打印课程信息。

## 三.业务要求  
1.学校有“人员”，分为“教师”和“学生”，
&emsp;教师教授“课程”，学生选择“课程”。    
2.从简化系统考虑，每名教师仅教授一门课程，每门课程的授课教师   
&emsp;也仅有一位，每名学生选仅选一门课程。

## 四.实验设计

1.创建了Personnel类，并设置了多种不同的对象；
```
class Personnel { 
 private String number; 
 private String name; 
 private String sex; 
 private int age; 
```
2.运用Get,Set方法实现值的传递关系； 
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
## 五.核心方法  
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
## 六.实验结果及流程图  

https://github.com/javauser-eng/Secondexperiment/blob/main/Experimental%20results.png  
https://github.com/javauser-eng/Secondexperiment/blob/main/Experimental%20flow%20chart.png

## 七.实验感想  
1.通过这次实验我学习了子类继承的方法运用；  
2.加深了构建方法的理解学习；  
3.练习了get,set方法；  
4.学习了传值和if、else方法。
