package com.impl;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.bean.ParkingSlot;
import com.bean.Vehicle;
import com.bean.VehicleType;
import com.exception.ParkingFullException;
import com.exception.VehicleNotFoundException;

public class ParkingSystemImpl implements ParkingSystem {

	@Override
	public Map<ParkingSlot, List<Vehicle>> parkVehicle(String fileVehicle,
			String fileParkingSlot) throws ParkingFullException {
		Map<ParkingSlot, List<Vehicle>> map= new HashMap<ParkingSlot, List<Vehicle>>();
		BufferedReader br=null;
		BufferedReader br1=null;
		try {
			br= new BufferedReader(new FileReader(fileVehicle));
			br1=new BufferedReader(new FileReader(fileParkingSlot));
			String data;
			String data1;
			List<ParkingSlot>pl= new ArrayList<ParkingSlot>();
			while((data1=br1.readLine())!=null){
				String str1[]=data1.split(":");
				ParkingSlot ps= new ParkingSlot();
				ps.setSlotLaneNo(Integer.parseInt(str1[0]));
				int price=Integer.parseInt(str1[1]);
				ps.setPrice(price);
				pl.add(ps);
				map.put(ps, new ArrayList<Vehicle>());
				}
			List<Vehicle> list= new ArrayList<Vehicle>();
			while((data=br.readLine())!=null){
				String str[]=data.split("-");
				Vehicle v= new Vehicle();
				v.setVehicleId(Integer.parseInt(str[0]));
				v.setVehicleType(VehicleType.valueOf(str[1]));
				list.add(v);
				}
				int count=0;
			for(Vehicle i:list){
			for(ParkingSlot j:pl){
				if(i.getVehicleType()== VehicleType.Bike && j.getPrice()==20){
					if(map.get(j).size()<4){
						map.get(j).add(i);
						count ++;
						break;
					}
				}if(i.getVehicleType()== VehicleType.Car && j.getPrice()==40){
					if(map.get(j).size()<4){
						map.get(j).add(i);
						count++;
						break;
					}
				}if(i.getVehicleType()== VehicleType.Bus && j.getPrice()==60){
					if(map.get(j).size()<4){
						map.get(j).add(i);
						count ++;
						break;
					}
				}if(i.getVehicleType()== VehicleType.Truck && j.getPrice()==50){
					if(map.get(j).size()<4){
						map.get(j).add(i);
						count ++;
						break;
					}
				}
			}
			if(count==list.size()){
				try{
				throw new ParkingFullException();
				}
				catch(ParkingFullException e){
					System.out.println("parking full");
				}
			}
			}

					
				
		} catch (FileNotFoundException e) {
		e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		finally{
			try {
				br.close();
				br1.close();
			} catch (IOException e) {
				
				e.printStackTrace();
			}
		}
		return map;
	}

	@Override
	public List<Vehicle> getVehicleInLane(Map<ParkingSlot, List<Vehicle>> map,
			int slotLaneNo) {
		List<Vehicle> list= new ArrayList<Vehicle>();
		Set<ParkingSlot> s = map.keySet();
		for(ParkingSlot p1:s){
			if(p1.getSlotLaneNo()==slotLaneNo){
				list= map.get(p1);
				System.out.println(list);
			}
		}
	
		return list;}

	@Override
	public int locateVehicle(Map<ParkingSlot, List<Vehicle>> map, int vehicleId)
			throws VehicleNotFoundException {
		Set<ParkingSlot> s=map.keySet();
		for(ParkingSlot p:s){
			List<Vehicle> list= map.get(p);
				for(Vehicle v:list){
					if(v.getVehicleId()==vehicleId){
						return p.getSlotLaneNo();
					}
				}
		}
		throw new VehicleNotFoundException();
		
	}

	@Override
	public Vehicle removeVehicle(Map<ParkingSlot, List<Vehicle>> map,
			int vehicleId) throws VehicleNotFoundException {
		
		Set<ParkingSlot> s=map.keySet();
		for(ParkingSlot p:s){
			List<Vehicle> list= map.get(p);
				for(Vehicle v:list){
					if(v.getVehicleId()==vehicleId){
						list.remove(v);
						return v;
					}
				}
		}
		throw new VehicleNotFoundException();
		
	}

	

}
