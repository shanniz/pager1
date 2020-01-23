package com.example.shan.pager1;

public class Task {
    private int mTaskId;
    private String mTaskDesc;

    public Task(int taskId, String taskDesc) {
        mTaskId = taskId;
        mTaskDesc = taskDesc;
    }

    public void setTaskId(int taskId) {
        mTaskId = taskId;
    }

    public String getTaskDesc() {
        return mTaskDesc;
    }

    public void setTaskDesc(String taskDesc) {
        mTaskDesc = taskDesc;
    }

    public int getTaskId(){
        return this.mTaskId;
    }
}
