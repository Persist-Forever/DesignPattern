package cn.itcast.action.template;
/**
 * 客户端
 * */
public class Client {
	public static void main(String[] args) {
		AbstractTemplate conTemplate = new ConcreteTemplate();
		//调用  算法骨架方法
		conTemplate.templateMethod();
	}
}
