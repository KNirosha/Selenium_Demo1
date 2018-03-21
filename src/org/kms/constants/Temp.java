package org.kms.constants;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Temp {
	
	public static void main(String[] args) {
		
		
		try{
			SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMddHHmmss");
			   Date date = new Date();
			   System.out.println(dateFormat.format(date));
		}catch(Exception e){
			e.printStackTrace();
		}
		
		
	}

}
