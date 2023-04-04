package cn.itcast.action.classstate;

public class ConcreteStateA implements State{

	@Override
	public void handle(String sampleParameter) {
		System.out.println("ConcreteStateA 状态对应的处理行为。。。。" + sampleParameter);
		
	}
	
}
