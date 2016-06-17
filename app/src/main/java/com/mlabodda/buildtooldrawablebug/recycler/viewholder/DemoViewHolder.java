package com.mlabodda.buildtooldrawablebug.recycler.viewholder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.mlabodda.buildtooldrawablebug.R;

/**
 * Created by mlabodda on 6/16/16.
 */

public class DemoViewHolder extends RecyclerView.ViewHolder {

    private TextView textView;

    public DemoViewHolder(View itemView) {
        super(itemView);
        textView = (TextView) itemView.findViewById(R.id.textView);
    }

    public void bindString(String string) {
        textView.setText(string);
    }
}
