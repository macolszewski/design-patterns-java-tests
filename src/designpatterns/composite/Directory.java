package designpatterns.composite;

import java.util.ArrayList;
import java.util.List;

public class Directory extends DataStructure {

    private List<DataStructure> dataStructures = new ArrayList<>();

    public Directory(String name) {
        super(name);
    }

    @Override
    public void browse() {
        super.browse();
        for (DataStructure dataStructure : dataStructures) {
            dataStructure.browse();
        }
        System.out.println(String.format("Zamykanie: %s", getDataStructureName()));
    }

    @Override
    public void addChild(DataStructure dataStructure) {
        dataStructures.add(dataStructure);
    }

    @Override
    public void removeChild(DataStructure dataStructure) {
        dataStructures.remove(dataStructure);
    }
}