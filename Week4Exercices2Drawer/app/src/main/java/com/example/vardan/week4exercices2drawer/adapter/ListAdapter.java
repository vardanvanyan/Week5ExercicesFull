package com.example.vardan.week4exercices2drawer.adapter;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.vardan.week4exercices2drawer.R;
import com.example.vardan.week4exercices2drawer.activity.GoodsDescriptionActivity;
import com.example.vardan.week4exercices2drawer.model.ListModel;
import com.example.vardan.week4exercices2drawer.provider.MyProvider;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

public class ListAdapter extends RecyclerView.Adapter<ListAdapter.ListViewHolder> implements Filterable {

    public static final String KEY = "key";
    private Context context;
    private List<ListModel> userList;
    private List<ListModel> listFiltred;

    public ListAdapter(Context context, List<ListModel> userList) {
        this.context = context;
        this.userList = userList;
        this.listFiltred = userList;
    }

    @Override
    public ListViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater =
                (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        assert inflater != null;
        final View view = LayoutInflater.from(context).inflate(R.layout.list_item, parent, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ListViewHolder holder, @SuppressLint("RecyclerView") final int position) {
        final ListModel item = listFiltred.get(position);
        holder.itemName.setText(item.getTitle());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                for (int i = 0; i < MyProvider.list.size(); i++) {
                    if (MyProvider.list.get(i).getTitle().equals(listFiltred.get(position).getTitle())) {
                        MyProvider.position = i;
                    }
                }
                Intent intent = new Intent(context, GoodsDescriptionActivity.class);
                context.startActivity(intent);
            }
        });
        Picasso.get()
                .load(item.getImageUrl()[0])
                .placeholder(R.drawable.ic_cart_24dp)
                .error(R.mipmap.ic_launcher)
                .into(holder.imageView);
    }

    @Override
    public int getItemCount() {
        return listFiltred.size();
    }

    @Override
    public Filter getFilter() {
        return new Filter() {
            @Override
            protected FilterResults performFiltering(CharSequence constraint) {
                String charString = constraint.toString();
                if (charString.isEmpty()) {
                    listFiltred = userList;

                } else {
                    List<ListModel> filteredList = new ArrayList<>();
                    for (ListModel fl : userList) {
                        if (fl.getTitle().toLowerCase().contains(charString.toLowerCase())) {
                            filteredList.add(fl);

                        }
                    }
                    listFiltred = filteredList;
                }
                FilterResults filterResults = new FilterResults();
                filterResults.values = listFiltred;
                filterResults.count = listFiltred.size();
                return filterResults;
            }

            @Override
            protected void publishResults(CharSequence constraint, FilterResults results) {
                listFiltred = (ArrayList<ListModel>) results.values;
                notifyDataSetChanged();
            }
        };
    }

    class ListViewHolder extends RecyclerView.ViewHolder {

        ImageView imageView;
        TextView itemName;
        ImageButton like;
        ImageButton basket;


        ListViewHolder(View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.list_item_image);
            itemName = itemView.findViewById(R.id.list_item_name);
            like = itemView.findViewById(R.id.like_id);
            basket = itemView.findViewById(R.id.basket_id);

            like.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (!userList.get(getAdapterPosition()).getLiked()) {
                        like.setImageResource(R.drawable.ic_favorite_black_24dp);
                        MyProvider.list.get(getAdapterPosition()).setLiked(true);
                    } else {
                        like.setImageResource(R.drawable.ic_favorite_24dp);
                        MyProvider.list.get(getAdapterPosition()).setLiked(false);
                    }
                }
            });

            basket.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    if (!userList.get(getAdapterPosition()).getToBasket()) {
                        basket.setImageResource(R.drawable.ic_shopping_cart_black_24dp);
                        MyProvider.list.get(getAdapterPosition()).setToBasket(true);

                    } else {
                        basket.setImageResource(R.drawable.ic_cart_24dp);
                        MyProvider.list.get(getAdapterPosition()).setToBasket(false);
                    }
                }
            });
        }
    }
}