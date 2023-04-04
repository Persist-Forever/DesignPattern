package cn.itcast.factory.prototype;

import java.util.HashMap;
import java.util.Map;

/**
 * 登记注册原型
 * */
public class PrototypeManager {
	//用来记录原型的编号和原型实例的对应关系
	private static Map<String,Prototype> map = new HashMap<>();
	//私有化构造方法，防止外部实例化
	private PrototypeManager(){}
	/**
	 * 向原型管理器中添加或者修改某个原型注册
	 * */
	public synchronized static void setPrototype(String proID,Prototype pro){
		map.put(proID, pro);
	}
	/**
	 * 从原型管理器里面删除某个原型注册
	 * */
	public synchronized static void removePrototype(String proId){
		map.remove(proId);
	}
	/**
	 * 获取某个原型编号对应的实例
	 * */
	public synchronized static Prototype getPrototype(String proId) throws Exception{
		Prototype prototype = map.get(proId);
		if(prototype == null){
			throw new Exception("您希望获取的原型还没有注册或已被销毁");
		}
		return prototype;
	}
}
