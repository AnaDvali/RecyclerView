package com.example.ana.recyclerview;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ViewHolder>{
    public String names[] = {
      "Mamuka Kurtskhalidze",
      "Davit Gachechiladze",
      "Ana Dvali",
      "Beso Tabatadze",
      "Dea Zambakhidze"
    };

    public String professions[] = {
            "Student",
            "Java programmer",
            "Student",
            "Lecturer",
            "Designer"
    };

    public int images[] = {
            R.drawable.image1,
            R.drawable.image4,
            R.drawable.image5,
            R.drawable.image3,
            R.drawable.image2,
    };

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.card_view, viewGroup, false);
        ViewHolder viewHolder = new ViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        viewHolder.txtHeader.setText(names[i]);
        viewHolder.txtProfession.setText(professions[i]);
        viewHolder.imageView.setImageResource(images[i]);
    }

    @Override
    public int getItemCount() {
        return names.length;
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        public ImageView imageView;
        public TextView txtHeader;
        public TextView txtProfession;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = (ImageView) itemView.findViewById(R.id.image);
            txtHeader = (TextView) itemView.findViewById(R.id.name);
            txtProfession = (TextView) itemView.findViewById(R.id.profession);
        }
    }
}
