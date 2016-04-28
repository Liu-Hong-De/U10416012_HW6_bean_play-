// U10416012 劉宏德

import javafx.animation.*;
import javafx.application.Application;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.Scene;
import javafx.scene.shape.*;
import javafx.stage.Stage;
import javafx.util.Duration;
import java.security.SecureRandom;

public class BeanGame extends Application {
	double X, Y;
	
	public void start(Stage primaryStage) {	
		Pane pane = new Pane();	// set a new pane
		
		// create 28 circle
		Circle c1  = new Circle(275, 100, 5, Color.BLACK);
		Circle c2  = new Circle(250, 130, 5, Color.BLACK);
		Circle c3  = new Circle(300, 130, 5, Color.BLACK);
		Circle c4  = new Circle(275, 160, 5, Color.BLACK);
		Circle c5  = new Circle(325, 160, 5, Color.BLACK);
		Circle c6  = new Circle(225, 160, 5, Color.BLACK);
		Circle c7  = new Circle(200, 190, 5, Color.BLACK);
		Circle c8  = new Circle(350, 190, 5, Color.BLACK);
		Circle c9  = new Circle(250, 190, 5, Color.BLACK);
		Circle c10 = new Circle(300, 190, 5, Color.BLACK);
		Circle c11 = new Circle(375, 220, 5, Color.BLACK);
		Circle c12 = new Circle(175, 220, 5, Color.BLACK);
		Circle c13 = new Circle(225, 220, 5, Color.BLACK);
		Circle c14 = new Circle(275, 220, 5, Color.BLACK);
		Circle c15 = new Circle(325, 220, 5, Color.BLACK);
		Circle c16 = new Circle(400, 250, 5, Color.BLACK);
		Circle c17 = new Circle(150, 250, 5, Color.BLACK);
		Circle c18 = new Circle(200, 250, 5, Color.BLACK);
		Circle c19 = new Circle(250, 250, 5, Color.BLACK);
		Circle c20 = new Circle(300, 250, 5, Color.BLACK);
		Circle c21 = new Circle(350, 250, 5, Color.BLACK);
		Circle c22 = new Circle(425, 280, 5, Color.BLACK);
		Circle c23 = new Circle(125, 280, 5, Color.BLACK);
		Circle c24 = new Circle(175, 280, 5, Color.BLACK);
		Circle c25 = new Circle(225, 280, 5, Color.BLACK);
		Circle c26 = new Circle(275, 280, 5, Color.BLACK);
		Circle c27 = new Circle(325, 280, 5, Color.BLACK);
		Circle c28 = new Circle(375, 280, 5, Color.BLACK);	

		// create 14 line
		Line x1  = new Line(300, 65,  475, 280);
		Line x2  = new Line(475, 350, 75,  350);		
		Line x3  = new Line(250, 65,  75,  280);	
		Line x4  = new Line(475, 280, 475, 350);	
		Line x5  = new Line(75,  350, 75,  280);	
		Line x6  = new Line(300, 65,  300, 40);		
		Line x7  = new Line(250, 65,  250, 40);	
		Line x8  = new Line(123, 280, 125, 350);	
		Line x9  = new Line(175, 280, 175, 350);	
		Line x10 = new Line(225, 280, 225, 350);	
		Line x11 = new Line(275, 280, 275, 350);
		Line x12 = new Line(325, 280, 325, 350);
		Line x13 = new Line(425, 280, 425, 350);
		Line x14 = new Line(375, 280, 375, 350);
		
		// add circle and line into pane
		pane.getChildren().addAll(c1, c2, c3, c4, c5, c6, c7, c8, c9, c10, c11, c12, c13, c14, c15, c16, c17, c18, c19, c20, c21, c22, c23, c24, c25, c26, c27, c28, x1, x2, x3, x4, x5, x6, x7, x8, x9, x10, x11, x12, x13, x14);
		
		Scene scene = new Scene(pane, 600, 500);
		
		pane.setOnMouseClicked(e -> {
			X = 275;
			Y = 50;
			
			// set the ball color
			Circle Ball = new Circle(X, Y, 6, new Color(Math.random(),Math.random(), Math.random(), 0.8));
			
			pane.getChildren().add(Ball);
				Routine(Ball);
		});
		
		primaryStage.setTitle("My funny bean game");	// title
		primaryStage.setScene(scene);
		primaryStage.show();		
	}
	
	public double randomX(double a){
		int d = new SecureRandom().nextInt(2), i = 0;	//random
		if(d == 1) {
			i = 1;
		}
		else {
			i = -1;
		}
		return (i * 25) + a;
	}
	
	public void Routine(Circle Ball){
		double[] d;
		d = new double[8];
		for(int i = 0 ; i < d.length; i++) {
			d[i] = randomX(X);
			X = randomX(X);
			if(X == 450) {
				X = 400;
			}
		}
		//path
		Timeline Routinego = new Timeline(
			new KeyFrame(Duration.seconds(0.2), new KeyValue(Ball.centerXProperty(), d[0])),      new KeyFrame(Duration.seconds(0.2), new KeyValue(Ball.centerYProperty(), 85)),
			new KeyFrame(Duration.seconds(0.3), new KeyValue(Ball.centerXProperty(), d[1])),      new KeyFrame(Duration.seconds(0.3), new KeyValue(Ball.centerYProperty(), 115)),
			new KeyFrame(Duration.seconds(0.4), new KeyValue(Ball.centerXProperty(), d[2])),      new KeyFrame(Duration.seconds(0.4), new KeyValue(Ball.centerYProperty(), 145)),
			new KeyFrame(Duration.seconds(0.5), new KeyValue(Ball.centerXProperty(), d[3])),      new KeyFrame(Duration.seconds(0.5), new KeyValue(Ball.centerYProperty(), 175)),
			new KeyFrame(Duration.seconds(0.6), new KeyValue(Ball.centerXProperty(), d[4])),      new KeyFrame(Duration.seconds(0.6), new KeyValue(Ball.centerYProperty(), 205)),
			new KeyFrame(Duration.seconds(0.7), new KeyValue(Ball.centerXProperty(), d[5])),      new KeyFrame(Duration.seconds(0.7), new KeyValue(Ball.centerYProperty(), 235)),
			new KeyFrame(Duration.seconds(0.8), new KeyValue(Ball.centerXProperty(), d[6])),      new KeyFrame(Duration.seconds(0.8), new KeyValue(Ball.centerYProperty(), 265)),
			new KeyFrame(Duration.seconds(0.9), new KeyValue(Ball.centerXProperty(), d[7] + 25)), new KeyFrame(Duration.seconds(0.9), new KeyValue(Ball.centerYProperty(), 345)));
		Routinego.play();	
	}
}
