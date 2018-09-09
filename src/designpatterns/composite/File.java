package designpatterns.composite;

public class File extends DataStructure {

    public File(String name) {
        super(name);
    }

    @Override
    public void addChild(DataStructure dataStructure) {
        throw new UnsupportedOperationException("not supported by file!");
    }

    @Override
    public void removeChild(DataStructure dataStructure) {
        throw new UnsupportedOperationException("not supported by file!");
    }
}