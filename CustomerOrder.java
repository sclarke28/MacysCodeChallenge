package storefront;


import java.util.ArrayList;
import java.util.Scanner;


public class CustomerOrder {
	public String Idtable;
	ArrayList<Depts> DeptsList = new ArrayList<Depts>();
	public float TotalPayment;
	public String getIdtable() {
		return Idtable;
	}
	public void setTotalpayment(float Totalpayment) {
		this.TotalPayment=TotalPayment;
	}
	public void input() {
		Scanner bp=new Scanner(System.in);
		System.out.println("number table");
		Idtable =bp.nextLine();
	}
	public void print() {
		System.out.println("--------------------------");
		System.out.println("number table:  "+this.Idtable+" total payment "+this.TotalPayment);
		for(Depts m:this.DeptsList) {
			System.out.println("Selected Food is "+m.Name);
		}
		System.out.println();
	}
	public void search() {
		Scanner bp=new Scanner(System.in);
		String Idtable;
		int up=0;
		System.out.println("Enter table number payment: ");
		Idtable =bp.nextLine();
		for (int i = 0; i < customerorder.size;  i++) {
			
		}
	}
}
