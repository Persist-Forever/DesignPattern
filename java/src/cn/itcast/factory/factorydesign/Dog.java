package cn.itcast.factory.factorydesign;
/**
 * 狗继承动物抽象类
 * */
public class Dog extends Animal{

	@Override
	public void eat() {
		System.out.println("狗喜欢吃骨头。。。");
		
	}

}
