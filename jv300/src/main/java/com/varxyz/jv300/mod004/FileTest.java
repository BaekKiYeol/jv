package com.varxyz.jv300.mod004;

import java.io.File;

public class FileTest {
	   private static final String SAVE_DIR = "C:/temp";
	   public static void main(String[] args) {
	      File saveDir = new File(SAVE_DIR);
	      System.out.println(saveDir.getPath());
	      System.out.println("Window : " + File.separator); // File.separator os 따라서 경로표시값을 바꿔준다.
	   }

	}