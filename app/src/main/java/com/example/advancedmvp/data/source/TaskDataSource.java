package com.example.advancedmvp.data.source;

import com.example.advancedmvp.data.Task;

public interface TaskDataSource {
    interface TaskCallBack{
        void ontaskLoaded(Task task);
    }

    void getTask(TaskCallBack callBack);
}
