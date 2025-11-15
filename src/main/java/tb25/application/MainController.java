package tb25.application;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import java.awt.*;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class MainController {

    @FXML
    private Button browseNovelBtn;

    @FXML
    private Button saveNovelBtn;

    @FXML
    protected void onBrowseNovelClick(){

    }

    @FXML
    protected void onAddNovelClick(){
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("/fxml/addNovel.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 500, 600);

            Stage stage = (Stage) browseNovelBtn.getScene().getWindow();

            stage.setScene(scene);
            stage.setTitle("Esy Novel Collection - Add Novel");

        } catch (Exception e){
            e.printStackTrace();
        }
    }

    @FXML
    protected void onRemoveNovelClick(){

    }

    @FXML
    protected void onExitNovelClick(){

    }

}
