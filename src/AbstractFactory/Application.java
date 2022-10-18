package AbstractFactory;
/**
 * Код, использующий фабрику, не волнует с какой конкретно фабрикой он работает.
 * Все получатели продуктов работают с продуктами через абстрактный интерфейс.
 */
public class Application {
    private final Button button;
    private final CheckBox checkBox;

    public Application(GUIFactory factory) {
        button = factory.createButton();
        checkBox = factory.createCheckBox();
    }

    public void paint() {
        button.paint();
        checkBox.paint();
    }
}
