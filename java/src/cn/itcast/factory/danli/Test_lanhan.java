package cn.itcast.factory.danli;
/**
 * 测试单例模式之懒汉式
 * */
public class Test_lanhan {
	public static void main(String[] args) {
		Singleton2 s1 = Singleton2.getInstance();
		Singleton2 s2 = Singleton2.getInstance();
		System.out.println(s1==s2);
	}
}
