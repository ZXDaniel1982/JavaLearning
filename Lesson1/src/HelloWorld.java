import java.util.*;

public class HelloWorld {
	// 全局变量
	String name;
	int age;
	
	HelloWorld(String name1, int age1){
		name = name1;
		age = age1;
		
		System.out.println("Java的世界，我来了！");
	}
	
	void sayHello() {
		System.out.println("Hello, 我的名字叫Daniel");
	}
	
	void introduce() {
		System.out.println("我是新来的软件工程师");
	}
	
    public static void main(String[] args){
    	class Student{
    		String name;
    		int age;
    		float score;
    		
    		void say() {
    			System.out.println(name + "的年龄是 " + age + ", 成绩是 " + score);
    		}
    	}
    	
    	Student stu1 = new Student();
    	
    	stu1.name = "小明";
    	stu1.age = 15;
    	stu1.score = 92.5f;
    	stu1.say();
    	
    	int a = 32;
    	int b = 56;
    	System.out.println(a + "和" + b + "的乘积是 : " + a*b);
    	System.out.println(a + "大于" + b + "的结果是 : " + (a>b));
    	
    	System.out.println("a后自加，结果是 " + (a++));
    	System.out.println("a的值是 " + a);
    	System.out.println("a前自加，结果是 " + (++a));
    	System.out.println("a的值是 " + a);
    	
    	/*int demoArray[] = new int[5];
    	int len = demoArray.length;
    	long total = 0;
    	System.out.println("请输入" + len + "个整数， 以空格为分隔： ");
    	Scanner sc = new Scanner(System.in);
    	for (int i=0; i<len; i++) {
    		demoArray[i] = sc.nextInt();
    	}
    	for (int x : demoArray) {
    		total += x;
    	}*/
    	
    	//System.out.println(len + "个整数的总和是： " + total);
    	
    	String webname = "book-food-fool-tool-pool";
    	System.out.println(webname);
    	webname += "-mood";
    	System.out.println(webname);
    	System.out.println("The length of webname is " + webname.length());
    	System.out.println("The 6th char of webname is " + webname.charAt(6));
    	System.out.println("Is webname contain tool? " + webname.contains("tool"));
    	
    	String newWebname = webname.replace("tool", "hook");
    	System.out.println(newWebname);
    	
    	String strArr[] = newWebname.split("-");
    	System.out.println(Arrays.toString(strArr));
    	
    	String fragment = "qwertyuiopasdfghjklzxcvbnm";
    	
    	// String
    	long timeStartString = System.currentTimeMillis();
    	String strString = "";
    	for (int i=0; i<10000; i++) {
    		strString += fragment;
    	}
    	long timeEndString = System.currentTimeMillis();
    	System.out.println("String方法耗时： " + (timeEndString - timeStartString) + "ms");
    	
    	// StringBuffer多线程
    	long timeStartStringBuffer = System.currentTimeMillis();
    	StringBuffer strStringBuffer = new StringBuffer();
    	for (int i=0; i<10000; i++) {
    		strStringBuffer.append(fragment);
    	}
    	long timeEndStringBuffer = System.currentTimeMillis();
    	System.out.println("StringBuffer方法耗时： " + (timeEndStringBuffer - timeStartStringBuffer) + "ms");
    	
    	// StringBuilder单线程
    	long timeStartStringBuilder = System.currentTimeMillis();
    	StringBuilder strStringBuilder = new StringBuilder();
    	for (int i=0; i<10000; i++) {
    		strStringBuilder.append(fragment);
    	}
    	long timeEndStringBuilder = System.currentTimeMillis();
    	System.out.println("StringBuilder方法耗时： " + (timeEndStringBuilder - timeStartStringBuilder) + "ms");
    	
    	HelloWorld myHello = new HelloWorld("Daniel", 35);
    	System.out.println("介绍下我自己： 我叫" + myHello.name + ", 年龄是" + myHello.age + ".");
    	myHello.sayHello();
    	myHello.introduce();
    }
}
