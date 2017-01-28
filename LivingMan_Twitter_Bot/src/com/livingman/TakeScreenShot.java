package com.livingman;

import java.awt.AWTException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class TakeScreenShot {
	
	public static File getScreenshot() throws InterruptedException, AWTException, IOException{

	        
	        		 String format = "jpg";
	                 String fileName = "screenShot." + format;
	            Robot robot = new Robot();
	            // Rectangle screenRect = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
	            BufferedImage screenFullImage = robot.createScreenCapture(new Rectangle(0,25,1280,720));
	            ImageIO.write(screenFullImage, format, new File(fileName));
	            File file=new File("screenshot.jpg");
	            return file;
	            
	     
	       
	    }
	}

