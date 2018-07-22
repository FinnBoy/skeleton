package net.awaken.core.linq.operation.union;

public interface Merger<L, R, T> {

    void merge(MRecord<L, R, T> record);
}
