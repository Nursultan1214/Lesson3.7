package com.example.andr17.CharacterFragment;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.andr17.R;
import com.example.andr17.models.Characters;

import java.util.ArrayList;

public class CharacterAdapter extends RecyclerView.Adapter<CharacterAdapter.CharacterHolder> {
    private ArrayList<Characters> list;
    private OnItemClickListener onItemClickListener;

    public CharacterAdapter(Context context, ArrayList<Characters> list) {
        this.list = new ArrayList<>();
        this.list = list;
        notifyDataSetChanged();
    }

    public Characters getItem (int pos){
        return list.get(pos);
    }

    public void setOnItemClickListener(OnItemClickListener onItemClickListener) {
        this.onItemClickListener = onItemClickListener;
    }

    @NonNull
    @Override
    public CharacterHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.character_item,parent,false );
        return new CharacterHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CharacterHolder holder, int position) {
        holder.onBind(list.get(position));
        holder.itemView.setOnClickListener(v -> onItemClickListener.onClick(position));
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class CharacterHolder extends RecyclerView.ViewHolder {
        private TextView name , status;
        private ImageView image;
        public CharacterHolder(@NonNull View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.tv_name);
            status = itemView.findViewById(R.id.tv_status);
            image = itemView.findViewById(R.id.image_personage);
        }

        public void onBind(Characters characters) {
            name.setText(characters.getName());
            status.setText(characters.getStatus());
            image.setImageResource(characters.getImage());
        }
    }

    public interface OnItemClickListener {
       void onClick(int pos);
    }
}
