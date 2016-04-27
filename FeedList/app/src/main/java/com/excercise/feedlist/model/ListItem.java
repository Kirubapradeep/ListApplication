package com.excercise.feedlist.model;

/**
 * Created by pradeepraj-ext on 27-04-2016.
 */
public class ListItem {
    // Title String for the Row item
    public String title;

    // Description String for the Row item
    public String description;

    // imageHref url for the Row item
    public String imageHref;

    @Override
    public String toString() {
        return "ListItem{" +
                "title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", imageHref='" + imageHref + '\'' +
                '}';
    };
}
