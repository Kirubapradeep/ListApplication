package com.excercise.feedlist.model;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by pradeepraj-ext on 27-04-2016.
 */
public interface ListDemoService {
    @GET("u/746330/facts.json")
    Call<ListData> getData();
}
