package com.excercise.feedlist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.excercise.feedlist.model.ListItem;
import com.excercise.feedlist.presenter.ListDemoPresenter;
import com.excercise.feedlist.presenter.ListDemoPresenterImpl;

import java.util.List;

public class ListDemoActivity extends AppCompatActivity implements ListDemoView {

    private ListDemoPresenter mPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mPresenter = new ListDemoPresenterImpl(this);
        mPresenter.requestData();
    }

    @Override
    public void setTitle(String title) {

    }

    @Override
    public void populateData(List<ListItem> data) {

    }

    @Override
    public void showError(String errorMessage) {

    }
}
