package cn.itcast.factory.danli;
/*
 * 单例模式：私有化构造函数，对外提供调用方式
 * 	饿汉式:一开始就创建好
 * */
public class Singleton {
	//私有化构造函数
	private Singleton(){}
	
	//创建对象
	public static Singleton  s = new Singleton();
	
	//提供给外部调用的方法
	public static Singleton getInstance(){
		return s;
	}
	
	public void print(){
		System.out.println("单例模式之饿汉式");
	}
}
