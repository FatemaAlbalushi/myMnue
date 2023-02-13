/**
 * 
 */
package myMenu;

import java.util.Scanner;

/**
 * This class is to display the menu to the user with the submenu
 *
 */
public class App {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Application Started");
		//System.out.println();
		
		Menu subMenuAdminAction = new Menu();
		subMenuAdminAction.addMenuitem(new MenuItem(1, "Register Student"));
		subMenuAdminAction.addMenuitem(new MenuItem(2, "Mark Attendence"));
		//subMenuAdminAction.printMenuitem();
		
		MenuItem adminActionMenu1= new MenuItem(1, "Admin action");
		adminActionMenu1.marktheItemAsMenu(subMenuAdminAction);
		
		
        Menu patentMenu = new Menu();
        patentMenu.addMenuitem(adminActionMenu1);
        patentMenu.addMenuitem(new MenuItem(2, "Staff action"));
        patentMenu.addMenuitem(new MenuItem(3, "Exit"));
        patentMenu.printMenuitem();
        
        
        Scanner userInput = new Scanner(System.in);
        System.out.println("Please Enter Your choice: ");
        Integer choice = Integer.parseInt(userInput.nextLine());
        
        
        if (choice==1) {
        	
			patentMenu.getMenuItem(1).menu.printMenuitem();
			
		}
        
        
        System.out.println("Application Ended");
	}

}
