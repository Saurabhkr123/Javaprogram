package myProject;

abstract public class Animal {
	public abstract void Animal_sound();
	public void sound()
	{
		System.out.println("This is method in abstract class");
	}
}
class Dog extends Animal
{
	public void Animal_sound()
	{
		System.out.println("It barks like Bow...Bow");
	}

	public static void main(String[] args) {
		Dog d = new Dog();
		d.Animal_sound();
		d.sound();

	}

}
