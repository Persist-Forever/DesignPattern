package cn.itcast.action.fatherandchild;

public class Context {
	private Strategy strategy;

	public Context(Strategy strategy) {
		this.strategy = strategy;
	}
	
	public void contextInterface(){
		strategy.strategyMethod();
	}
	
}
