package cn.itcast.factory.factorydesign;
/**
 * 狗工厂
 * */
public class dogFactory implements Factory{

	@Override
	public Animal creatAnimal() {
		
		return new Dog();
	}
	
}
