package cn.itcast.action.betweenclass.observer;
//抽象观察者角色类
public interface Observer {
	//根据主题的变化，观察者作出反应
	public void update(String state);
}
