package cn.itcast.factory.simplefactory;
/**
 * 测试简单工厂方法
 * 	该设计模式用处不大,违背开放封闭原则
 * */
public class Test_SimpleFactory {
	
	public static void main(String[] args) {
		Dog dog = (Dog)AnimalFactory.createAnimal("dog");
		Cat cat = (Cat)AnimalFactory.createAnimal("cat");
		if(dog!=null)
			dog.eat();
		if(cat!=null)
			cat.eat();
	}
	
}
