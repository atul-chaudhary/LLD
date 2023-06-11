package com.atul.MyBookAccounting.model;

import java.util.List;

public class Expert {
    String expertId;
    String expertName;
    List<Task> taskList;

    public Expert(String expertId, String expertName, List<Task> taskList) {
        this.expertId = expertId;
        this.expertName = expertName;
        this.taskList = taskList;
    }

    public String getExpertId() {
        return expertId;
    }

    public void setExpertId(String expertId) {
        this.expertId = expertId;
    }

    public String getExpertName() {
        return expertName;
    }

    public void setExpertName(String expertName) {
        this.expertName = expertName;
    }

    public List<Task> getTaskList() {
        return taskList;
    }

    public void setTaskList(List<Task> taskList) {
        this.taskList = taskList;
    }
}
