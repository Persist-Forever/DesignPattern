package cn.itcast.action.memory.baixiang;

public class Client {
	public static void main(String[] args) {
		Originator ori = new Originator();
		Caretaker caretaker = new Caretaker();
		
		//设置初始状态
		ori.setState("On");
		//创建备忘录保存状态
		caretaker.saveMemento(ori.createMemento());;
		//修改状态
		ori.setState("Off");
		//恢复发起人对象的状态
		ori.restoreMemento(caretaker.retrieveMemento());
		
		System.out.println(ori.getState());
	}
}
