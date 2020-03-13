package model;

import java.util.Collection;
import java.util.HashSet;

public class HighVolumeIntegerSet implements IntegerSet {

    Collection<Integer> data;

    public HighVolumeIntegerSet(){
        data = new HashSet<Integer>();
    }

    @Override
    public int size() {
        return data.size();
    }

    @Override
    public boolean contains(Integer num) {
        return data.contains(num);
    }

    @Override
    public void insert(Integer num) {
        data.add(num);
    }

    @Override
    public void remove(Integer num) {
        data.remove(num);
    }
}
