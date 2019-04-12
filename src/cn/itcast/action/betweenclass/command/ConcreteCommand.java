package cn.itcast.action.betweenclass.command;
//具体命令，里面含有实际的操作
public class ConcreteCommand implements Command {
	
	private Receiver receiver = null;
	
	public ConcreteCommand(Receiver receiver) {
		super();
		this.receiver = receiver;
	}

	@Override
	public void execute() {
		receiver.action();
	}

}
