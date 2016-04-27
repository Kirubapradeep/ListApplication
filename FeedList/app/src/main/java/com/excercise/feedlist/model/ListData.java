package com.excercise.feedlist.model;

import android.app.LauncherActivity;

import java.util.List;

/**
 * Created by pradeepraj-ext on 27-04-2016.
 */
public class ListData {

    //Title
    public String title;

    //List of rows json objs
    public List<ListItem> rows;

    @Override
    public String toString() {
        return "ListData{" +
                "title='" + title + '\'' +
                ", rows=" + rows +
                '}';
    }
}
