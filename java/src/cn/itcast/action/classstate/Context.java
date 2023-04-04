package cn.itcast.action.classstate;

public class Context {
	
	//持有一个State类型的对象实例
	private State state;
	
	public void setState(State state){
		this.state = state;
	}
	
	//用户感兴趣的接口方法
	public void resquest(String sampleParameter){
		state.handle(sampleParameter);
	}
}
