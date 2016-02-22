package com.example.harris.school;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.zip.Inflater;

import io.realm.RealmBasedRecyclerViewAdapter;
import io.realm.RealmResults;
import io.realm.RealmViewHolder;
import io.realm.internal.Context;

/**
 * Created by Harris on 2/6/2016.
 */



public class RecyclerViewAdapter extends RealmBasedRecyclerViewAdapter<dbItem,
        RecyclerViewAdapter.ViewHolder> {
    private static final String TAG = "MyLog";
    dbItem dbItem;
    public RecyclerViewAdapter(
            android.content.Context context,
            RealmResults<dbItem> realmResults,
            boolean automaticUpdate,
            boolean animateIdType) {
        super(context, realmResults, automaticUpdate, animateIdType);
    }

    public class ViewHolder extends RealmViewHolder {

        public TextView subject;
        public TextView Date;
        public TextView details;


        public ViewHolder(LinearLayout container) {
            super(container);
            this.subject = (TextView) container.findViewById(R.id.subject);
            this.Date = (TextView) container.findViewById(R.id.date);
            this.details = (TextView) container.findViewById(R.id.details);

        }
    }

    @Override
    public ViewHolder onCreateRealmViewHolder(ViewGroup viewGroup, int viewType) {
        View v = inflater.inflate(R.layout.view_item, viewGroup, false);
        ViewHolder vh = new ViewHolder((LinearLayout) v);
        return vh;
    }

    @Override
    public void onBindRealmViewHolder(ViewHolder viewHolder, int position) {
        dbItem = realmResults.get(position);

        viewHolder.subject.setText(dbItem.getSubject());
        viewHolder.Date.setText(dbItem.getDate());

        viewHolder.details.setText(dbItem.getDetails());
        Log.d(TAG, "It got to the onBindViewHolder with the values: ");
        Log.d(TAG, dbItem.getSubject());
    }

    @Override
    public ViewHolder convertViewHolder(RealmViewHolder realmViewHolder) {
        return null;
    }
}
