package view;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.TilePane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class ViewMenuPrincipal extends Application {
private String nom;
private String prenom;
private String utilisateur ;
private String motDepasse;
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Bienvenue");
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));
        ///////////////////////////////////////////////////////////////////
        Scene scene = new Scene(grid, 1280, 768);
        primaryStage.setScene(scene);
        ////////////////////// Bienvenue /////////////////
        Text scenetitle = new Text("Bienvenue");
        scenetitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 50));
        /////////////////// Nom civilite  ///////////
        Label nomCivilite = new Label("Votre nom:");
        TextField champNomCivilite = new TextField();
        /////////////////// PreNom civilite  ///////////
        Label prenomCivilite = new Label("Votre prenom:");
        TextField champPreNomCivilite = new TextField();
        /////////////////// Nom utilisateur ///////////
        Label nomUtilisateur = new Label("Nom utilisateur:");
        TextField champUtilisateur = new TextField();
        ///////////////// Mot de Passe /////////////
        Label motDepasse = new Label("Mot de passe:");
        PasswordField champPasseword = new PasswordField();
        ////////////////////////////////////
        Button btnValider = new Button("Valider");
        HBox hbBtn = new HBox(10);
        hbBtn.setAlignment(Pos.BOTTOM_RIGHT);
        hbBtn.getChildren().add(btnValider);
        final Text actiontarget = new Text();
        // creation du texte
        TilePane tilepane = new TilePane();
        // creation
        Label l = new Label("champ vide");

        grid.add(scenetitle, 0, 0, 2, 1);
        grid.add(champNomCivilite, 1, 1);
        grid.add(nomCivilite, 0, 1);
        grid.add(prenomCivilite, 0, 2);
        grid.add(champPreNomCivilite, 1, 2);
        grid.add(nomUtilisateur, 0, 3);
        grid.add(champUtilisateur, 1, 3);
        grid.add(motDepasse, 0, 4);
        grid.add(champPasseword, 1, 4);
        grid.add(hbBtn, 1, 6);
        grid.add(actiontarget, 1, 8);
        grid.add(tilepane, 1, 9);

        // action event

        EventHandler<ActionEvent> event = e -> btnValider.setText(l.getText());

        // affiche si boutton valider
        btnValider.setOnAction(event);
        primaryStage.show();

    }

}