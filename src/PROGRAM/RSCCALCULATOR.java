package PROGRAM;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class RSCCALCULATOR extends Application {
    
    // <editor-fold defaultstate="collapsed" desc=" INITIALIZE VARIABLES FOR WINDOW DRAGGING ">
    private double xOffset = 0;
    private double yOffset = 0;

// </editor-fold>
    
    @Override
    public void start(Stage stage) throws Exception {
        
         // <editor-fold defaultstate="collapsed" desc=" INITIALIZE PROGRAM INIT ">
         Parent root = FXMLLoader.load(getClass().getResource("/FXML/MAIN.fxml"));        
         Scene scene = new Scene(root);

// </editor-fold>
        
         // <editor-fold defaultstate="collapsed" desc=" MAKE PROGRAM DRAGGABLE ">
         root.setOnMousePressed(new EventHandler<MouseEvent>() {
            
         @Override            
         public void handle(MouseEvent event) {
                
            xOffset = event.getSceneX();
            yOffset = event.getSceneY();
                
            }
         });
        
         root.setOnMouseDragged(new EventHandler<MouseEvent>() {
            
         @Override
         public void handle(MouseEvent event) {
                
            stage.setX(event.getScreenX() - xOffset);
            stage.setY(event.getScreenY() - yOffset);
                
         }
        });

// </editor-fold> 

         // <editor-fold defaultstate="collapsed" desc=" LAUNCH PROGRAM SETTINGS ">
        stage.setResizable(false);        
        stage.initStyle(StageStyle.UNDECORATED);        
        stage.setScene(scene);        
        stage.show();        
        
        root.requestFocus();

// </editor-fold>
        
    }
    
    private void main(String[] args) {
        launch(args);
    }
    
}
