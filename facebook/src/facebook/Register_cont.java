package facebook;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

import java.io.IOException;
import java.net.URL;
import java.util.Objects;
import java.util.ResourceBundle;
import java.util.stream.IntStream;




public class Register_cont implements Initializable  {

    public void back_to_login() throws IOException {

        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("hello-view.fxml")));
        Scene scene = new Scene(root);
        HelloApplication.stage.setTitle("Login");
        HelloApplication.stage.setScene(scene);
        HelloApplication.stage.show();

    }







    @FXML
    private ComboBox<String> combobox_day;

    @FXML
    private ComboBox<String> combobox_month;

    @FXML
    private ComboBox<String> combobox_year;








    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        String [] items = IntStream.rangeClosed(1, 31)
                .mapToObj(Integer::toString)
                .toArray(String[]::new);
        combobox_day.getItems().addAll(items);
        String [] item = {
                "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        combobox_month.getItems().addAll(item);

        String [] items3 = IntStream.rangeClosed(1905, 2024)
                .mapToObj(Integer::toString)
                .toArray(String[]::new);
        combobox_year.getItems().addAll(items3);






    }
}
