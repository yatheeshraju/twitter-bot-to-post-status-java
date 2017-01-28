package com.livingman;

import java.awt.AWTException;
import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import twitter4j.Status;
import twitter4j.StatusUpdate;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;

public class PostATweet {

	public static void main(String[] args) throws TwitterException, InterruptedException, AWTException, IOException {
		DateFormat df = new SimpleDateFormat("dd/MM/yy HH:mm:ss");
		
		
		
		/*postAtext(status);*/
	
while(true){
	Date dateobj = new Date();
File file = new File("screenshot.jpg");
	file.delete();
		    String status="Following #ELEAGUEmajor :Overpass #FNATIC vs #GAMBITGaming : ScreenShots every 30 Sec :"+df.format(dateobj);
		postAPicAndText(status, TakeScreenShot.getScreenshot());
		Thread.sleep(30000);
}
	}
	
	public static void postAtext( String update_status) throws TwitterException{
		Twitter twitter = TwitterFactory.getSingleton();
	    Status status = twitter.updateStatus(update_status);
	    System.out.println("Successfully updated the status to [" + status.getText() + "].");
	}
	public static void postAPicAndText(String message,File file)throws TwitterException{
		
		Twitter twitter = TwitterFactory.getSingleton();
		StatusUpdate status = new StatusUpdate(message);
		status.setMedia(file); // set the image to be uploaded here.
		twitter.updateStatus(status);
	}

}
