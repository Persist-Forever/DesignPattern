package cn.itcast.action.betweenclass.command;
//命令请求者
public class Invoker {
	
	private Command command = null;

	public Invoker(Command command) {
		super();
		this.command = command;
	}
	
	public void action(){
		command.execute();
	}
}
