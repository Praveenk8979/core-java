package ThreadMethod;

class BookThreaterSeat{
	int total_seats=10;
	synchronized void bookseat(int seats) {
		if(total_seats>=seats) {
			System.out.println(seats +"seats booked successfully");
			total_seats=total_seats-seats;
			System.out.println("Seats left :"+total_seats);
		}else
		{
			System.out.println("Sorry seats connot be booked...!!");
			System.out.println("Seats left :"+total_seats);
		}
	}
}
public class SynchronizationM extends Thread {
	static BookThreaterSeat b;
	int seats;
	public void run()
	{
		b.bookseat(seats);
	}

	public static void main(String[] args) {
		b=new BookThreaterSeat();
		
		SynchronizationM praveen=new SynchronizationM();
		praveen.seats=7;
		praveen.start();
		
		SynchronizationM deepak=new SynchronizationM();
		deepak.seats=5;
		deepak.start();

	}

}
