package designpatterns.abstractfactory;

public class LinuxCheckBox implements CheckBox {
    @Override
    public void paint(boolean isChecked) {
        System.out.println("Linux checkbox: -> Linux: is checked" + isChecked);
    }
}
