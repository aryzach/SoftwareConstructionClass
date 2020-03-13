package model;

import java.util.ArrayList;

public class LowVolumeIntegerSet implements IntegerSet {

    ArrayList<Integer> internalArray;

    public LowVolumeIntegerSet(){
        internalArray = new ArrayList<Integer>();
    }

    @Override
    public int size(){
        return internalArray.size();}

    @Override
    public boolean contains(Integer num){
        return internalArray.contains(num);
    }

    @Override
    public void insert(Integer num){
        if(!internalArray.contains(num)){
            internalArray.add(num);
        }

    }

    @Override
    public void remove(Integer num){
        if(contains(num)){
            internalArray.remove(num);
        }

    }

}
