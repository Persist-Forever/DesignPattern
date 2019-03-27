package cn.itcast.action.classstate;

public class ConcreteStateB implements State{

	@Override
	public void handle(String sampleParameter) {
		System.out.println("ConcreteStateB 状态对应的处理行为。。。。" + sampleParameter);
		
	}
	
}
