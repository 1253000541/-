package zuoye3;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Exceptions {
	public static void main(String[] args) {
		
		ex();
		
		
	}

	public static  void ex() {
		Scanner in = null;
		
		String s = in.next();
		try {
			Date d = new SimpleDateFormat("yyyy/mm/dd").parse(s);
			String d1 = new SimpleDateFormat("yyyymmdd").format(d);
			
			System.out.println(d1);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
