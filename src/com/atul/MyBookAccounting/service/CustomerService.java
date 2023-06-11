package com.atul.MyBookAccounting.service;

import com.atul.MyBookAccounting.model.Customer;
import com.atul.MyBookAccounting.model.Task;
import com.atul.MyBookAccounting.model.TaskStatus;
import com.atul.MyBookAccounting.model.TaskType;

import java.util.ArrayList;
import java.util.*;

public class CustomerService {
    private static final String SUCCESS = "success";
    private static final String FAILED = "failed";
    Customer customer;

    public CustomerService(Customer customer) {
        this.customer = customer;
    }

    public Map<String, List<Task>> getRequestStatus() {
        return customer.getTaskMap();
    }

    public String RaiseRequest(String taskId, String taskName, TaskType taskType, int duration, int deadline, TaskStatus taskStatus) {
        if (taskType == TaskType.TASK1) {
            Task newTask = new Task(taskId, taskName, taskType, duration, deadline, taskStatus);
            List<Task> list = new ArrayList<>();
            list.add(newTask);
            customer.getTaskMap().put(taskId, list);
            return SUCCESS;
        } else {
            Map<String, List<Task>> taskMap = customer.getTaskMap();
            List<Task> prevTask = taskMap.get(taskId);
            if (verificationForPreviousTask(prevTask, taskType)) {
                Task newTask = new Task(taskId, taskName, taskType, duration, deadline, taskStatus);
                prevTask.add(newTask);
                return SUCCESS;
            } else {
                return "previous task is pending";
            }
        }
    }

    private boolean verificationForPreviousTask(List<Task> tasks, TaskType currentTaskType) {
        for (Task it : tasks) {
            if (currentTaskType.toInt() - 1 == it.getTaskType().toInt()) {
                return true;
            }
        }
        return false;
    }
}
