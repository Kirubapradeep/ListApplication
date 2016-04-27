package com.excercise.feedlist;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.excercise.feedlist.model.ListItem;

import java.util.List;

/**
 * Created by pradeepraj-ext on 27-04-2016.
 */
public class ListDemoAdapter extends RecyclerView.Adapter<ListDemoAdapter.ViewHolder> {

    private List<ListItem> mItems;

    public ListDemoAdapter(List<ListItem> listItems, Context context) {
        mItems = listItems;
    }

    @Override
    public ListDemoAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(ListDemoAdapter.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        TextView title;
        TextView description;

        public ViewHolder(View itemView) {
            super(itemView);
        }
    }
}
