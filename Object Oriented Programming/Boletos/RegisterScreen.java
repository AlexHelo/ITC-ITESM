import javafx.event.EventHandler;
import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.control.Label;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;

public class RegisterScreen extends Scene {
    private VBox rootVB = new VBox();

    public RegisterScreen(Main main) {

        super(new VBox(), 300, 200);
        TextField name = new TextField();
        HBox hb1 = new HBox(new Label("Name: "), name);

        ComboBox type = new ComboBox<>();
        type.getItems().add("Tickets A");
        type.getItems().add("Tickets B");
        type.getItems().add("Tickets C");
        HBox hb2 = new HBox(new Label("Ticket Type: "), type);

        TextField numTickets = new TextField();
        numTickets.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
                if (!newValue.matches("\\d{0,2}"))
                    numTickets.setText(oldValue);
            }
        });
        HBox hb3 = new HBox(new Label("Number of tickets: "), numTickets);

        Button continueBtn = new Button("Continue");
        continueBtn.setStyle("-fx-background-color: red;");
        continueBtn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                int nTickets = Integer.parseInt("0" + numTickets.getText());
                if (!name.getText().equals("") && type.getValue() != null && nTickets != 0) {
                    String ticketTypeStr = (String) type.getValue();
                    User u = new User(name.getText(), ticketTypeStr.charAt(8), nTickets);
                    name.setText("");
                    type.setValue(null);
                    numTickets.setText("");
                    main.setSelectScene(u);
                } else {
                    System.out.println("Try again");
                }
            }
        });

        rootVB.getChildren().addAll(hb1, hb2, hb3, continueBtn);
        super.setRoot(rootVB);
    }
}