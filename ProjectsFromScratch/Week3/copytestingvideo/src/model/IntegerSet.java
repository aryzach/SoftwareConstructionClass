package model;

public interface IntegerSet {
    int size();

    boolean contains(Integer num);

    void insert(Integer num);

    void remove(Integer num);
}
