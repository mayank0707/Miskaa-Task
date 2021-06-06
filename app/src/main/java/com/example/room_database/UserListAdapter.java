package com.example.room_database;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


import com.example.room_database.db.User;

import java.util.List;

public class UserListAdapter extends RecyclerView.Adapter<UserListAdapter.MyViewHolder> {

    private Context context;
    private List<User> userList;
    public UserListAdapter(Context context) {
        this.context = context;
    }

    public void setUserList(List<User> userList) {
        this.userList = userList;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public UserListAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.recycler_row, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        String name="Country Name: "+this.userList.get(position).name;
        String capital="Capital: "+this.userList.get(position).capital;
        String region="Region: "+this.userList.get(position).region;
        String subregion="Sub Region: "+this.userList.get(position).sub_region;
        String population="Population: "+this.userList.get(position).population;
        holder.tvName.setText(name);
        holder.tvCapital.setText(capital);
        holder.tvRegion.setText(region);
        holder.tvSubRegion.setText(subregion);
        holder.tvPopulation.setText(population);

    }

    @Override
    public int getItemCount() {
        return  this.userList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{
        TextView tvName;
        TextView tvCapital;
        TextView tvRegion;
        TextView tvSubRegion;
        TextView tvPopulation;

        public MyViewHolder(View view) {
            super(view);
            tvName = view.findViewById(R.id.tvName);
            tvCapital = view.findViewById(R.id.tvCapital);
            tvRegion = view.findViewById(R.id.region);
            tvSubRegion = view.findViewById(R.id.subregion);
            tvPopulation = view.findViewById(R.id.population);

        }
    }
}