package cn.itcast.factory.danli;
/**
 * 测试饿汉式
 * */
public class Test_ehan {
	public static void main(String[] args) {
		Singleton s = Singleton.getInstance();
		s.print();
		Singleton s2 = Singleton.getInstance();
		System.out.println(s==s2);   //证明是同一个对象
	}
}
