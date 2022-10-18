package AbstractFactory;
/**
 * Все семейства продуктов имеют одинаковые вариации (MacOS/Windows).
 * Вариация чекбокса под MacOS.
 */
public class MacOSCheckBox implements CheckBox {

    @Override
    public void paint() {
        System.out.println("You've created MacOSCheckBox.");
    }
}
