package cn.itcast.action.memory.heixiang;

public class Originator {
	private String state;

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
	
	//创建备忘录对象
	public MementoIF createMemento(){
        return new Memento(state);
    }
	//发起人恢复到备忘录对象记录的状态
	public void restoreMemento(MementoIF memento){
		this.setState(((Memento)memento).getState());
	}
	
	private class Memento implements MementoIF{
		
		private String state;
		
		private Memento(String state){
			this.state = state;
		}

		public String getState() {
			return state;
		}

		public void setState(String state) {
			this.state = state;
		}
		
		
	}
}
