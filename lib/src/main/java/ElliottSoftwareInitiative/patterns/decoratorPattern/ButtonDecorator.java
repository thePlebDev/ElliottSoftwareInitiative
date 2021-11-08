package ElliottSoftwareInitiative.patterns.decoratorPattern;

public abstract class ButtonDecorator implements Button{
	//STEP 3
	
	private Button baseButton;
	
	public ButtonDecorator(Button baseButton) {
		this.baseButton = baseButton;
	}
	

	@Override
	public String click() {
		// TODO Auto-generated method stub
		return baseButton.click();
	}
	
	
	

}
