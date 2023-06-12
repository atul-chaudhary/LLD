package com.atul.parkingLot.modal;

public class ParkingSlot {
    int slotId;
    Vehicle vehicle;
    boolean isFree;

    public ParkingSlot(int slotId, Vehicle vehicle, boolean isFree) {
        this.slotId = slotId;
        this.vehicle = vehicle;
        this.isFree = isFree;
    }

    public int getSlotId() {
        return slotId;
    }

    public void setSlotId(int slotId) {
        this.slotId = slotId;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public boolean isFree() {
        return isFree;
    }

    public void setFree(boolean free) {
        isFree = free;
    }
}
