package com.tnsif.multithreading.synchronization;

// Shared Resource
class MovieTicket {
    private int availableSeats = 10;

    // synchronized method
    synchronized void bookTicket(int seats) {
        System.out.println(Thread.currentThread().getName() +
                " is trying to book " + seats + " seats");

        if (availableSeats >= seats) {
            System.out.println("Seats available. Booking in progress...");

            try {
                Thread.sleep(2000); // simulate booking delay
            } catch (InterruptedException e) {
                System.out.println(e);
            }

            availableSeats -= seats;
            System.out.println("Booking successful!");
            System.out.println("Remaining seats: " + availableSeats);
        } else {
            System.out.println("Booking failed! Not enough seats.");
        }
    }
}

// Thread class
class BookingThread extends Thread {
    MovieTicket ticket;
    int seats;

    BookingThread(MovieTicket ticket, int seats) {
        this.ticket = ticket;
        this.seats = seats;
    }

    public void run() {
        ticket.bookTicket(seats);
    }
}

// Main class
public class TestSynchronization {
    public static void main(String[] args) {

        MovieTicket ticket = new MovieTicket(); // shared object

        BookingThread user1 = new BookingThread(ticket, 6);
        BookingThread user2 = new BookingThread(ticket, 8);

        user1.setName("User-1");
        user2.setName("User-2");

        user1.start();
        user2.start();
    }
}

