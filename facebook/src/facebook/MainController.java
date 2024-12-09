package facebook; 

import javafx.fxml.FXML;


public class MainController {
   
    
    
   @FXML
   public void profile () {}
   @FXML
   public void chats() {}
   @FXML
   public void write_post(){
   
     WritePostController write = new WritePostController () ;
     write.write_post();
   
 
    }
   @FXML
   public void friends_posts () {} 
   @FXML
   public void all_posts () {
   
   
   
   
   }
   @FXML
   public void search () {}
   
   

   
   
   
   
   
    
    
}
