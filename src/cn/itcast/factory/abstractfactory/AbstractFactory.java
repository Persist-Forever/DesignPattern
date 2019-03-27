package cn.itcast.factory.abstractfactory;
/**
 * 抽象工厂
 * */
public interface AbstractFactory {
	public Cpu createCPU(int pin);
	public Mainboard createMainboard(int pin); 
}
