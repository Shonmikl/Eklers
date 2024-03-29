package _2023_06_26.viper;

/**
 * View:
 * View отвечает за отображение данных пользователю
 * и обработку пользовательского ввода. Он не содержит
 * бизнес-логики и взаимодействует с представителем для
 * передачи событий и обновления интерфейса.
 */
public interface View {
    void showLoading();
    void hideLoading();
    void showLoginSuccess();
    void showLoginError(String errorMessage);
}