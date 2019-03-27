package cn.itcast.action.classstate;
/**
 * 客户端
 * */
public class Client {
	public static void main(String[] args) {
		//创建状态
		State state = new ConcreteStateA();
		
		//创建环境
		Context context = new Context();
		
		context.setState(state);
		
		context.resquest("test");
	}
}
