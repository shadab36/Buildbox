package desktopapp;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;

import java.awt.event.KeyEvent;
import java.io.IOException;

import org.sikuli.script.FindFailed;
import org.sikuli.script.Screen;
import org.testng.annotations.Test;

public class Buildbox {
  
	//public WebDriver driver;		
	@Test	
	public void desktop_app() throws IOException, InterruptedException, FindFailed, AWTException {	
			// launch the desktop application
		
				Runtime.getRuntime().exec("C:\\Program Files (x86)\\Buildbox\\Buildbox.exe");
				Thread.sleep(7000);
				// Using screen class for capture
				Screen screen = new Screen();
				screen.setAutoWaitTimeout(10);
				
				//click on crate new
				screen.doubleClick("create.PNG");
				screen.setAutoWaitTimeout(10);
				screen.click("Name.PNG");
				screen.setAutoWaitTimeout(10);
				// using Robot class for clear by default name 
				
				Robot robot = new Robot();
				robot.keyPress(KeyEvent.VK_CONTROL);
				robot.keyPress(KeyEvent.VK_A);
				robot.keyRelease(KeyEvent.VK_A);
				robot.keyRelease(KeyEvent.VK_CONTROL);
				Thread.sleep(1000);

				robot.keyPress(KeyEvent.VK_CONTROL);
				robot.keyPress(KeyEvent.VK_X);
				robot.keyRelease(KeyEvent.VK_X);
				robot.keyRelease(KeyEvent.VK_CONTROL);
				Thread.sleep(1000);

				// enter name from the keyboard

				String text = "Our New Game";
				StringSelection stringSelection = new StringSelection(text);
				Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
				clipboard.setContents(stringSelection, stringSelection);
				robot.keyPress(KeyEvent.VK_CONTROL);
				robot.keyPress(KeyEvent.VK_V);
				robot.keyRelease(KeyEvent.VK_V);
				robot.keyRelease(KeyEvent.VK_CONTROL);
				
				// on basic setting screen click on drop down aarow button
				screen.click("drop-down-basic.PNG");
				screen.setAutoWaitTimeout(10);
				
				// click on game type drop-down field
				screen.doubleClick("single.PNG");
				screen.setAutoWaitTimeout(10);
				
				//select menu option from menu settings
				screen.click("endless.PNG");
				screen.setAutoWaitTimeout(10);
				
				//mark pause field
				screen.click("pause.PNG");
				screen.setAutoWaitTimeout(10);
				
				// mark info check box field
				screen.click("info.PNG");
				screen.setAutoWaitTimeout(10);
				
				//	//click on forward (arrow) button
				screen.click("frw_button.PNG");
				screen.setAutoWaitTimeout(10);
				
				//click on backward (arrow) button
				
				screen.click("back-button.PNG");
				screen.setAutoWaitTimeout(10);
				
				//select avoidance type game
				screen.click("Avoidance.PNG");
				screen.setAutoWaitTimeout(10);
				
				//click on create button
				screen.click("createbutton.PNG");
				screen.setAutoWaitTimeout(15);
				
				//play game demo
				screen.click("playgame.PNG");
				screen.setAutoWaitTimeout(10);
				
				//click on pop up message 
				screen.click("click_on_ok.PNG");
				screen.setAutoWaitTimeout(10);
				
				//start game
				screen.click("start.PNG");
				screen.setAutoWaitTimeout(10);
				
				//pause game
				screen.click("pausegame.PNG");
				screen.setAutoWaitTimeout(10);

				//click on char menu option
				screen.doubleClick("Characters.PNG");
				screen.setAutoWaitTimeout(10);
				
				//click on objects menu option
				screen.doubleClick("objects.PNG");
				screen.setAutoWaitTimeout(10);
				
				//click on effect options 
				screen.doubleClick("effects.PNG");
				screen.setAutoWaitTimeout(10);
				
				//click on logic options
				screen.doubleClick("logic.PNG");
				screen.setAutoWaitTimeout(10);
				
				//click on labels field
				screen.click("labels.PNG");
				screen.setAutoWaitTimeout(10);
				
				//click on setting button
				screen.click("setting.PNG");
				screen.setAutoWaitTimeout(10);
				
				
				
				screen.click("controller.PNG");
				screen.setAutoWaitTimeout(10);
				
				screen.click("Advertisements.PNG");
				screen.setAutoWaitTimeout(10);
				
				// close setting option all fields
				screen.click("ok_button.PNG");
				screen.setAutoWaitTimeout(10);
				
				//click on tree view 
				screen.doubleClick("treeview.PNG");
				screen.setAutoWaitTimeout(10);
				
				//click on screen 
				screen.doubleClick("homescreen.PNG");
				screen.setAutoWaitTimeout(10);
				
				// click home build 
				screen.doubleClick("build_image.PNG");
				screen.setAutoWaitTimeout(10);
				
				
				// close app
				screen.click("cross-icon.PNG");
				screen.setAutoWaitTimeout(10);
				
                
			
			
			
	  
  }
}
