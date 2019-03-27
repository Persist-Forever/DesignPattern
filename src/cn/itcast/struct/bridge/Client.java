package cn.itcast.struct.bridge;
/**
 * 客户端
 * */
public class Client {
	public static void main(String[] args) {
		DriverManager driverManager = new ConcreteDriverManager();
		
		//调用MysqlDriver
		Driver mysqlDriver = new MysqlDriver();
		driverManager.setDriver(mysqlDriver);
		driverManager.method();

		//调用oracleDriver
		Driver oracleDriver = new OracleDriver();
		driverManager.setDriver(oracleDriver);
		driverManager.method();
				
		//调用db2Driver
		Driver db2Driver = new DB2Driver();
		driverManager.setDriver(db2Driver);
		driverManager.method();
	}
}
