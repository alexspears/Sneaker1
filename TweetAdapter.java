package com.example.alex.sneaker1;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

public class TweetAdapter extends ArrayAdapter {
    private LayoutInflater inflater;

    public TweetAdapter(Activity activity, String[] items) {
        super(activity, R.layout.row_sneaker, items);
        inflater = activity.getWindow().getLayoutInflater();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        return inflater.inflate(R.layout.row_sneaker, parent, false);
    }

}