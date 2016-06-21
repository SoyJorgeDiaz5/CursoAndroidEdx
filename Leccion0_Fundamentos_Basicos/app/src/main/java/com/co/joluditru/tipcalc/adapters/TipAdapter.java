package com.co.joluditru.tipcalc.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.co.joluditru.tipcalc.R;
import com.co.joluditru.tipcalc.models.TipRecord;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by joluditru on 21/06/2016.
 */
public class TipAdapter extends RecyclerView.Adapter<TipAdapter.ViewHolder> {
    Context context;
    List<TipRecord> dataSet;

    public TipAdapter(Context context, List<TipRecord> dataSet) {
        this.context = context;
        this.dataSet = dataSet;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                        .inflate(R.layout.item_row, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        TipRecord element = dataSet.get(position);
        String strTip = String.format(
                            context.getString(R.string.global_message_tip),
                            element.getTip());
        holder.lblContent.setText(strTip);
    }

    public void add(TipRecord record){
        dataSet.add(0, record);
        notifyDataSetChanged();
    }

    public void clear(){
        dataSet.clear();
        notifyDataSetChanged();
    }

    @Override
    public int getItemCount() {
        return dataSet.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{
        @BindView(R.id.lbl_content)
        TextView lblContent;

        public ViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }
}
