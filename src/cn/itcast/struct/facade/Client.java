package cn.itcast.struct.facade;
/**
 * 客户端通过门面调用各个子系统
 * */
public class Client {
	public static void main(String[] args) {
		Facade facede = new Facade();
		facede.testSystemA();
		facede.testSystemB();
		facede.testSystemC();
		
	}
	
}
