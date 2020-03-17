package com.pickurapps.recyclerpluscardtryout;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter {
    private Context mContext;
    private List<Book> mData;

    public RecyclerViewAdapter(Context context, List<Book> data) {
        mContext = context;
        mData = data;
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {
        TextView tvBookTitle;
        ImageView imgBookTumbnail;
        CardView cardView;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            tvBookTitle = itemView.findViewById(R.id.book_title_id);
            imgBookTumbnail = itemView.findViewById(R.id.book_img_id);
            cardView = itemView.findViewById(R.id.cardview_id);
        }
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view;
        LayoutInflater mInflater = LayoutInflater.from(mContext);
        view = mInflater.inflate(R.layout.cardview_item_book, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        ((MyViewHolder) holder).tvBookTitle.setText(mData.get(position).getTitle());
        ((MyViewHolder) holder).imgBookTumbnail.setImageResource(mData.get(position).getThumbnail());
        ((MyViewHolder) holder).cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // What to do when a card view is clicked
            }
        });
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }
}
