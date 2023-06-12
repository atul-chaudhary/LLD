package com.atul.parkingLot.modal;

public class Vehicle {
    String id;
    String vehicleNumber;
    ParkingSlot parkingSlot;
    VehicleType vehicleType;
    String color;

    public Vehicle(String id, String vehicleNumber, ParkingSlot parkingSlot, VehicleType vehicleType, String color) {
        this.id = id;
        this.vehicleNumber = vehicleNumber;
        this.parkingSlot = parkingSlot;
        this.vehicleType = vehicleType;
        this.color = color;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public ParkingSlot getParkingSlot() {
        return parkingSlot;
    }

    public void setParkingSlot(ParkingSlot parkingSlot) {
        this.parkingSlot = parkingSlot;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
