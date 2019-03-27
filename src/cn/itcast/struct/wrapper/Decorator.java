package cn.itcast.struct.wrapper;
/**
 * 实现组件接口，用组合(委派)的方式传入组件的具体类，调用其原来的方法
 * 
 * 该装饰类给具体装饰类继承
 * */
public class Decorator implements Component {

	private Component component;
	
	public Decorator(Component component) {
		this.component = component;
	}

	@Override
	public void sampleOperation() {
		//调用传统方法
		component.sampleOperation();

	}

}
