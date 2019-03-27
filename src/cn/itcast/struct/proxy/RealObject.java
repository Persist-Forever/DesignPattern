package cn.itcast.struct.proxy;
/**
 * 目标对象
 * 		实际完成了抽象对象角色的功能，只是让代理对象去引用
 * */
public class RealObject extends AbstractObject{

	@Override
	public void operation() {
		System.out.println("目标对象。。实际是我付的钱。。");
		
	}

}
