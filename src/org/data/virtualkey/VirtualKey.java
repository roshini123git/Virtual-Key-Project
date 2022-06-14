package org.data.virtualkey;

import org.data.virtualkey.screens.WelcomeScreen;

public class VirtualKey {
  public static void main(String []args) {
	  WelcomeScreen welcome = new WelcomeScreen();
	  welcome.welcomeNote();
	  welcome.getInput();
  }
}
