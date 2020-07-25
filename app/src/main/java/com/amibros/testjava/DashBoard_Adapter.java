package com.amibros.testjava;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class DashBoard_Adapter extends RecyclerView.Adapter<DashBoard_Adapter.ListViewHolder> {

    String data1[], data2[];
    int images[];
    Context context;

    public DashBoard_Adapter(Context ct, String s1[], String s2[], int img[]) {
        context = ct;
        data1 = s1;
        data2 = s2;
        images = img;

    }

    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View view = layoutInflater.inflate(R.layout.dashboard_card_layout, parent, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ListViewHolder holder, int position) {
        holder.itemTitle.setText(data1[position]);
        holder.itemDescriptiom.setText(data2[position]);
        holder.img.setImageResource(images[position]);
    }

    @Override
    public int getItemCount() {
        return data1.length;
    }

    public class ListViewHolder extends RecyclerView.ViewHolder {
        TextView itemTitle, itemDescriptiom;
        ImageView img;

        public ListViewHolder(@NonNull View itemView) {
            super(itemView);
            itemTitle = itemView.findViewById(R.id.item_title);
            itemDescriptiom = itemView.findViewById(R.id.item_description);
            img = itemView.findViewById(R.id.item_img);
        }
    }
}
