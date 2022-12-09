package javaInterviewProgramQuestion;

import java.io.IOException;

public class LaunchDesktopApplication {

	public static void main(String[] args) throws IOException {
		
		Runtime runtime= Runtime.getRuntime();
		Process pr = runtime.exec("notepad.exe");
		
		runtime.exec("\"C:\\Users\\MANGESH PC\\AppData\\Local\\Postman\\Postman.exe\"");
	}

}
