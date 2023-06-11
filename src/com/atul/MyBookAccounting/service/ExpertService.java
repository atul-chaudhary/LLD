package com.atul.MyBookAccounting.service;

import com.atul.MyBookAccounting.model.Expert;
import com.atul.MyBookAccounting.model.Task;
import com.atul.MyBookAccounting.model.TaskType;

import java.util.List;

public class ExpertService {

    Expert expert;

    public ExpertService(Expert expert) {
        this.expert = expert;
    }

    public List<Task> getAllRequest(){
        return expert.getTaskList();
    }

    public void resolveRequest(String taskId, TaskType taskType){

    }

}
