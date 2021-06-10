package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Label calcLabel;

    @FXML
    private Button calcButton;

    @FXML
    private TextField rField;

    @FXML
    private TextField hField;

    @FXML
    private TextField dayField;

    @FXML
    private Button dayButton;

    @FXML
    private Label dayLabel;

    @FXML
    void calcButtonClicked(MouseEvent event) {
        try {
            float a = Float.parseFloat(rField.getText());
            float b = Float.parseFloat(hField.getText());
            calcLabel.setText(String.format("sa = %.2f sg = %.2f", (a+b)/2, Math.sqrt(a+b)));
        } catch (NumberFormatException e) {
            calcLabel.setText("Помилка");
        }
    }

    @FXML
    void dayButtonClicked(MouseEvent event) {
        try {
            int index = Integer.parseInt(dayField.getText());
            if(index > 0) {
                int flor = (index - 1) / 5;
                switch (flor) {
                    case 0:
                        dayLabel.setText("1 поверх");
                        break;
                    case 1:
                        dayLabel.setText("2 поверх");
                        break;
                    case 2:
                        dayLabel.setText("3 поверх");
                        break;
                    case 3:
                        dayLabel.setText("4 поверх");
                        break;
                    case 4:
                        dayLabel.setText("5 поверх");
                        break;
                    case 5:
                        dayLabel.setText("6 поверх");
                        break;
                    case 6:
                        dayLabel.setText("7 поверх");
                        break;
                    case 7:
                        dayLabel.setText("8 поверх");
                        break;
                    case 8:
                        dayLabel.setText("9 поверх");
                        break;
                    default:

                        dayLabel.setText("Такої кварти немає");
                        break;
                }
            }
            else dayLabel.setText("Такої кварти немає");
        } catch (NumberFormatException e) {
            dayLabel.setText("Помилка");
        }
    }

    @FXML
    void initialize() {


    }
}