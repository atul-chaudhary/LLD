package com.atul.parkingLot.modal;

import java.util.List;

public class ParkingLot {
    List<ParkingSlot> parkingSlots;

    public ParkingLot(List<ParkingSlot> parkingSlots) {
        this.parkingSlots = parkingSlots;
    }

    public List<ParkingSlot> getParkingSlots() {
        return parkingSlots;
    }

    public void setParkingSlots(List<ParkingSlot> parkingSlots) {
        this.parkingSlots = parkingSlots;
    }
}
