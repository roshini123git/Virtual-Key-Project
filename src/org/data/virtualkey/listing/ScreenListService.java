package org.data.virtualkey.listing;
import org.data.virtualkey.screens.*;
public class ScreenListService {
	public static WelcomeScreen WelcomeScreen = new WelcomeScreen();
    public static FileOPerationsScreen FileOperationsScreen = new FileOPerationsScreen();
    
    

    public static StartScreen currentScreen = WelcomeScreen;

    
    public static StartScreen getCurrentScreen() {
        return currentScreen;
    }

    
    public static void setCurrentScreen(StartScreen currentscreen) {
        currentScreen = currentscreen;
    }
}
