package com.example.advancedmvp.data.source.remote;

import com.example.advancedmvp.data.Task;
import com.example.advancedmvp.data.source.TaskDataSource;

public class RemoteDataSource implements TaskDataSource {

    @Override
    public void getTask(TaskCallBack callBack) {
        Task task = new Task("remote title","remote details");
        callBack.ontaskLoaded(task);

    }
}
