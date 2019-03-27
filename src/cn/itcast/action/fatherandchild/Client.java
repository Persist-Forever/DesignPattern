package cn.itcast.action.fatherandchild;
/**
 * 客户端：测试
 * */
public class Client {
	public static void main(String[] args) {
		Strategy strategy = new ConcreteStrategyA();
		
		Context context = new Context(strategy);
		
		context.contextInterface();
	}
}
