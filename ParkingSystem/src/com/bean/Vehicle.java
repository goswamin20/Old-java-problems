package com.bean;

public class Vehicle {
int price;
	public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
	@Override
	public String toString() {
		return "Vehicle [vehicleId=" + vehicleId + ", vehicleType="
				+ vehicleType + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + vehicleId;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Vehicle other = (Vehicle) obj;
		if (vehicleId != other.vehicleId)
			return false;
		return true;
	}
	private int vehicleId;
	private VehicleType vehicleType;
	
	public int getVehicleId() {
		return vehicleId;
	}
	public void setVehicleId(int vehicleId) {
		this.vehicleId = vehicleId;
	}
	public VehicleType getVehicleType() {
		return vehicleType;
	}
	public void setVehicleType(VehicleType vehicleType) {
		this.vehicleType = vehicleType;
	}
	
	
}
