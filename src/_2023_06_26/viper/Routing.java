package _2023_06_26.viper;

/**
 * Routing отвечает за навигацию между модулями в VIPER-приложении.
 * Он определяет пути и переходы между различными экранами.
 * Он взаимодействует с Presenter для осуществления навигации.
 */
public interface Routing {
    void navigateToHome();
}