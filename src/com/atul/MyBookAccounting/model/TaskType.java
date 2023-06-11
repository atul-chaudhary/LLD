package com.atul.MyBookAccounting.model;

public enum TaskType {
    TASK1(1),
    TASK2(2),
    TASK3(3),
    TASK4(4);

    private final int taskNumber;

    TaskType(int code) {
        this.taskNumber = code;
    }

    public int toInt() {
        return taskNumber;
    }


}
