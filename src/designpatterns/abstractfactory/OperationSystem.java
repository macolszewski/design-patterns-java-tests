package designpatterns.abstractfactory;

public class OperationSystem {
    private final GuiFactory guiFactory;
    private final Button button;
    private final CheckBox checkBox;

    public OperationSystem(GuiFactory guiFactory) {
        this.guiFactory = guiFactory;
        this.button = guiFactory.createButton();
        this.checkBox = guiFactory.createCheckBox();
    }

    public void showOperationSystemGui() {
        button.paint();
        checkBox.paint(false);
    }

}
