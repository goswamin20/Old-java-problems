package Inheritance;

public class SportCar extends Car {
private String AirBallonType;
{System.out.println("Car");}
{System.out.println("bus");}
public String AirBallonType() {
	super.drive();
	AirBallonType =" dfhg";
	return AirBallonType;
	
}
public void display(){
	super.display();
	System.out.println("AirBaloonType"+ this.AirBallonType());
}


}
