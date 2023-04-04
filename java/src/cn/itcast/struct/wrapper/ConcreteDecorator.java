package cn.itcast.struct.wrapper;
/**
 * 具体装饰类，继承装饰类
 * */
public class ConcreteDecorator extends Decorator{

	public ConcreteDecorator(Component component) {
		super(component);
	}
	
	@Override
	public void sampleOperation(){
		super.sampleOperation();
		
		//业务升级代码
		System.out.println("升级业务。。。");
	}

}
