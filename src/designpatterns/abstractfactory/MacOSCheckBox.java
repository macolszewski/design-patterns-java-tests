package designpatterns.abstractfactory;

public class MacOSCheckBox implements CheckBox {
    @Override
    public void paint(boolean isChecked) {
        System.out.println("MacOS checkBox -> Apple: isChecked " +
                isChecked);
    }
}
