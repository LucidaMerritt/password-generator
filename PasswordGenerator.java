package password;

import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class PasswordGenerator extends Application{
	private static String password;
	
	public static String generatePassword(int eingabe) throws IOException {
		
		String bereich = "!$%&/()=-#+abcdefghijklmnopqrstuvwxyz0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		
		String new_password = "";
		for(int i=0; i < eingabe; i++) {
			int index = (int) (Math.random()*bereich.length());
			new_password += bereich.charAt(index);
		}
		password = new_password;
		return password;
	}
	
	@Override
	public void start(Stage stage) throws IOException {
		FXMLLoader loader = new FXMLLoader(PasswordGenerator.class.getResource("password.fxml"));
		Parent root = loader.load();
		Controller controller = new Controller();
		loader.setController(controller);
		
		stage.setTitle("Passwort-Generator");
		stage.setScene(new Scene(root));
		stage.show();
	}
	public static void main(String[] args) throws IOException{
		launch();
	}
}
