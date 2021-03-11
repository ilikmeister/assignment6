package assignment6;

class Director {
	
	public void makeEngine(Builder builder) {
		builder.setEngine("engine");
		builder.setSeats(10);
	}
}

public interface Builder {
	
	public void reset();
	public String getType();
	public String getEngine();
	public void setEngine(String str);
	public void setSeats(int seats);
	
}

class Car implements Builder {
	
	private Car car;
	private String engine;
	private int seats;

	public void reset() {
		Car car = new Car();
	}

	public String getType() {
		return "car";
	}

	public String getEngine() {
		return this.engine;
	}

	public void setEngine(String engine) {
		 this.engine = engine;
	}

	public void setSeats(int seats) {
		this.seats = seats;
	}
	
}

class Plane implements Builder {
	
	private Plane plane;
	private String engine;
	private int seats;

	public void reset() {
		this.plane = new Plane();
	}

	public String getType() {
		return "plane";
	}

	public String getEngine() {
		return engine;
	}

	public void setEngine(String engine) {
		this.engine = engine;
	}

	public void setSeats(int seats) {
		this.seats = seats;
		
	}

}

class Test3 {
	
	public static void main(String[] args) {
		
		Director director = new Director();
		Car car = new Car();
		director.makeEngine(car);
		Plane plane = new Plane();
		director.makeEngine(plane);
		System.out.println(car.getEngine());
		System.out.println(plane.getEngine());
		
	}
	
}
