package application;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.ChoiceBox;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;


public class Main extends Application {

	public static Stage sharedStage;


	@Override
	public void start(Stage primaryStage) {
		try {
			BorderPane root = new BorderPane();
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(getClass().getResource("Window.fxml"));
			Scene scene = new Scene(loader.load() ,800,600);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());

			primaryStage.setScene(scene);
			primaryStage.setMaximized(false);
			primaryStage.show();
			setSharedStage(primaryStage);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		launch(args);
	}


	public static Stage getSharedStage()
	{
		return sharedStage;
	}


	public void setSharedStage(Stage sharedStage)
	{
		this.sharedStage = sharedStage;
	}
}
