package com.example.advancedmvp;

import com.example.advancedmvp.data.Task;
import com.example.advancedmvp.data.source.TaskDataSource;
import com.example.advancedmvp.data.source.TaskRepository;
import com.example.advancedmvp.data.source.local.TaskLocalDataSource;

public class MainPresenter implements MainContract.Presenter, TaskDataSource.TaskCallBack {

    MainContract.View view;
    TaskDataSource taskDataSource;

    public MainPresenter(MainActivity mainActivity){
        view = mainActivity;
        taskDataSource = new TaskRepository();
                //new TaskLocalDataSource();

    }


    @Override
    public void onButtonClicked(String name) {

        taskDataSource.getTask(this);


    }


    @Override
    public void ontaskLoaded(Task task) {
        view.setText(task.getTitle());


    }
}
