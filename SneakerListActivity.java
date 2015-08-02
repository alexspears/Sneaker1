package com.example.alex.sneaker1;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;


public class SneakerListActivity extends ListActivity {

    private ListView sneakerListView;

    private ArrayAdapter sneakerItemArrayAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sneaker_list);

        sneakerItemArrayAdapter = new TweetAdapter(this, new String[10]);
        setListAdapter(sneakerItemArrayAdapter);
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        Intent intent = new Intent(this, TweetDetailActivity.class);
        startActivity(intent);
    }
}
