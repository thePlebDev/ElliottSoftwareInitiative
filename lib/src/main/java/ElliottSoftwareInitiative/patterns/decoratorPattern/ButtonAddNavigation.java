package ElliottSoftwareInitiative.patterns.decoratorPattern;

public class ButtonAddNavigation extends ButtonDecorator{

	public ButtonAddNavigation(Button baseButton) {
		super(baseButton);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String click() {
		
		return super.click() + addNavigation();
	}
	
	
	public String addNavigation() { 
		//EXTRA FUNCTIONALITY WOULD GO HERE
		return " NAVIGATION DONE ";
	}

}
