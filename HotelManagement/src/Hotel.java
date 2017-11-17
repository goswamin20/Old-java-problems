
public class Hotel {
	public void calculateRoomRent(Guest_Bill g){
		if(g.getMonth().equalsIgnoreCase("november")|| g.getMonth().equalsIgnoreCase("december")||g.getMonth().equalsIgnoreCase("january")||g.getMonth().equalsIgnoreCase("feburary")){
		g.setRoomrent((g.getRoomrent()/2))	;
		}
		else if(g.getMonth().equalsIgnoreCase("april")||g.getMonth().equalsIgnoreCase("may")||g.getMonth().equalsIgnoreCase("june")|| g.getMonth().equalsIgnoreCase("july")||g.getMonth().equalsIgnoreCase("august")){
			g.setRoomrent((g.getRoomrent()/5))	;
		}
		else if(g.getMonth().equalsIgnoreCase("sept")||g.getMonth().equalsIgnoreCase("oct")){
			g.setRoomrent((g.getRoomrent()/10))	;	
		}
		
	}
	public void calculateFood(Guest_Bill g){
		if(g.getMonth().equalsIgnoreCase("november")|| g.getMonth().equalsIgnoreCase("december")||g.getMonth().equalsIgnoreCase("january")||g.getMonth().equalsIgnoreCase("feburary")){
			g.setFood((g.getFood()/5))	;
			}
			else if(g.getMonth().equalsIgnoreCase("april")||g.getMonth().equalsIgnoreCase("may")||g.getMonth().equalsIgnoreCase("june")|| g.getMonth().equalsIgnoreCase("july")||g.getMonth().equalsIgnoreCase("august")){
				g.setFood((g.getFood()/10))	;
			}
			else if(g.getMonth().equalsIgnoreCase("sept")||g.getMonth().equalsIgnoreCase("oct")){
				g.setFood((g.getFood()/20))	;	
			}	
	
	}
	public double calculateNet(Guest_Bill g1){
		Hotel h= new Hotel();
		h.calculateFood(g1);
		h.calculateRoomRent(g1);
		double d= g1.getFood()+g1.getRoomrent(); 
		return d;
		}
	
	public static void main(String[] args) {
	Guest_Bill g1= new Guest_Bill("akriti","april",5000.00,1000.00);
	Hotel h= new Hotel();
	
	double d = h.calculateNet(g1);
	System.out.println(d);
}
}
