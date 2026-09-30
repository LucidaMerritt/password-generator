package password;


import java.io.IOException;


import javafx.fxml.FXML;
import javafx.scene.control.*;

public class Controller {
	
	@FXML
	private Button enter;
	@FXML
	private TextField eingabe;
	@FXML
	private TextArea output;
	
	@FXML 
	public void clear() {
		eingabe.clear();
		output.clear();
	}
	@FXML
	public void onButtonKlick() throws IOException {
		String input = eingabe.getText();
		String newPassword = PasswordGenerator.generatePassword(Integer.parseInt(input));
		output.setText(newPassword);
		eingabe.clear();
	}

}
