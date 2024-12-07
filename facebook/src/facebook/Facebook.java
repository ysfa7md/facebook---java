package facebook;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Facebook extends Application {
    public static Stage stage = new Stage ();
    public static Scene scene; 
    public static Parent root ;
    
    
    static Dimension screenSize ; 
    static double width ; 
    static double height ; 
     
    @Override
    public void start(Stage s) {
        try {
            
            root = FXMLLoader.load(getClass().getResource("base.fxml"));  
           
            scene = new Scene(root, width, height); 
            stage.setTitle("Facebook"); 
            stage.setScene(scene );
            
            stage.show();
  
        } catch (IOException e) {
            System.out.println(e);
        }
    }
    
    

    public static void main(String[] args) {
        screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        width = screenSize.getWidth();
        height = screenSize.getHeight()-70;
        launch(args); 
    }
}
