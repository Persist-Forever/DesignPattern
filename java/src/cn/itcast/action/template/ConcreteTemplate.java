package cn.itcast.action.template;
/**
 * 子类可以实现父类的某些方法
 * */
public class ConcreteTemplate extends AbstractTemplate {

	@Override
	protected void abstractmethod() {
		System.out.println("业务逻辑。。。");
	}

}
