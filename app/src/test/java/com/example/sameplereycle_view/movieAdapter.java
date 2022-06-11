package com.example.sameplereycle_view;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.a2117368_finaltest.R;

public class movieAdapter extends RecyclerView.Adapter<movieAdapter.viewHolder> {
    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    static class viewHolder extends RecyclerView.ViewHolder{
        TextView movieName;
        TextView peopleCount;

        public viewHolder(View itemView) {
            super(itemView);

            movieName = itemView.findViewById(R.id.movieName);
            peopleCount = itemView.findViewById(R.id.peopleCount);

        }

        //public void movie_Item(movieAdapter) {
            //movieName.setText(movie_Item.getmovieName);
           // peopleCount.setText(movie_Item.getpeopleCount);
        }
    }
