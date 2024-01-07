package com.abstractb;



abstract class Animal {
	
	abstract void sound();
}
 	class Lion extends Animal{

		@Override
		void sound() {
			// TODO Auto-generated method stub
			System.out.println("Roar! Lion");
		}
 		
 	}
 	class Tiger extends Animal
 	{

		@Override
		void sound() {
			// TODO Auto-generated method stub
			System.out.println("Roar! Tiger ");
		}
 		
 	}
 	public class Test{
 		public static void main(String[] args) {
			Lion l=new Lion();
			Tiger t=new Tiger();
			
			l.sound();
			t.sound();
			
					
		}
 		
 	}
