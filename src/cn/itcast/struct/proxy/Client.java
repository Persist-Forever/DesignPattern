package cn.itcast.struct.proxy;
/**
 * 客户端
 * */
public class Client {
	public static void main(String[] args) {
		AbstractObject obj = new ProxyObject();
		obj.operation();
	}
}
