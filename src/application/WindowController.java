
package application;

import java.io.File;
import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.stage.FileChooser;
import javafx.stage.FileChooser.ExtensionFilter;
import javafx.stage.Stage;

public class WindowController
{

	public String typWykresu;
	public File selectedFile;

	private Stage thisStage;

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
	private void wybierzPlikButton_OnAction(MouseEvent event)
	{
		FileChooser fileChooser = new FileChooser();
		fileChooser.setTitle("Otwórz plik z danymi");
		fileChooser.getExtensionFilters().addAll(new ExtensionFilter("Text Files", "*.txt"));
		selectedFile = fileChooser.showOpenDialog(mainPane.getScene().getWindow());
		if (selectedFile.getAbsolutePath() != null)
		{
			sciezkaTextField.setText(selectedFile.getAbsolutePath());
		}
	}

	@FXML
	private void generujButton_OnAction(MouseEvent event)
	{
		try
		{
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(getClass().getResource("PieChart.fxml"));

			Scene scene = new Scene(loader.load(), 800, 600);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());

			thisStage = new Stage();
			thisStage.setScene(scene);
			thisStage.setMaximized(true);
			thisStage.show();
		} catch (IOException e)
		{
			e.printStackTrace();
		}
	}
}
