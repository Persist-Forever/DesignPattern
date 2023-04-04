package cn.itcast.action.betweenclass.observer;

import java.util.ArrayList;
import java.util.List;

//抽象主题角色类
public class Subject {
	//用来保存注册的观察者对象
	private List<Observer> list = new ArrayList<>();
	
	//注册观察者对象
	public void attach(Observer observer){
		list.add(observer);
		System.out.println("添加了一名观察者");
	}
	
	//删除观察者对象
	public void detach(Observer observer){
		list.remove(observer);
		System.out.println("删除了一名观察者");
	}
	
	//通知所有观察者对象，主题的状态
	public void notifyObservers(String newState){
		for(Observer observer : list){
			observer.update(newState);
		}
	}
	
}
