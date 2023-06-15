package com.atul.bookMyShow.model;

public class Seat {
    int seatId;
    int seatNumber;

    public Seat(int seatId, int seatNumber) {
        this.seatId = seatId;
        this.seatNumber = seatNumber;
    }

    public int getSeatId() {
        return seatId;
    }

    public void setSeatId(int seatId) {
        this.seatId = seatId;
    }

    public int getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
    }
}
