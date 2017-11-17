package javanewfeatures;

public class EnumDemo1 {
	 enum Mango {
			Jonathan(8), GoldenDel(10), RedDel(6),Winesap(7),Cortland(10);
			private int price;
			Mango(int p){
				price= p;
			}
			Mango(){
				price=-1;
			}
			int getPrice(){
				return price;
			}
	
	public static void main(String[] args) {
		System.out.println("GoldenDel : "+Mango.GoldenDel.getPrice());
		for(Mango i:Mango.values()){
			System.out.println(i+" "+i.getPrice());
		}
	}

}
}