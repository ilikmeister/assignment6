package assignment6;

import java.util.Scanner;

public interface GUIDialog {
	
	public void setType(String str);
	public String getType();
	
}

class Dialog2 implements GUIDialog {
	
	String str;
	
	public Dialog2 getDialog() {
		return this;
	}

	public void setType(String str) {
		this.str = str;
		
	}

	public String getType() {
		return this.str;
	}
	 
}

class Showlog implements GUIDialog {

	private String str;
	public Showlog getShowlog() {
		return this;
	}

	public void setType(String str) {
		this.str = str;
	}

	public String getType() {
		return this.str;
	}

}

class Test2 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String str = scanner.next();
		GUIDialog dialog = null;
		
		if(str.equals("dialog")) {
			dialog = new Dialog2();
		} 
		else if(str.equals("showlog")) {
			dialog = new Showlog();
		}
		
		dialog.setType("opentype");
		System.out.println(dialog.getType());
		
	}
	
}