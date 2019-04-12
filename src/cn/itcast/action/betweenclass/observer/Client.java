package cn.itcast.action.betweenclass.observer;

public class Client {
	public static void main(String[] args) {
        //创建主题对象
        ConcreteSubject subject = new ConcreteSubject();
        //创建观察者对象
        Observer observer = new ConcreteObserver();
        //将观察者对象登记到主题对象上    
        subject.attach(observer);
        //改变主题对象的状态
        subject.change("老板不在，放心玩吧");
      //创建观察者对象
        Observer observer1 = new ConcreteObserver();
        subject.attach(observer1);
        
      //改变主题对象的状态
        subject.change("老板回来了，好好工作");
    }
}
