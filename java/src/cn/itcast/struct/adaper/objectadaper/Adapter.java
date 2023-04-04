package cn.itcast.struct.adaper.objectadaper;

public class Adapter {
	
	private Adaptee adaptee;
	
	public Adapter(Adaptee adaptee){
		this.adaptee = adaptee;
	}
	//源对象有的方法
	public void sampleOperation1(){
		this.adaptee.sampleOperation1();
	}
	/**
	 * 源类Adaptee没有方法sampleOperation2
	 * 因此由适配器类补充此方法
	 * */
	public void sampleOperation2(){
		//写相关代码
	}

}
