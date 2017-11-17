package com.impl;

import java.util.List;
import java.util.Map;

import com.bean.ParkingSlot;
import com.bean.Vehicle;
import com.exception.ParkingFullException;
import com.exception.VehicleNotFoundException;

public interface ParkingSystem {
	Map<ParkingSlot,List<Vehicle>> parkVehicle(String fileVehicle,String fileParkingSlot) throws ParkingFullException;
	List<Vehicle> getVehicleInLane(Map<ParkingSlot,List<Vehicle>> map,int slotLaneNo);
	int locateVehicle(Map<ParkingSlot,List<Vehicle>> map,int vehicleId)throws VehicleNotFoundException;
	Vehicle removeVehicle(Map<ParkingSlot,List<Vehicle>> map,int vehicleId) throws VehicleNotFoundException;
		
}
