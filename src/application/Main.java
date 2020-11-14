package application;


import javafx.application.*;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.effect.InnerShadow;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.text.*;

public class Main extends Application {

	Stage window;
	Button play, tutorial, rankings, closeButton;
	Label title;

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage mainStage) {
		window = mainStage;
		window.setTitle("Brick-Breaker");

		InnerShadow is = new InnerShadow();

		Text title = new Text();
		title.setEffect(is);
		title.setText("BRICK BREAKER");
		title.setFill(Color.MAROON);
		title.setFont(Font.font(null, FontWeight.BOLD, 80));
		title.relocate(120, 150);

		play = new Button("Play Game");
		play.relocate(345, 450);

		tutorial = new Button("Tutorial");
		tutorial.relocate(355, 500);


		tutorial.setOnAction(e -> {
			Tutorial.display("Tutorial", "Welcome to Brick-Breaker!" + "\n" + "\nHere’s how to play the game:" + "\n"
					+ "\nYour goal is to knock out all the bricks on the screen by moving the paddle. "
					+ "\nControl the paddle using the arrow keys on your keyboard." + "\n"
					+ "\nDon't let the ball hit the bottom of the screen, otherwise you lose." + "\nHave fun!! :)");

		});

		rankings = new Button("Leaderboard");
		rankings.relocate(340, 550);

		closeButton = new Button("Close game");
		closeButton.setOnAction(e -> window.close());
		closeButton.relocate(343, 600);

		Image img = new Image("file:back.jpeg");
		ImageView mv = new ImageView(img);

		Pane layout = new Pane();
		layout.getChildren().addAll(mv, title, play, tutorial, rankings, closeButton);
		Scene scene = new Scene(layout, 800, 800);
		window.setScene(scene);
		window.show();

	}
}