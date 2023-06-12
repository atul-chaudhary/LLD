package com.atul.parkingLot.service;

import com.atul.parkingLot.modal.ParkingLot;
import com.atul.parkingLot.modal.ParkingSlot;
import com.atul.parkingLot.modal.Vehicle;
import com.atul.parkingLot.modal.VehicleType;

import java.util.*;

public class ParkingService {

    ParkingLot parkingLot;
    Queue<ParkingSlot> queueSlots = new PriorityQueue<>((a, b) -> a.getSlotId() - b.getSlotId());
    Map<Integer, ParkingSlot> parkingSlotMap = new HashMap<>();

    public void addSlots(int numberOfSlots) {
        if (parkingLot == null) {
            List<ParkingSlot> slots = new ArrayList<>();
            for (int i = 1; i <= numberOfSlots; i++) {
                ParkingSlot parkingSlot = new ParkingSlot(i, null, true);
                slots.add(parkingSlot);
                queueSlots.add(parkingSlot);
                parkingSlotMap.put(i, parkingSlot);
            }
            parkingLot = new ParkingLot(slots);
        }
    }

    public void parkCar(String carNumber, String color) {
        Vehicle car = new Vehicle(null, carNumber, null, VehicleType.CAR, color);
        if (!queueSlots.isEmpty()) {
            ParkingSlot parkingSlot = queueSlots.poll();
            parkingSlot.setVehicle(car);
            parkingSlot.setFree(false);
        } else {
            System.out.println("Parking lot is full");
        }
    }


    public void leaveCar(int slotNumber) {
        ParkingSlot parkingSlot = parkingSlotMap.get(slotNumber);
        parkingSlot.setFree(true);
        parkingSlot.setVehicle(null);
        queueSlots.add(parkingSlot);
    }

    public void parkingSlotStatus() {
        for (ParkingSlot slot : parkingLot.getParkingSlots()) {
            System.out.println(slot.getSlotId() + "  " + slot.getVehicle() != null ? slot.getVehicle().getVehicleNumber() + "  " + slot.getVehicle().getColor() : "Slot is free");
        }
    }


    public void getCarNumberAsPerColor(String color) {
        for (ParkingSlot slot : parkingLot.getParkingSlots()) {
            if (slot != null && slot.getVehicle() != null && slot.getVehicle().getColor().equals(color)) {
                System.out.println(slot.getVehicle().getVehicleNumber());
            }
        }
    }

}
