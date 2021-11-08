package ElliottSoftwareInitiative.patterns.decoratorPattern;

public class ButtonWithLogin extends ButtonDecorator{

	public ButtonWithLogin(Button baseButton) {
		super(baseButton);
		// TODO Auto-generated constructor stub
	}
	
	
	@Override
	public String click() {
		
		return super.click() + login();
	}
	
	
	public String login() {
		return " LOGGED IN ";
	}

}
