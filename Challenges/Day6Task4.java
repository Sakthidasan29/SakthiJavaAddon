package constructor;More actions

import java.io.*;

class TicketBooking {
	  private int totalSeats = 10;
	    public synchronized void bookTicket(String userName, int seatsRequested) {
	        System.out.println(userName + " is trying to book " + seatsRequested + " seat(s).");
	        try {
	            File f = new File("C:\Users\LENOVO\OneDrive\Documents\ticket");

	            if (f.createNewFile()) {
	                System.out.println("File created: " + f.getName());
	            } else {
	                System.out.println("File already exists.");
	            }

	          
	            FileWriter writer = new FileWriter(f, true); 
	            if (seatsRequested <= totalSeats) {
	                totalSeats -= seatsRequested;
	                writer.write(userName + " successfully booked " + seatsRequested + " seat(s).\n");
	                System.out.println(userName + " successfully booked " + seatsRequested + " seat(s).");
	            } else {
	                writer.write("Sorry " + userName + ", not enough seats available.\n");
	                System.out.println("Sorry " + userName + ", not enough seats available.");
	            }

	            writer.write("Remaining seats: " + totalSeats + "\n");
	            writer.write("------------------------------------------------\n");
	            writer.close();

	        } catch (IOException e) {
	            System.out.println("An error occurred while creating or writing to the file.");
	            System.out.println(e);
	        }

	        System.out.println("Remaining seats: " + totalSeats);
	        System.out.println("------------------------------------------------");
	    }
	}

	
	class UserThread extends Thread {
	    private TicketBooking bookingSystem;
	    private String userName;
	    private int seatsToBook;

	    public UserThread(TicketBooking bookingSystem, String userName, int seatsToBook) {
	        this.bookingSystem = bookingSystem;
	        this.userName = userName;
	        this.seatsToBook = seatsToBook;
	    }

	    public void run() {
	        bookingSystem.bookTicket(userName, seatsToBook);
	    }
	}

public class TestTicketbooking {
    public static void main(String[] args) {
    	 TicketBooking bookingSystem = new TicketBooking();
         UserThread user1 = new UserThread(bookingSystem, "sakthi", 4);
    	 UserThread user2 = new UserThread(bookingSystem, "surya", 3);
    	 UserThread user3 = new UserThread(bookingSystem, ("sanjay", 5);
    	        
    	    user1.start();
    	    user2.start();
    	    user3.start();
    	    }
    	}
