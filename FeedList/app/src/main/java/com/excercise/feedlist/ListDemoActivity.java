package com.excercise.feedlist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;

import com.excercise.feedlist.model.ListItem;
import com.excercise.feedlist.presenter.ListDemoPresenter;
import com.excercise.feedlist.presenter.ListDemoPresenterImpl;

import java.util.List;

public class ListDemoActivity extends AppCompatActivity implements ListDemoView {

    private RecyclerView mListView;
    private ListDemoPresenter mPresenter;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;

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

        if (getBaseContext() != null  && !isFinishing()) {
            mAdapter = new ListDemoAdapter(data, this);
            mListView.setAdapter(mAdapter);
        }

    }

    @Override
    public void showError(String errorMessage) {

    }
}
