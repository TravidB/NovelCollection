package tb25.application;

import javafx.fxml.FXML;
import javafx.scene.control.*;

import javafx.event.ActionEvent;
import java.io.IOException;

public class addNovelController {

    @FXML
    private TextField novel_name;

    @FXML
    private TextField novel_author;

    @FXML
    private TextField novel_chapter;

    @FXML
    private TextField novel_page;

    @FXML
    private TextField progressField;

    @FXML
    private ToggleGroup novelProgressGroup;

    @FXML
    private Button add_button;

    @FXML
    private Button back_button;

    @FXML
    private RadioButton chapterRadio;

    @FXML
    private RadioButton pageRadio;

    @FXML
    private Button saveNovelBtn;

    public void onSaveNovelClick(ActionEvent event) throws IOException {
        try {
            return;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void initialize() {
        chapterRadio.setSelected(true);
    }
}

