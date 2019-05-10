package com.example.advancedmvp.data.source.local;

import com.example.advancedmvp.data.Task;
import com.example.advancedmvp.data.source.TaskDataSource;

public class TaskLocalDataSource implements TaskDataSource {

    @Override
    public void getTask(TaskCallBack callBack) {
        Task task = new Task("local title", "local details");
        callBack.ontaskLoaded(task);


    }
}
