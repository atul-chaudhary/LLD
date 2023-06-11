package com.atul.MyBookAccounting.model;

public class Task {
    String taskId;
    String taskName;
    TaskType taskType;
    int taskDuration;
    int taskDeadline;
    TaskStatus status;

    public Task(String taskId, String taskName, TaskType taskType, int taskDuration, int taskDeadline, TaskStatus status) {
        this.taskId = taskId;
        this.taskName = taskName;
        this.taskType = taskType;
        this.taskDuration = taskDuration;
        this.taskDeadline = taskDeadline;
        this.status = status;
    }



    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public int getTaskDuration() {
        return taskDuration;
    }

    public void setTaskDuration(int taskDuration) {
        this.taskDuration = taskDuration;
    }

    public int getTaskDeadline() {
        return taskDeadline;
    }

    public void setTaskDeadline(int taskDeadline) {
        this.taskDeadline = taskDeadline;
    }

    public TaskStatus getStatus() {
        return status;
    }

    public void setStatus(TaskStatus status) {
        this.status = status;
    }

    public TaskType getTaskType() {
        return taskType;
    }

    public void setTaskType(TaskType taskType) {
        this.taskType = taskType;
    }
}
