package Teamt42_JavaFX;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.web.WebView;

import java.net.URL;
import java.util.ResourceBundle;

public class MainController  implements Initializable {

    @FXML
    private Button next;

    @FXML
    private Slider volumeSlider;

    @FXML
    private Slider songSlider;

    @FXML
    private MenuBar mainMenu;

    @FXML
    private Button stop_play;

    @FXML
    private ListView<String> historyLitsView;

    @FXML
    private TableView<?> resultTableView;

    @FXML
    private Button back;
    @FXML
    private ToggleButton PLAY;
    @FXML
    private WebView videoWebView;

    @FXML
    private TextField searchTextFiled;

    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
        configureButtons();
        configureSearch();
    }

    private void configureSearch() {
        // dodajemy zdarzenie do pola tekstowego
        // klasa anonimowa, ponieważ jest nieco rozbudowane
        searchTextFiled.addEventFilter(KeyEvent.KEY_PRESSED, new EventHandler<KeyEvent>() {

            @Override
            public void handle(KeyEvent event) {

                // zapisujemy do zmiennej wartość z pola wyszukiwania
                String searchQuery = searchTextFiled.getText();
                ObservableList<String> historyList = historyLitsView.getItems();

                // jeśli wciśnięto Enter
                if (event.getCode().equals(KeyCode.ENTER)) {

                    // sprawdzamy, czy element nie był już dodany do listy jako
                    // ostatni
                    if (historyList.isEmpty() || !historyList.get(0).equals(searchQuery)) {
                        historyList.add(0, searchQuery);
                    }

                }
            }
        });
    }

    private void configureButtons() {
        // dodanie akcji przycisku dla playButton
        PLAY.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                // jeśli przycisk nie był wciśnięty, to znaczy, że ma przejść w
                // Play
                // jeśli przycisk był wciśnięty, to po wciśnięciu przechodzi w
                // Stop
                if (PLAY.isSelected()) {
                    System.out.println("Play");
                } else {
                    System.out.println("Stop");
                }
            }
        });

        // dodanie akcji dla previous i next
        back.setOnAction(x -> System.out.println("Previous"));

        next.setOnAction(x -> System.out.println("Next"));
    }

}
