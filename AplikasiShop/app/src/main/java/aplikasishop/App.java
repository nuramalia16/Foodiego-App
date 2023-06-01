/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package aplikasishop;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class App extends Application {
    private Stage primaryStage;
    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage primaryStage) {
        this.primaryStage = primaryStage;
        primaryStage.setTitle("FoodieGo");
        primaryStage.setScene(createHomePage());
        primaryStage.show();
    }
    // Halaman Utama (Home Page)
    private Scene createHomePage() {
    // Gambar(Logo) Aplikasi
        Image FoodieGo = new Image("./FoodieGo.jpeg");
        ImageView foodieGoView = new ImageView(FoodieGo);
        foodieGoView.setFitWidth(200);
        foodieGoView.setFitHeight(200);
    // Tombol Masuk
        Button loginButton = new Button("Masuk");
        loginButton.setStyle("-fx-background-color: black; -fx-text-fill: white;");
        loginButton.setOnAction(e -> {
            primaryStage.setScene(createLoginPage());
        });
    // Penyatuan Secara vertikal
        VBox layout = new VBox(0);
        layout.getChildren().addAll(foodieGoView, loginButton);
        layout.setAlignment(Pos.CENTER);
        layout.setStyle("-fx-background-color: #FAF2E9;");

        BorderPane pane = new BorderPane();
        pane.setCenter(layout);
        return new Scene(pane, 300, 500);
    }
    // Halaman ke dua (Login Page)
    private Scene createLoginPage() {
        Text loginTitle = new Text("Halaman Login");
        loginTitle.setFont(Font.font("Arial", FontWeight.BOLD, 20));

        Label usernameLabel = new Label("Username:");
        TextField usernameField = new TextField();
        Label passwordLabel = new Label("Password:");
        PasswordField passwordField = new PasswordField();
    // Tombol Login
        Button loginButton = new Button("Login");
        loginButton.setStyle("-fx-background-color: black; -fx-text-fill: white;");
        loginButton.setOnAction(e -> {
            String username = usernameField.getText();
            String password = passwordField.getText();
            // Validasi ketentuan username dan password
            boolean isValid = validateUsername(username) && validatePassword(password);
            if (isValid) {
                primaryStage.setScene(createCategorySelectionPage());
            } else {
                // Tampilkan pesan kesalahan login
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Error");
                alert.setHeaderText("Login Gagal");
                alert.setContentText("Username atau password tidak valid!");
                alert.showAndWait();
            }
        });
    // Tombol Kembali
        Button backButton = new Button("Kembali");
        backButton.setStyle("-fx-background-color: black; -fx-text-fill: white;");
        backButton.setOnAction(e -> {
            primaryStage.setScene(createHomePage());
        });
        VBox layout = new VBox(40);
        layout.getChildren().addAll(loginTitle, usernameLabel, usernameField, passwordLabel, passwordField, loginButton, backButton);
        layout.setAlignment(Pos.CENTER);
        layout.setStyle("-fx-background-color: #FAF2E9;");

        BorderPane pane = new BorderPane();
        pane.setCenter(layout);
        return new Scene(pane, 300, 500);
    }
    // Halaman  ke tiga (Pilihan Kategori)
    private Scene createCategorySelectionPage() {
        Text categoryTitle = new Text("Pilih Kategori");
        categoryTitle.setFont(Font.font("Arial", FontWeight.BOLD, 20));

        Button makanan = new Button("MAKANAN");
        makanan.setStyle("-fx-background-color: black; -fx-text-fill: white;");
        makanan.setOnAction(e -> {
            primaryStage.setScene(createFoodSelectionPage());
        });
        Button minuman = new Button("MINUMAN");
        minuman.setStyle("-fx-background-color: black; -fx-text-fill: white;");
        minuman.setOnAction(e -> {
            primaryStage.setScene(createDrinkSelectionPage());
        });
        Button backButton = new Button("Kembali");
        backButton.setStyle("-fx-background-color: black; -fx-text-fill: white;");
        backButton.setOnAction(e -> {
            primaryStage.setScene(createHomePage());
        });
        VBox layout = new VBox(20);
        layout.getChildren().addAll(categoryTitle,makanan,minuman, backButton);
        layout.setAlignment(Pos.CENTER);
        layout.setStyle("-fx-background-color: #FAF2E9;");

        BorderPane pane = new BorderPane();
        pane.setCenter(layout);
        return new Scene(pane, 300, 500);
    }
    // Halaman ke 4 (Pilihan Makanan) 
    private Scene createFoodSelectionPage() {
        Text foodTitle = new Text("Pilih Makanan");
        foodTitle.setFont(Font.font("Arial", FontWeight.BOLD, 20));
        // Daftar makanan
        Image Burger = new Image("./Burger.png");
        ImageView burgerView = new ImageView(Burger);
        burgerView.setFitWidth(100);
        burgerView.setFitHeight(100);

        Text hargaBurger = new Text("Rp 25.000");
        hargaBurger.setFont(Font.font("Arial", FontWeight.BOLD, 10));
        
        Button Burger1 = new Button("Burger");
        Burger1.setStyle("-fx-background-color: black; -fx-text-fill: white;");
        Burger1.setOnAction(e -> {
            showOrderConfirmation("Burger");
        });
        Image Hotodog = new Image("./Hotodog.png");
        ImageView hotodogView = new ImageView(Hotodog);
        hotodogView.setFitWidth(100);
        hotodogView.setFitHeight(100);

        Text hargaHotDog = new Text("Rp 20.000");
        hargaHotDog.setFont(Font.font("Arial", FontWeight.BOLD, 10));

        Button Hotogod1  = new Button("Hot Dog");
        Hotogod1.setStyle("-fx-background-color: black; -fx-text-fill: white;");
        Hotogod1.setOnAction(e -> {
            showOrderConfirmation("Hot Dog");
        });
        Image Pizza = new Image("./Pizza.png");
        ImageView pizzaView = new ImageView(Pizza);
        pizzaView.setFitWidth(100);
        pizzaView.setFitHeight(100);

        Text hargaPizza = new Text("Rp 50.000");
        hargaPizza.setFont(Font.font("Arial", FontWeight.BOLD, 10));

        Button Pizza1  = new Button("Pizza");
        Pizza1.setStyle("-fx-background-color: black; -fx-text-fill: white;");
        Pizza1.setOnAction(e -> {
            showOrderConfirmation("Pizza");
        });
        Image Jasuke = new Image("./Jasuke.png");
        ImageView jasukView = new ImageView(Jasuke);
        jasukView.setFitWidth(100);
        jasukView.setFitHeight(100);

        Text hargaJasuke = new Text("Rp 10.000");
        hargaJasuke.setFont(Font.font("Arial", FontWeight.BOLD, 10));

        Button Jasuke1  = new Button("Jasuke");
        Jasuke1.setStyle("-fx-background-color: black; -fx-text-fill: white;");
        Jasuke1.setOnAction(e -> {
            showOrderConfirmation("Jasuke");
        });

        Button backButton = new Button("Kembali");
        backButton.setStyle("-fx-background-color: black; -fx-text-fill: white;");
        backButton.setOnAction(e -> {
            primaryStage.setScene(createCategorySelectionPage());
        });

        HBox layout = new HBox(10);
        layout.getChildren().addAll(burgerView,hotodogView);
        layout.setAlignment(Pos.CENTER);

        HBox layout1 = new HBox(60);
        layout1.getChildren().addAll(hargaBurger,hargaHotDog);
        layout1.setAlignment(Pos.CENTER);

        HBox layout2 = new HBox(10);
        layout2.getChildren().addAll(Burger1,Hotogod1);
        layout2.setSpacing(50);
        layout2.setAlignment(Pos.CENTER);

        HBox layout3 = new HBox(10);
        layout3.getChildren().addAll(pizzaView,jasukView);
        layout3.setAlignment(Pos.CENTER);

        HBox layoutPizjas = new HBox(60);
        layoutPizjas.getChildren().addAll(hargaPizza,hargaJasuke);
        layoutPizjas.setAlignment(Pos.CENTER);

        HBox layout4 = new HBox(20);
        layout4.getChildren().addAll(Pizza1,Jasuke1);
        layout4.setSpacing(50);
        layout4.setAlignment(Pos.CENTER);

        VBox mainLayout = new VBox(10);
        mainLayout.getChildren().addAll(foodTitle, layout,layout1,layout2, layout3,layoutPizjas, layout4,backButton);
        mainLayout.setAlignment(Pos.CENTER);
        mainLayout.setStyle("-fx-background-color: #FAF2E9;");

        BorderPane pane = new BorderPane();
        pane.setCenter(mainLayout);

        return new Scene(pane, 300, 500);
    }
    // Halaman ke empat (Pilihan Minuman)
    private Scene createDrinkSelectionPage() {
        Text drinkTitle = new Text("Pilih Minuman");
        drinkTitle.setFont(Font.font("Arial", FontWeight.BOLD, 20));
        // Daftar minuman
        Image LemonTea = new Image("./LemonTea.png");
        ImageView lemonTeaView = new ImageView(LemonTea);
        lemonTeaView.setFitWidth(100);
        lemonTeaView.setFitHeight(100);

        Text hargaLemontea = new Text("Rp 10.000");
        hargaLemontea.setFont(Font.font("Arial", FontWeight.BOLD, 10));

        Button LemonTea1 = new Button("Lemon Tea");
        LemonTea1.setStyle("-fx-background-color: black; -fx-text-fill: white;");
        LemonTea1.setOnAction(e -> {
            showOrderConfirmation("Lemon Tea");
        });
        Image ThaiTea = new Image("./ThaiTea.png");
        ImageView thaiTeeView = new ImageView(ThaiTea);
        thaiTeeView.setFitWidth(100);
        thaiTeeView.setFitHeight(100);

        Text hargaThaitea = new Text("Rp 10.000");
        hargaThaitea.setFont(Font.font("Arial", FontWeight.BOLD, 10));

        Button ThaiTea1 = new Button("Thai Tea");
        ThaiTea1.setStyle("-fx-background-color: black; -fx-text-fill: white;");
        ThaiTea1.setOnAction(e -> {
            showOrderConfirmation("Thai Tea");
        });

        Button backButton = new Button("Kembali");
        backButton.setStyle("-fx-background-color: black; -fx-text-fill: white;");
        backButton.setOnAction(e -> {
            primaryStage.setScene(createCategorySelectionPage());
        });

        HBox layout5 = new HBox(10);
        layout5.getChildren().addAll(lemonTeaView,thaiTeeView);
        layout5.setAlignment(Pos.CENTER);

        HBox layout6 = new HBox(60);
        layout6.getChildren().addAll(hargaLemontea,hargaThaitea);
        layout6.setAlignment(Pos.CENTER);

        HBox layout7 = new HBox(10);
        layout7.getChildren().addAll(LemonTea1,ThaiTea1);
        layout7.setSpacing(50);
        layout7.setAlignment(Pos.CENTER);
       
        VBox mainLayout = new VBox(20);
        mainLayout.getChildren().addAll(drinkTitle,layout5,layout6,layout7,backButton);
        mainLayout.setAlignment(Pos.CENTER);
        mainLayout.setStyle("-fx-background-color: #FAF2E9;");

        BorderPane pane = new BorderPane();
        pane.setCenter(mainLayout);

        return new Scene(pane, 300, 500);
    }
        // Konfirmasi Pemesanan (Order Confirmation)
        private void showOrderConfirmation(String item) {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Konfirmasi Pemesanan");
            alert.setHeaderText("Pemesanan Berhasil");
            alert.setContentText("Anda telah memesan " + item);
            alert.showAndWait();
        }
    // Validasi Username
    private boolean validateUsername(String username) {
        // Misalnya, validasi bahwa username harus terdiri dari huruf dan angka saja
        return username.matches("^[a-zA-Z0-9]{1,8}+$");
    }
    // Validasi Password
    private boolean validatePassword(String password) {
        // password harus memiliki panjang minimal 8 karakter
        // dan mengandung kombinasi huruf besar, huruf kecil, dan angka
        return password.length() >= 8 && password.matches(".*[A-Z].*") && password.matches(".*[a-z].*") && password.matches(".*\\d.*");
    }
}
