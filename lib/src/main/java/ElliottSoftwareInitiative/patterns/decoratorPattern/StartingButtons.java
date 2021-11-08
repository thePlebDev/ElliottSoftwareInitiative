package ElliottSoftwareInitiative.patterns.decoratorPattern;

public class StartingButtons {
	
	public static void main(String[] args) {
		Button baseButton = new ButtonOne(); // button with no added functionality
		Button buttonWithNav = new ButtonAddNavigation(baseButton);
		
		Button superButton = new ButtonWithLogin(new ButtonAddNavigation(new ButtonOne()));
		
		
		System.out.println(superButton.click());
	}

}
