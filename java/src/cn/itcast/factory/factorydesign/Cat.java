package cn.itcast.factory.factorydesign;
/**
 * 猫继承动物抽象类
 * */
public class Cat extends Animal{

	@Override
	public void eat() {
		System.out.println("猫喜欢吃鱼。。。");
		
	}

}
