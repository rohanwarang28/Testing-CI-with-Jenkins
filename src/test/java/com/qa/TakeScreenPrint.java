package com.qa;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class TakeScreenPrint extends AccessingElem {

	public static void takeScreenshot(String filename) throws IOException {
		
		System.out.println(filename);
		
		File file=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(file, new File("D:\\my_newworkspace\\Interview_Basics\\Screenshots\\"+filename+".png"));

	 
	}
	
}
