package myProject;

abstract  class Alein {
	public abstract void animalSound();
	public void sleep() {
		System.out.println("ZzzzzzZzzzz");
	}

}
class Man extends Alein{
	public void animalSound() {
		System.out.println("A man Says : Gurr Gurr");
	}
}
   class AbstractClass {
	public static void main(String[] args) {
		Man object = new Man();
		object.animalSound();
		object.sleep();
	}
}
