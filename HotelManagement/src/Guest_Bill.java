
public class Guest_Bill {
String guestName;
String month;
double roomrent;
double food;

public Guest_Bill(String guestName, String month, double roomrent, double food) {
	
	this.guestName = guestName;
	this.month = month;
	this.roomrent = roomrent;
	this.food = food;
}
public String getGuestName() {
	return guestName;
}
public void setGuestName(String guestName) {
	this.guestName = guestName;
}
public String getMonth() {
	return month;
}
public void setMonth(String month) {
	this.month = month;
}
public double getRoomrent() {
	return roomrent;
}
public void setRoomrent(double roomrent) {
	this.roomrent = roomrent;
}
public double getFood() {
	return food;
}
public void setFood(double food) {
	this.food = food;
}

}
