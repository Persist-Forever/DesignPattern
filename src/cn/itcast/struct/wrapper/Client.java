package cn.itcast.struct.wrapper;

public class Client {
	public static void main(String[] args) {
		//具体构建
		Component comp = new ConcreteComponent();
		
		//装饰类
		Component decoretor = new ConcreteDecorator(comp);
		
		//调用装饰后的业务（升级业务）
		decoretor.sampleOperation();
	}
}
