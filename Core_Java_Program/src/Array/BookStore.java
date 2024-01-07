package Array;

public class BookStore {

		String book[]= {"empty","empty","empty","empty","empty"};
		void add(String s) {
			for(int i=0; i<book.length;i++) {
				if(book[i]=="empty") {
					book[i]=s;
					break;
				}
			}
		}
		void remove(String s) {
			for(int i=0; i<book.length;i++) {
				if(book[i]==s) {
					book[i]="empty";
					break;
				}
			}
		}
		void display() {
			for(String i:book) {
				System.out.println(i);
			}
		}

		public static void main(String[] args) {
			BookStore b=new BookStore();
			b.add("C++");
			b.add("C");
			b.add("Java");
			b.add("Python");
			b.add("JavaScript");
			b.display();
			System.out.println("==============================");
			b.remove("C");
			b.display();
	}

}
