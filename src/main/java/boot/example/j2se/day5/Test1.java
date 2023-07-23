package boot.example.j2se.day5;

abstract class animal {
	public abstract void sound();
}
class Dog extends animal
{
	public void sound()
	{
		System.out.println("Dog is Barking");
	}
}
class Lion extends animal{
	public void sound()
	{
		System.out.println("lion is roaring");
	}
}

 public class Test1

{
	public static void main(String[] args) {
		Dog d=new Dog();
		Lion l=new Lion();
		d.sound();
		l.sound();
	}
}
