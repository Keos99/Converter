package com.example.converter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MainActivityRVAdapter extends RecyclerView.Adapter<MainActivityRVAdapter.ViewHolder> {

    private final List<Conversion> mConversions;
    private final IMainItemClickListener mMainClickListener;

    public MainActivityRVAdapter(List<Conversion> mConversions, IMainItemClickListener mMainClickListener) {
        this.mConversions = mConversions;
        this.mMainClickListener = mMainClickListener;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        final LayoutInflater layoutInflater = LayoutInflater.from(viewGroup.getContext());
        final View view = layoutInflater.inflate(R.layout.main_rv_item, viewGroup,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        final  Conversion conversion = mConversions.get(position);
        holder.bind(conversion);
    }

    @Override
    public int getItemCount() {
        return mConversions.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder{

        final TextView mTextViev;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            mTextViev = itemView.findViewById(R.id.rvtextviev);
        }

        public void bind(Conversion conversion){
            mTextViev.setText(conversion.lable);
        }
    }
}

