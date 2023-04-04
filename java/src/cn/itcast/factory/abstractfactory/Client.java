package cn.itcast.factory.abstractfactory;

public class Client {
	public static void main(String[] args) {
		//创建电脑安装工程师
		ComputerEngineer cf = new ComputerEngineer();
		//选择使用的产品类型：什么电脑 如Intel
		AbstractFactory af = new IntelFactory();
		//组装
		cf.makeComputer(af);
	}
}
