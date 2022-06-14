package org.data.virtualkey.screens;
import java.util.*;

import org.data.virtualkey.listing.DirectoryListing;
import org.data.virtualkey.listing.ScreenListService;
public class WelcomeScreen implements StartScreen {
     
	private String text = "Welcome to VirtualKey";
	private String devName = "Developer : Naveen Kumar Chitturi";
	private ArrayList<String> selectOptions = new ArrayList<String>();
	public WelcomeScreen() {
		selectOptions.add("1. Show Files Directory");
		selectOptions.add("2. Show File Operations Menu");
		selectOptions.add("3. Quit");
	}
	public void welcomeNote() {
		System.out.println(text);
		System.out.println(devName);
		
       this.show();
	}
	public void show() {
		System.out.println("Main Menu");
		 for (String ele : selectOptions)  {
	            System.out.println(ele);
	        }
	}
	public void getInput() {
		int option = 0;
		while((option=this.getOption())!=3) {
			this.goToOptions(option);
		}
		if(option==3) {
			System.out.println("Thank you....");
		}
		
	}
	 private int getOption() {
        Scanner sc = new Scanner(System.in);
        int  selectedOption= 0;
        try {
             selectedOption = sc.nextInt();
        }
        catch (InputMismatchException ex) {

         }
        return selectedOption;

	 }
	 
	 public void goToOptions(int option) {
	        switch(option) {

	            case 1: 
	                this.showFiles();
	                this.show();
	                break;
	                
				
				
				  case 2: 
					  ScreenListService.setCurrentScreen(ScreenListService.FileOperationsScreen);
				      ScreenListService.getCurrentScreen().show();
				      ScreenListService.getCurrentScreen().getInput(); 
				      this.show(); 
				      break;
				 
	              default:
	                System.out.println("Oops! Invalid Option");
	                break;
	        }
	        
	    }
	 public void showFiles() {
		 System.out.println("Presenting the Files list: ");
		 DirectoryListing.showFileList();
	 }
	
}
