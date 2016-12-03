
public class HelloWorld {
    public static void main(String[] args){
    	System.out.println("Hello World!");
    	
    	class Student{
    		String name;
    		int age;
    		float score;

    		void manage(){
    		    System.out.println(name+"'s age is: "+age+", score is: "+score);
    		}
    	}

    	Student stu1 = new Student();

    	stu1.age = 23;
    	stu1.name = "Daniel";
    	stu1.score = 48.56f;
    	stu1.manage();
    	
    	String arraydemo[] = {"I", " am", " Daniel", "!"};
    	for (String i:arraydemo){
    		System.out.print(i);
    	}
    }
}
