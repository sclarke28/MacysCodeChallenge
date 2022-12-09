package storefront;
import java.util.Scanner;
import java.util.InputMismatchException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Depts{
	public String Name;
	public float Price;
	
	public Depts () {
		this.Name=Name;
		this.Price=Price;      
	}
	public void Depts() {
		// TODO Auto-generated constructor stub
	}
	public void input() {
		Scanner bp=new Scanner(System.in);
		System.out.println("Enter Name Dept");
		Name=bp.nextLine();
		System.out.println("Enter Price Dept");
		Price=bp.nextFloat();
	}
	public void Payment() {
		System.out.println("Price:  "+Price);
	}
	
	public String detail() {
	return Name+"  "+Price;
	}
	public Float getPrice() {
		return Price;
	}
	
	public String getName() {
		return Name;
	}
	public void setName(String Name) {
		this.Name=Name;
	}
	public void setPrice(Float Price) {
		this.Price=Price;
	}

}