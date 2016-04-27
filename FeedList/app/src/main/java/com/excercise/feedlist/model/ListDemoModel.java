package com.excercise.feedlist.model;

import retrofit2.Callback;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by pradeepraj-ext on 27-04-2016.
 */
public class ListDemoModel {

    public static final String BASE_URL = "https://dl.dropboxusercontent.com/";

    private ListDemoService mService;

    public ListDemoModel() {

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        mService = retrofit.create(ListDemoService.class);
    }

    public void getListData(Callback<ListData> callback) {
        mService.getData().enqueue(callback);
    }
}
