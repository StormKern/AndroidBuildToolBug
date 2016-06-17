package com.mlabodda.buildtooldrawablebug.recycler;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.mlabodda.buildtooldrawablebug.R;
import com.mlabodda.buildtooldrawablebug.recycler.viewholder.DemoViewHolder;

import java.util.List;

/**
 * Created by mlabodda on 6/16/16.
 */

public class DemoRecyclerAdapter extends RecyclerView.Adapter<DemoViewHolder> {

    private List<String> mStrings;

    public DemoRecyclerAdapter(List<String> strings) {
        mStrings = strings;
    }

    @Override
    public DemoViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.viewholder_demo, parent, false);
        return new DemoViewHolder(view);
    }

    @Override
    public void onBindViewHolder(DemoViewHolder holder, int position) {
        holder.bindString(mStrings.get(position));
    }

    @Override
    public int getItemCount() {
        return mStrings != null ? mStrings.size() : 0;
    }
}
