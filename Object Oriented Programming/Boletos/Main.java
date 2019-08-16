import java.util.ArrayList;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;

public class Main extends Application {
    private Stage stage;
    private Scene registerSc = new RegisterScreen(this);
    private SelectScreen selectSc = new SelectScreen(this);
    private Scene totalSc;
    private ArrayList<User> users = new ArrayList<User>();

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        stage = primaryStage;
        stage.setTitle("TicketMaster 2.0");
        stage.setScene(registerSc);
        stage.show();
    }

    public void setSelectScene(User user) {
        users.add(user);
        selectSc.setLastUser(user);
        stage.setScene(selectSc);
    }

    public void setTotalScreen() {
        int lastPrice = users.get(users.size() - 1).calcPrice();
        totalSc = new TotalScreen(this, lastPrice);
        stage.setScene(totalSc);
    }

    public void setRegisterScene() {
        stage.setScene(registerSc);
    }
}