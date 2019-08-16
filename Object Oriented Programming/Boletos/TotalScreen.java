import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.event.EventHandler;
import javafx.event.ActionEvent;

public class TotalScreen extends Scene {
    private VBox rootVB;

    public TotalScreen(Main main, int lastPrice) {
        super(new VBox(), 300, 100);
        Label lbl1 = new Label("Your total is:");
        Label lbl2 = new Label("$" + lastPrice + ".00");
        Button btn = new Button("Continue");
        btn.setStyle("-fx-background-color: red;");
        btn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                main.setRegisterScene();
            }
        });
        rootVB = new VBox(lbl1, lbl2, btn);
        super.setRoot(rootVB);
    }
}