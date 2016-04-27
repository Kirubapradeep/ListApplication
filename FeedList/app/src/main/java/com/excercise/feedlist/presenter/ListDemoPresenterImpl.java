package com.excercise.feedlist.presenter;

import com.excercise.feedlist.ListDemoView;
import com.excercise.feedlist.model.ListData;
import com.excercise.feedlist.model.ListDemoModel;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by pradeepraj-ext on 27-04-2016.
 */
public class ListDemoPresenterImpl implements ListDemoPresenter, Callback<ListData> {

    private final ListDemoView mView;
    private ListDemoModel mModel;

    public ListDemoPresenterImpl(ListDemoView view) {
        mView = view;
        mModel = new ListDemoModel();
    }


    @Override
    public void requestData() {
        mModel.getListData(this);
    }

    @Override
    public void onResponse(Call<ListData> call, Response<ListData> response) {
        /*
         * Populate the View with the Data once the response is successful
         */
        if (response.isSuccessful()) {
            mView.setTitle(response.body().title);
            mView.populateData(response.body().rows);
        } else {
            mView.showError(response.message());
        }
    }

    @Override
    public void onFailure(Call<ListData> call, Throwable throwable) {
        /*
         * Show Error on failure
         */

        mView.showError(throwable.getMessage());
    }
}
