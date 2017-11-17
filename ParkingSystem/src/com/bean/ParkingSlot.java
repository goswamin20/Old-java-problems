package com.bean;

public class ParkingSlot {
	@Override
	public String toString() {
		return "ParkingSlot [price=" + price + ", slotLaneNo=" + slotLaneNo
				+ "]";
	}

	private int slotLaneNo;
	private int price;
	

	public int getSlotLaneNo() {
		return slotLaneNo;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + slotLaneNo;
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
		ParkingSlot other = (ParkingSlot) obj;
		if (slotLaneNo != other.slotLaneNo)
			return false;
		return true;
	}

	public void setSlotLaneNo(int slotLaneNo) {
		this.slotLaneNo = slotLaneNo;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

}
