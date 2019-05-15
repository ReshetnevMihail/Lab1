import javafx.application.Application; import javafx.event.ActionEvent; import javafx.event.EventHandler; import javafx.geometry.Insets; import javafx.scene.Group; import javafx.scene.Scene; import javafx.scene.control.Button; import javafx.scene.control.TextField; import javafx.scene.layout.HBox; import javafx.scene.layout.VBox; import javafx.scene.text.Text; import javafx.stage.Stage;

public class Main extends Application {

    public void start(Stage primaryStage) {



        root.getChildren().add(strings);

        strings.setPadding(new Insets(10, 30, 10, 30));
        strings.setSpacing(20);

        strings.getChildren().add(new Text("Enter your string: "));
        strings.getChildren().add(string_inpBox);
        strings.getChildren().add(reversBox);
        strings.getChildren().add(new Text("Result:"));
        strings.getChildren().add(string_outBox);


        string_inpBox.setSpacing(10);
        string_inpBox.getChildren().add(string_inp);

        reversBox.setSpacing(10);
        reversBox.getChildren().add(buttonRevers);

        string_outBox.setSpacing(10);
        string_outBox.getChildren().add(string_out);



        buttonRevers.setOnAction(new EventHandler<ActionEvent>()
        {
            @Override
            public void handle(ActionEvent e)
            {
                buttonRevers.setOnAction(event ->string_out.setText(objofrevers.revers_str(string_inp.getText())));
            }
        });

        Scene scene = new Scene(root, WIDTH, HEIGHT);
        primaryStage.setTitle("Revers");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

    Revers objofrevers = new Revers();

    Group root = new Group();

    VBox strings = new VBox();

    HBox string_inpBox = new HBox();
    TextField string_inp = new TextField();

    HBox string_outBox = new HBox();
    TextField string_out = new TextField();

    HBox reversBox = new HBox();
    Button buttonRevers = new Button("Revers");

    final private int WIDTH = 300;
    final private int HEIGHT = 300;
}