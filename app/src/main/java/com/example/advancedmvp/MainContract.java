package com.example.advancedmvp;

public interface MainContract {
    interface View{
        void setText(String name);
    }
    interface Presenter{
        void onButtonClicked(String name);
    }
}
