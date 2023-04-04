package cn.itcast.factory.factorydesign;
/**
 * 猫工厂
 * */
public class catFactory implements Factory{

	@Override
	public Animal creatAnimal() {
		
		return new Cat();
	}
	
}
