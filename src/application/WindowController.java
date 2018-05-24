package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;

public class WindowController
{

	@FXML
	private Pane mainPane;

	@FXML
	private AnchorPane mainAnchorPane;

	@FXML
	private Label edytorGrafowLabel, przezLabel, typGrafuLabel, sciezkaLabel, kolorystykaLabel;

	@FXML
	private ToggleButton slupkowyToggleButton, kolowyToggleButton;

	@FXML
	private TextField sciezkaTextField;

	@FXML
	private Button wybierzPlikButton, generujButton;

	@FXML
	private RadioButton kolor1RadioButton, kolor2RadioButton;

	void initialize()
	{
		final ToggleGroup group = new ToggleGroup();
		kolowyToggleButton.setToggleGroup(group);
		slupkowyToggleButton.setToggleGroup(group);
	}

	@FXML
	private void wybierzPlikButton_OnAction(ActionEvent event)
	{

	}

	@FXML
	private void generujButton_OnAction(ActionEvent event)
	{

	}
}
