package variables;

public class Student {
//to define a global variable or instance variable
	String name;
	int age;// global variable
	float num;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s= new Student();
		
		s.name="prasad";
		s.num=25;
		s.age=22;
		System.out.println(s.name);
		System.out.println(s.num);
		System.out.println(s.age);

	}

}
