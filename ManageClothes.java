package storefront;

import java.util.ArrayList;
import java.util.Scanner;

public class ManageClothes {
	ArrayList<ManageClothes> DeptsList = new ArrayList<>();
	ArrayList<CustomerOrder> customerorder = new ArrayList<>();
	ManageClothes Depts;
	public CustomerOrder CustomerOrder;
	public int SelcectDept;
	
	public ManageClothes() {
		
	}
	Scanner bp=new Scanner(System.in);
	
	public void bp() {
		System.out.println("Enter number Dept add in menu");
		int n=Integer.parseInt(bp.nextLine());
		for (int i = 0; i < n; i++) {
			storefront.Depts Dept = new storefront.Depts();
			Depts.input();
			DeptsList.add(Depts);
			
		}
	}
	public void print() {
		for (int i = 0; i < DeptsList.size(); i++) {
			System.out.println((i+1)+"."+DeptsList.get(i).detail());
		}
	}
	public void Price() {
		float PriceClothes=0;
		float TotalPayment=0;
		int number;
		CustomerOrder customer = new CustomerOrder();
		customer.input();
		for (int i = 0; i < 10; i++) {
			System.out.println("Select Dept "+(i+1));
			SelcectDept = bp.nextInt();
			if(SelcectDept==0) {
				customer.setTotalpayment(TotalPayment);
				System.out.println("Total Payment");
				System.out.println("Totalpayment");
				System.out.println("Thank you,see you again");
				break;
			}else {
				System.out.println("Enter number");
				number=bp.nextInt();
				ManageClothes Clothes = Clotheslist.get(SelcectDept-1);
				customer.setDeptList(Clothes);
				PriceClothes =Clothes.Price*number;
				}
			TotalPayment+=PriceClothes;
			System.out.println("Order finish");
			System.out.println("Payment "+(i+1)+" is:");
			System.out.println(""+PriceClothes);
			System.out.println("Finish Order enter 0");
		}
		
	}
		public void PrintOrder() {
			for(int i = 0; i < customerorder.size(); i++) {
				customerorder.get(i).print();
				
			}
		}
		public void search() {
			Scanner bp=new Scanner(System.in);
			String Idtable;
			int up=0;
			System.out.println("Enter table number payment: ");
			Idtable =bp.nextLine();
			for (int i = 0; i < customerorder.size();  i++) {
				if (customerorder.get(i).getIdtable().equalsIgnoreCase(Idtable)) {
					customerorder.get(i).print();
					up++;
				}
			}	
			if(up==0) {
				System.out.println("No table number "+Idtable);
			}
		}
		public String EditName() {
			System.out.println("Enter name edit:");
			return bp.nextLine(); 
		}
		public float EditPrice() {
			System.out.println("Enter price edit:");
			return bp.nextFloat(); 
		}
		public void EditClothes() {
			String nameDept;
			int up=0;
			System.out.println("Enter name of department to fix");
			nameDept =bp.nextLine();
			for (int i = 0; i < DeptsList.size(); i++) {
				if (DeptsList.get(i).getName().equals(nameDept)) {
					up++;
					DeptsList.get(i).setName(EditName());
					DeptsList.get(i).setPrice(EditPrice());
					break;
				}
			}if(up==0) {
				System.out.println("no Dept name is  "+nameDept);
			}
		}
		public void DeleteDept() {
			String deletedept;
			int up=0;
			System.out.println("Enter name dept to delete");
			deletedept=bp.nextLine();
			for (int i = 0; i < DeptsList.size(); i++) {
				if (DeptsList.get(i).getName().equals(deletedept)) {
					up++;
					DeptsList.remove(i);
					System.out.println("delete finish");
					break;
				}
			}if(up==0) {
				System.out.println("no Dept name is  "+deletedept);
		}
		
	private int detail() {
		// Select Department section on menu //
		return 0;
	}
	private void input() {
		// Departments of store front  //
		
	}
}
