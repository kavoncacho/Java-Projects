import java.io.PrintWriter;

public class Electronics implements Recycleable {

	String name;
	String material;
	double weight;
	double recycleAmount;
	double materialCost;
	
	public Electronics(String name, String material, double weight, double recycleAmount) {
		
		this.name = name;
		this.material = material;
		this.weight = weight;
		recycle(weight, recycleAmount, total);
	}
	
	public double getRecycleAmount() {
		return recycleAmount;
	}
	
	public void reuse() {
		
		System.out.print("This lab is kinda confusing.");
	}
	
	public void recycle(double weight, double recycleAmount, double t0tal) {
		
		materialCost = Aluminum;
		this.recycleAmount =  materialCost * this.weight;
		t0tal = total + this.recycleAmount;
		
	}

	public void createSpreadsheet(PrintWriter pw) {
		
		pw.println(name + "," + material + "," + weight + "," + recycleAmount);
		
	}

}
