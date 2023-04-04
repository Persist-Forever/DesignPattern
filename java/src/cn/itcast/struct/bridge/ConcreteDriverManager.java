package cn.itcast.struct.bridge;
/**
 * 具体驱动管理器
 * */
public class ConcreteDriverManager extends DriverManager{

	public void method(){
		super.getDriver().method();
	}
}
