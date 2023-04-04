package cn.itcast.action.betweenclass.observer;

public class ConcreteObserver implements Observer{
	//观察者的状态
	private String Objstate;
	
	@Override
	public void update(String state) {
		Objstate = state;
		System.out.println("观察者的状态为： " + Objstate);
		
	}

}
