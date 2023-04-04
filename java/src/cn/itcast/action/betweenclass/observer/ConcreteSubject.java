package cn.itcast.action.betweenclass.observer;
//　具体主题角色类
public class ConcreteSubject extends Subject{
	
	private String state;
	
	public String getState(){
		return state;
	}
	
	public void change(String newState){
		state = newState;
		System.out.println("主题的状态为:" + state);
		//将这个状态通知给各个观察者
		this.notifyObservers(state);
	}
}
