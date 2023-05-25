package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Alert.AlertType;
import model.Coke;
import model.PalePilsen;
import model.RootBeer;
import model.Royal;
import model.Sprite;

public class DrinkController {
    @FXML
    Button btn1, btn2, btn3, btn4, btn5;

    Coke coke = new Coke();
    PalePilsen palepilsen = new PalePilsen();
    RootBeer rootbeer = new RootBeer();
    Sprite sprite = new Sprite();
    Royal royal = new Royal();


    public void initialize() {

        coke.setTaste("Sweet");
        palepilsen.setTaste("Bitter");
        rootbeer.setTaste("Menthol");
        sprite.setTaste("Lime");
        royal.setTaste("Orange");

        coke.setAlcohol("0%");
        palepilsen.setAlcohol("5%");
        rootbeer.setAlcohol("0%");
        sprite.setAlcohol("0%");
        royal.setAlcohol("0%");

        coke.setClassification("Softdrink");
        palepilsen.setClassification("Beer");
        rootbeer.setClassification("Softdrink");
        sprite.setClassification("Softdrink");
        royal.setClassification("Softdrink");
    }

    public void showInfo(ActionEvent event) {

        Button sourceButton = (Button) event.getSource();
        Alert alert = new Alert(AlertType.INFORMATION);

        if (sourceButton.equals(btn1)) {
            alert.setContentText("Root Beer tastes " + rootbeer.getTaste()+ " and it has an alcohol content of: " + rootbeer.getAlcohol() + " it is classified as a " + rootbeer.getClassification() + ".");
        }

        if (sourceButton.equals(btn2)) {
            alert.setContentText("Pale Pilsen tastes " + palepilsen.getTaste() + " and it has an alcohol content of: " + palepilsen.getAlcohol() + " it is classified as a " + palepilsen.getClassification() + ".");
        }

        if (sourceButton.equals(btn3)) {
            alert.setContentText("Royal tastes " + royal.getTaste() + " and it has an alcohol content of: " + royal.getAlcohol() + " it is classified as a " + royal.getClassification() + ".");
        }

        if (sourceButton.equals(btn4)) {
            alert.setContentText("Coke tastes " + coke.getTaste() + " and it has an alcohol content of: " + coke.getAlcohol() + " it is classified as a " + coke.getClassification() + ".");
        }

        if (sourceButton.equals(btn5)) {
            alert.setContentText("Sprite tastes " + palepilsen.getTaste() + " and it has an alcohol content of: " + palepilsen.getAlcohol() + " it is classified as a " + palepilsen.getClassification() + ".");
        }

        alert.showAndWait();

    }
}
