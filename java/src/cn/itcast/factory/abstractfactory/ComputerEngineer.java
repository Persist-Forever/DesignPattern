package cn.itcast.factory.abstractfactory;
/**
 * 电脑安装工程师
 * */
public class ComputerEngineer {
	//定义需要组装的cpu
	private Cpu cpu = null; 
	//定义需要组装的主板
	private Mainboard mainboard = null;
	
	public void makeComputer(AbstractFactory af){
		prepareHardwares(af);
	}
	//组装准备及测试
	private void prepareHardwares(AbstractFactory af){
		//工厂获取cpu和主板
		this.cpu = af.createCPU(775);
		this.mainboard = af.createMainboard(775);
		//测试是否配套
		this.cpu.calculate();
		this.mainboard.installCPU();
	}
	
}
