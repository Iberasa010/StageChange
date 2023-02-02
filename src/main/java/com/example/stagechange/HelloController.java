package com.example.stagechange;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.shape.Circle;

public class HelloController {
    @FXML
    private Circle circulo;
    double y;
    double x;


    @FXML

    public void up(ActionEvent e){
        circulo.setCenterY(y=y-10);
    }

    public void right(ActionEvent e){
        circulo.setCenterX(x=x+10);
    }
    public void left(ActionEvent e){
        circulo.setCenterX(x=x-10);
    }

    public void down(ActionEvent e){
        circulo.setCenterY(y=y+10);    }
}