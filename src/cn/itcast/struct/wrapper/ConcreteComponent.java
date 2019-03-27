package cn.itcast.struct.wrapper;
/**
 * 具体组件
 * 		以后通过装饰模式将这个组件进行升级
 * */
public class ConcreteComponent implements Component {

	@Override
	public void sampleOperation() {
		// TODO Auto-generated method stub
		System.out.println("一些传统方法。。。");
	}

}
