package cn.itcast.factory.simplefactory;
/**
 * 动物工厂类：专门用来生产动物
 * */
public class AnimalFactory {

	//方法一：为每个动物提供一个生产的方法
	public static Dog createDog(){
		return new Dog();
	}
	
	public static Cat createCat(){
		return new Cat();
	}
	
	//方法二
	public static Animal createAnimal(String name){
		if("dog".equals(name)){
			return new Dog();
		}else if("cat".equals(name)){
			return new Cat();
		}else{
			return null;
		}
	}
	
}
