package com.example.mylibrary;

public class Value {

    long firstValue;
    long secondValue;
    long totalValue;

    public Value(long firstValue, long secondValue, long totalValue) {
        this.firstValue = firstValue;
        this.secondValue = secondValue;
        this.totalValue = totalValue;
    }

    public long getFirstValue() {
        return firstValue;
    }

    public void setFirstValue(long firstValue) {
        this.firstValue = firstValue;
    }

    public long getSecondValue() {
        return secondValue;
    }

    public void setSecondValue(long secondValue) {
        this.secondValue = secondValue;
    }

    public long getTotalValue() {
        return totalValue;
    }

    public void setTotalValue(long totalValue) {
        this.totalValue = totalValue;
    }
}
