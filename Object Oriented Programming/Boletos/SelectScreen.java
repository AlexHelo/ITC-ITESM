import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.control.Label;

public class SelectScreen extends Scene {
    private GridPane rootGP = new GridPane();
    private User lastUser;
    

    public SelectScreen(Main main) {
        super(new GridPane());
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 16; j++) {
                Button btn = new Button("Seat " + ((char) (j + 'A')) + (i + 1));
                btn.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        Button control = (Button) event.getSource();
                        int col = rootGP.getColumnIndex(control);
                        int row = rootGP.getRowIndex(control);
                        rootGP.getChildren().remove(control);
                        Label taken = new Label("|Taken by: " + lastUser.getName()+"|");
                        switch (lastUser.getTickets()) {
                           case 'A':
                           taken.setStyle("-fx-background-color: red;");
                          case 'B':
                           taken.setStyle("-fx-background-color: yellow;");
                          case 'C':
                            taken.setStyle("-fx-background-color: green;");
                     
                         }

                        taken.setStyle("-fx-background-color: red;");
                        rootGP.add(taken, col, row);

                        lastUser.setTicketPlace(col - 1, row - 1);
                        if (lastUser.getTicketsLeft() == 0)
                            main.setTotalScreen();
                    }
                });
                rootGP.add(btn, (i + 1), (j + 1));
            }
        }
        super.setRoot(rootGP);
    }

    public void setLastUser(User user) {
        lastUser = user;
    }
}