package cn.itcast.struct.facade;
/**
 * 门面：调用子系统
 * */
public class Facade {
	private SystemA systemA = new SystemA();
	private SystemB systemB = new SystemB();
	private SystemC systemC = new SystemC();
	public void testSystemA(){
		systemA.testA();
	}
	public void testSystemB(){
		systemB.testB();
	}
	public void testSystemC(){
		systemC.testC();
	}
}
