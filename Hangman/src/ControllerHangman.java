public class ControllerHangman {

	private MainViewHangman mainView;
	
	public ControllerHangman() {
		this.setMainView(new MainViewHangman());
	}
	
	
	

	public MainViewHangman getMainView() {
		return mainView;
	}

	public void setMainView(MainViewHangman mainView) {
		this.mainView = mainView;
	}
	
	
}
