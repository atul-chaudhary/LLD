package com.atul.MyBookAccounting.model;

import java.util.List;
import java.util.Map;

public class Customer {
    String customerId;
    String customerName;
    Map<String, List<Task>> taskMap;

    public Customer(String customerId, String customerName, Map<String, List<Task>> taskMap) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.taskMap = taskMap;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public Map<String, List<Task>> getTaskMap() {
        return taskMap;
    }

    public void setTaskMap(Map<String, List<Task>> taskMap) {
        this.taskMap = taskMap;
    }
}
