package cn.itcast.struct.bridge;

public abstract class DriverManager {
	private Driver driver;
	
	public  void method(){
		driver.method();
	}

	public Driver getDriver() {
		return driver;
	}

	public void setDriver(Driver driver) {
		this.driver = driver;
	}

}
