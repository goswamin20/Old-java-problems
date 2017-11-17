package com.util;

import java.util.List;
import java.util.Map;

import com.bean.ParkingSlot;
import com.bean.Vehicle;
import com.exception.ParkingFullException;
import com.exception.VehicleNotFoundException;
import com.impl.ParkingSystemImpl;


public class Client {

	public static void main(String[] args) {
		ParkingSystemImpl p= new ParkingSystemImpl();
		try {
			Map<ParkingSlot, List<Vehicle>> map=p.parkVehicle("Vehicle.txt", "ParkingSlot.txt");
			System.out.println(map);
			List<Vehicle> c = p.getVehicleInLane(map, 201);
			System.out.println(c);
			int b = p.locateVehicle(map,1007);
			System.out.println(b);
			Vehicle v = p.removeVehicle(map, 1007);
			System.out.println(v);
			System.out.println(map);
		} catch (ParkingFullException e) {
		
			e.printStackTrace();
		} catch (VehicleNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}