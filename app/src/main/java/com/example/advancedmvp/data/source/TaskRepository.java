package com.example.advancedmvp.data.source;

import com.example.advancedmvp.data.source.local.TaskLocalDataSource;
import com.example.advancedmvp.data.source.remote.RemoteDataSource;

import javax.sql.DataSource;

public class TaskRepository implements TaskDataSource {

    boolean isNetAvailable = false;
    TaskDataSource localdatasource;
    TaskDataSource remoteDataSource;
    public TaskRepository() {

        localdatasource = new TaskLocalDataSource();
        remoteDataSource = new RemoteDataSource();
    }

    @Override
    public void getTask(TaskCallBack callBack) {
        if (isNetAvailable){
            remoteDataSource.getTask(callBack);
        }else {
            localdatasource.getTask(callBack);
        }

    }
}
