package cn.itcast.factory.danli;
/*
 * 单例模式：私有化构造函数，对外提供调用方式
 * 	懒汉式：用的时候才去创建
 * */
public class Singleton2 {
	//私有化构造函数
	private Singleton2(){}
	
	//创建对象
	public static Singleton2  s ;
	//用作锁对象
	private static  Object obj = new Object();
	
	//提供给外部调用的方法
	public static Singleton2 getInstance(){
		/*此方法在多线程时会出现创建多个对象的问题
		 * if(s==null){
			s = new Singleton2();
		}
		return s;*/
		
		//用加锁的方法
		if(s==null){
			synchronized (obj) {
				if(s==null){
					s = new Singleton2();
				}
			}
		}
		return s;
	}
	
	public void print(){
		System.out.println("单例模式之懒汉式");
	}
}
