package cn.itcast.struct.proxy;

public class ProxyObject extends AbstractObject{
	//目标对象的引用
	RealObject realObject = new RealObject();
	
	@Override
	public void operation() {
		
		System.out.println("找代理去买花。。。");
		
		realObject.operation();
		
		System.out.println("找代理去送。。。");
	}

}
