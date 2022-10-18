package AbstractFactory;
/**
 * Все семейства продуктов имеют одинаковые вариации (MacOS/Windows).
 * Вариация чекбокса под Windows.
 */
public class WindowsCheckBox implements CheckBox {
    @Override
    public void paint() {
        System.out.println("You've created WindowsCheckBox.");
    }
}
