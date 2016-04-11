//U10416012 劉宏德

import javafx.application.Application;
import javafx.animation.*;
import javafx.beans.binding.Bindings;
import javafx.beans.property.*;
import javafx.beans.value.WritableObjectValue;
import javafx.event.*;
import javafx.geometry.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.input.*;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.util.*;


public class BeanGame extends Application { 
  
  @Override
  public void start(Stage primaryStage) {
		
		// Create a new pane
		Pane a = new Pane();
		
		// Paint the bean gane interface for 14 lines
		Line x1 = new Line();
		x1.setStartX(300);
		x1.setStartY(65);
		x1.setEndX(475);
		x1.setEndY(280);
		
		Line x2 = new Line();
		x2.setStartX(475);
		x2.setStartY(350);
		x2.setEndX(75);
		x2.setEndY(350);
		
		Line x3 = new Line();
		x3.setStartX(250);
		x3.setStartY(65);
		x3.setEndX(75);
		x3.setEndY(280);
		
		Line x4 = new Line();
		x4.setStartX(475);
		x4.setStartY(280);
		x4.setEndX(475);
		x4.setEndY(350);
		
		Line x5 = new Line();
		x5.setStartX(75);
		x5.setStartY(350);
		x5.setEndX(75);
		x5.setEndY(280);
		
		Line x6 = new Line();
		x6.setStartX(300);
		x6.setStartY(65);
		x6.setEndX(300);
		x6.setEndY(40);
		
		Line x7 = new Line();
		x7.setStartX(250);
		x7.setStartY(65);
		x7.setEndX(250);
		x7.setEndY(40);
		
		Line x8 = new Line();
		x8.setStartX(125);
		x8.setStartY(280);
		x8.setEndX(125);
		x8.setEndY(350);
		
		Line x9 = new Line();
		x9.setStartX(175);
		x9.setStartY(280);
		x9.setEndX(175);
		x9.setEndY(350);
		
		Line x10 = new Line();
		x10.setStartX(225);
		x10.setStartY(280);
		x10.setEndX(225);
		x10.setEndY(350);
		
		Line x11 = new Line();
		x11.setStartX(275);
		x11.setStartY(280);
		x11.setEndX(275);
		x11.setEndY(350);
		
		Line x12 = new Line();
		x12.setStartX(325);
		x12.setStartY(280);
		x12.setEndX(325);
		x12.setEndY(350);
		
		Line x13 = new Line();
		x13.setStartX(425);
		x13.setStartY(280);
		x13.setEndX(425);
		x13.setEndY(350);
		
		Line x14 = new Line();
		x14.setStartX(375);
		x14.setStartY(280);
		x14.setEndX(375);
		x14.setEndY(350);
		
		// Put 14 lines into pane
		a.getChildren().addAll(x1, x2, x3, x4, x5, x6, x7, x8, x9, x10, x11, x12, x13, x14);
			   
		// Create 28 obstacles
		Circle c1 = new Circle();
		c1.setLayoutX(275);
		c1.setLayoutY(100);
		c1.setRadius(5);
		c1.setFill(Color.BLACK);
		
		Circle c2 = new Circle();
		c2.setLayoutX(250);
		c2.setLayoutY(130);
		c2.setRadius(5);
		c2.setFill(Color.BLACK);
		
		Circle c3 = new Circle();
		c3.setLayoutX(300);
		c3.setLayoutY(130);
		c3.setRadius(5);
		c3.setFill(Color.BLACK);
		
		Circle c4 = new Circle();
		c4.setLayoutX(275);
		c4.setLayoutY(160);
		c4.setRadius(5);
		c4.setFill(Color.BLACK);
		
		Circle c5 = new Circle();
		c5.setLayoutX(325);
		c5.setLayoutY(160);
		c5.setRadius(5);
		c5.setFill(Color.BLACK);
		
		Circle c6 = new Circle();
		c6.setLayoutX(225);
		c6.setLayoutY(160);
		c6.setRadius(5);
		c6.setFill(Color.BLACK);
		
		Circle c7 = new Circle();
		c7.setLayoutX(200);
		c7.setLayoutY(190);
		c7.setRadius(5);
		c7.setFill(Color.BLACK);
		
		Circle c8 = new Circle();
		c8.setLayoutX(350);
		c8.setLayoutY(190);
		c8.setRadius(5);
		c8.setFill(Color.BLACK);
		
		Circle c9 = new Circle();
		c9.setLayoutX(250);
		c9.setLayoutY(190);
		c9.setRadius(5);
		c9.setFill(Color.BLACK);
		
		Circle c10 = new Circle();
		c10.setLayoutX(300);
		c10.setLayoutY(190);
		c10.setRadius(5);
		c10.setFill(Color.BLACK);
		
		Circle c11 = new Circle();
		c11.setLayoutX(375);
		c11.setLayoutY(220);
		c11.setRadius(5);
		c11.setFill(Color.BLACK);
		
		Circle c12 = new Circle();
		c12.setLayoutX(175);
		c12.setLayoutY(220);
		c12.setRadius(5);
		c12.setFill(Color.BLACK);
		
		Circle c13 = new Circle();
		c13.setLayoutX(225);
		c13.setLayoutY(220);
		c13.setRadius(5);
		c13.setFill(Color.BLACK);
		
		Circle c14 = new Circle();
		c14.setLayoutX(275);
		c14.setLayoutY(220);
		c14.setRadius(5);
		c14.setFill(Color.BLACK);
		
		Circle c15 = new Circle();
		c15.setLayoutX(325);
		c15.setLayoutY(220);
		c15.setRadius(5);
		c15.setFill(Color.BLACK);
		
		Circle c16 = new Circle();
		c16.setLayoutX(400);
		c16.setLayoutY(250);
		c16.setRadius(5);
		c16.setFill(Color.BLACK);
		
		Circle c17 = new Circle();
		c17.setLayoutX(150);
		c17.setLayoutY(250);
		c17.setRadius(5);
		c17.setFill(Color.BLACK);
		
		Circle c18 = new Circle();
		c18.setLayoutX(200);
		c18.setLayoutY(250);
		c18.setRadius(5);
		c18.setFill(Color.BLACK);
		
		Circle c19 = new Circle();
		c19.setLayoutX(250);
		c19.setLayoutY(250);
		c19.setRadius(5);
		c19.setFill(Color.BLACK);
		
		Circle c20 = new Circle();
		c20.setLayoutX(300);
		c20.setLayoutY(250);
		c20.setRadius(5);
		c20.setFill(Color.BLACK);
		
		Circle c21 = new Circle();
		c21.setLayoutX(350);
		c21.setLayoutY(250);
		c21.setRadius(5);
		c21.setFill(Color.BLACK);
		
		Circle c22 = new Circle();
		c22.setLayoutX(425);
		c22.setLayoutY(280);
		c22.setRadius(5);
		c22.setFill(Color.BLACK);
		
		Circle c23 = new Circle();
		c23.setLayoutX(125);
		c23.setLayoutY(280);
		c23.setRadius(5);
		c23.setFill(Color.BLACK);
		
		Circle c24 = new Circle();
		c24.setLayoutX(175);
		c24.setLayoutY(280);
		c24.setRadius(5);
		c24.setFill(Color.BLACK);
		
		Circle c25 = new Circle();
		c25.setLayoutX(225);
		c25.setLayoutY(280);
		c25.setRadius(5);
		c25.setFill(Color.BLACK);

		Circle c26 = new Circle();
		c26.setLayoutX(275);
		c26.setLayoutY(280);
		c26.setRadius(5);
		c26.setFill(Color.BLACK);
		
		Circle c27 = new Circle();
		c27.setLayoutX(325);
		c27.setLayoutY(280);
		c27.setRadius(5);
		c27.setFill(Color.BLACK);
		
		Circle c28 = new Circle();
		c28.setLayoutX(375);
		c28.setLayoutY(280);
		c28.setRadius(5);
		c28.setFill(Color.BLACK);
		
		// Put 28 obstacles into pane
		a.getChildren().addAll(c1, c2, c3, c4, c5, c6, c7, c8, c9, c10, c11, c12, c13, c14, 
						c15, c16, c17, c18, c19, c20, c21, c22, c23, c24, c25, c26, c27, c28);
		
		// Create 8 button to judge the bean's path
		Circle bt1 = new Circle();
		bt1.setLayoutX(100);
		bt1.setLayoutY(350);
		bt1.setRadius(0.1);
		bt1.setFill(Color.WHITE);
		
		Circle bt2 = new Circle();
		bt2.setLayoutX(150);
		bt2.setLayoutY(350);
		bt2.setRadius(0.1);
		bt2.setFill(Color.WHITE);
		
		Circle bt3 = new Circle();
		bt3.setLayoutX(200);
		bt3.setLayoutY(350);
		bt3.setRadius(0.1);
		bt3.setFill(Color.WHITE);
		
		Circle bt4 = new Circle();
		bt4.setLayoutX(250);
		bt4.setLayoutY(350);
		bt4.setRadius(0.1);
		bt4.setFill(Color.WHITE);
		
		Circle bt5 = new Circle();
		bt5.setLayoutX(300);
		bt5.setLayoutY(350);
		bt5.setRadius(0.1);
		bt5.setFill(Color.WHITE);
		
		Circle bt6 = new Circle();
		bt6.setLayoutX(350);
		bt6.setLayoutY(350);
		bt6.setRadius(0.1);
		bt6.setFill(Color.WHITE);
		
		Circle bt7 = new Circle();
		bt7.setLayoutX(400);
		bt7.setLayoutY(350);
		bt7.setRadius(0.1);
		bt7.setFill(Color.WHITE);
		
		Circle bt8 = new Circle();
		bt8.setLayoutX(450);
		bt8.setLayoutY(350);
		bt8.setRadius(0.1);
		bt8.setFill(Color.WHITE);
		
		// Put 8 button into pane
		a.getChildren().addAll(bt1, bt2, bt3, bt4, bt5, bt6, bt7, bt8);
						
		Scene scene = new Scene(a, 550, 400); // Decide the pane's area
		primaryStage.setTitle("My funny bean game");  // This game title
		primaryStage.setResizable(true);
		primaryStage.setScene(scene);
		primaryStage.show();	
	}
}
