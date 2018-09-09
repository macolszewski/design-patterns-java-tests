package designpatterns.composite;

public abstract class DataStructure {
    protected String name;

    public DataStructure(String name) {
        this.name = name;
    }

    protected String getDataStructureName(){
        return name;
    }

    public void browse() {
        System.out.println(String.format("Otwieranie: %s", getDataStructureName()));
    }

    public abstract void addChild(DataStructure dataStructure);

    public abstract void removeChild(DataStructure dataStructure);
}