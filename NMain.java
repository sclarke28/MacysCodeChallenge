package storefront;
import java.util.ArrayList;
import java.util.Scanner;

public class NMain {

	public static void main(String[] args) {
		ArrayList<Depts> DeptList = new ArrayList<>();
		ManageClothes manageclothes = new ManageClothes();
		int select;
		
		Scanner  bp=new Scanner(System.in);
		do {
			MenuManageClothes();
			select= Integer.parseInt(bp.nextLine());
			switch (select) {
			case 1:
				manageclothes.bp();
				break;
			case 2:				
				manageclothes.print();
				manageclothes.EditClothes();
				break;
			case 3:				
				manageclothes.print();
			    manageclothes.DeleteClothes();
				break;
			case 4:				
				manageclothes.PrintOrder();
				break;
			case 5:				
				manageclothes.search();
				break;
			case 0:				
				System.out.println("back");
				break;
			
			default:
					break;
			}
		} while (select !=3);
		
	}
	static void MenuManageClothes() {
		System.out.println("--------MENU MANAGECLOTHES-------");
		System.out.println("0. Back to menu main");
		System.out.println("1. Add clothes ");	
		System.out.println("2. Edit clothes ");
		System.out.println("3. Delete clothes ");
		System.out.println("4. print info clothes order");	
		System.out.println("5. payment  ");	
		System.out.println("--------------------------");
		System.out.println("select");
	
		
		
		
	}
	static void MenuOrder() {
		System.out.println("--------MENU ORDER--------");
		System.out.println("0. Back to menu main");
		System.out.println("1. Print Clothes List and order");	
		System.out.println("--------------------------");
		System.out.println("select");
	
	
	}
		static void menumain() {
			System.out.println("--------MENU MAIN---------");
			System.out.println("1. Manage Clothes");
			System.out.println("1. Manage Order");
			System.out.println("2. EXIT");
			
			
		}
	}

