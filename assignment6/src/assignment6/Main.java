package assignment6;

public class Main {

	public static void main(String[] args) {
		
		DataBase base = DataBase.getInstance();
		base.setString("dwa");
		DataBase base1 = DataBase.getInstance();
		base1.setString("adwads");

	}

}

class DataBase {
	
	private static DataBase instance;
	private String str;
	
	private DataBase() {
		
	}
	
	public static DataBase getInstance() {
		return instance;
	}
	
	public void setString(String str) {
		this.str = str;
	}
	
	public String getStr() {
		return str;
	}
	
}
