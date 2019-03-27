package cn.itcast.action.template;
/**
 * 算法骨架
 * */
public abstract class AbstractTemplate {
	//模板方法（顶级逻辑）
	public void templateMethod(){
		beginmethod();
		abstractmethod();
		hookMethod();
		endmethod();
	}
	
	//基本方法:已经实现
	public void beginmethod(){
		System.out.println("算法骨架初始化。。。。。");
	}
	//基本方法声明（由子类去实现）
	protected abstract void abstractmethod();
	
	//基本方法（空方法，子类选择性实现）
	protected void hookMethod(){}
	
	//基本方法:已经实现
	public void endmethod(){
		System.out.println("算法骨架资源关闭。。。。。");
	}
	
}
