package com.example.aplikasiactivity.activity;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.aplikasiactivity.R;
import com.example.aplikasiactivity.Room.Mahasiswa;

import java.util.List;

public class RecyclerViewUserAdapter extends RecyclerView.Adapter<RecyclerViewUserAdapter.MyViewHolder> {
    private Context mContext;
    private List<Mahasiswa> myList;

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView tvAlamat;
        public TextView tvKejuruan;
        public TextView tvNama;
        public TextView tvNim;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            tvAlamat = itemView.findViewById(R.id.tvAlamat);
            tvKejuruan = itemView.findViewById(R.id.tvKejuruan);
            tvNim= itemView.findViewById(R.id.tvNim);
            tvNama = itemView.findViewById(R.id.tvNama);
        }
    }

    public RecyclerViewUserAdapter(Context mContext, List<Mahasiswa> albumList){
        this.mContext = mContext;
        this.myList = albumList;
    }

    @NonNull
    @Override
    public RecyclerViewUserAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.activity_add_user, parent, false);
        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewUserAdapter.MyViewHolder myViewHolder, int i) {
        final Mahasiswa album = myList.get(i);
        myViewHolder.tvNama.setText(album.getNama());
        myViewHolder.tvNim.setText(album.getNim());
        myViewHolder.tvKejuruan.setText(album.getKejuruan());
        myViewHolder.tvAlamat.setText(album.getAlamat());
    }

    @Override
    public int getItemCount() {
        return myList.size();
    }
}
