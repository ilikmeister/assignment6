package assignment6;

import java.util.Scanner;

public abstract class Dialog {
	
	abstract String createString();
	
	
	public String generateString() {
		String str = createString() + " Hello";
		return str;
	}
	
}


class StringDialog  extends Dialog {

	String createString() {
		return "String";
	}

}

class CharDialog extends Dialog {

	String createString() {
		return "char";
	}

}

class Test {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String str = scanner.next();
		Dialog dialog = null;
		if(str.equals("string")) {
			dialog = new StringDialog();
		}
		else if(str.equals("char")) {
			dialog = new CharDialog();
		}
		System.out.println(dialog.createString());
		
	}
	
}