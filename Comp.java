package myProject;

    class Comp {
	String name;
	String language;
	String city;
	String state;
	
	
	Comp(){
		System.out.println("This is constructor");
		name="Saurabh";
		language="Java";
		city="Motihari";
		state="Bihar";
		
		
	}
}
     class ConstructorInJava {
	public static void main(String[] args) {
		Comp object = new Comp();
		System.out.println(object.name);
		System.out.println(object.language);
		System.out.println(object.city);
		System.out.println(object.state);
		
		
	
}
}
