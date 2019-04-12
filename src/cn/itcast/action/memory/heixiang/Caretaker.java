package cn.itcast.action.memory.heixiang;

public class Caretaker {
	
	private MementoIF memento;
	
	//取备忘录对象
	public MementoIF retureMemento(){
		return memento;
	}
	
	//存储备忘录的方法
	public void saveMemento(MementoIF memento){
		this.memento = memento;
	}
	
}
