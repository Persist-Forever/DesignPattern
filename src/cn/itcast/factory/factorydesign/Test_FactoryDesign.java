package cn.itcast.factory.factorydesign;
/**
 * 工厂模式
 * 		创建抽象工厂类接口，各种要生产的东西都来实现这个接口，
 * 		具体生产哪种产品在客户端来实现
 * */
public class Test_FactoryDesign {
	public static void main(String[] args) {
		dogFactory df = new dogFactory();
		Dog dog = (Dog)df.creatAnimal();
		dog.eat(); 
	} 
}