package Abstrations;

abstract class Shapes {
	abstract void draw();
	
	void display() {
		System.out.println("This is a shape");
	}
}
  class Circle extends Shapes{
	  @Override
		void draw() {
			System.out.println("This is a circle");
		}
  }
  class Rectangle extends Shapes{
	  @Override
		void draw() {
			System.out.println("This is a rect");
		}

  }
  public class Shape{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c=new Circle();
		Rectangle r=new Rectangle();
		
		c.draw();
		c.display();
		
		r.draw();
		r.display();

	}
  }

	
	


