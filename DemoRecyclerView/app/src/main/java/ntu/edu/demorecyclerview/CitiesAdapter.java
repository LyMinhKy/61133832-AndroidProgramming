package ntu.edu.demorecyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.zip.Inflater;

public class CitiesAdapter extends RecyclerView.Adapter<CitiesAdapter.ItemCitiesHolder> {
    Context context;
    ArrayList<Cities> listData;

    public CitiesAdapter(Context context, ArrayList<Cities> listData) {
        this.context = context;
        this.listData = listData;
    }

    @NonNull
    @Override
    public ItemCitiesHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater cai_bom = LayoutInflater.from(context);
        View vItem = cai_bom.inflate(R.layout.item_cities,parent,false);
        ItemCitiesHolder viewholderCreated = new ItemCitiesHolder(vItem);
        return viewholderCreated;
    }

    @Override
    public void onBindViewHolder(@NonNull ItemCitiesHolder holder, int position) {
        //Lay doi tuong hien thi
        Cities citiesHienthi = listData.get(position);
        //Trich thong tin
        String caption = citiesHienthi.getCitiesCaption();
        String tenFileAnh= citiesHienthi.getCitiesImageFileName();
        //Dat cac truong thong tin cua holder
        holder.tvCaption.setText(caption);
            //dat anh
            String packetName = holder.itemView.getContext().getPackageName();
            int imageId = holder.itemView.getResources().getIdentifier(tenFileAnh, "mipmap", packetName);
        holder.ivCities.setImageResource(imageId);
    }

    @Override
    public int getItemCount() {
        return 0;
    }

    class ItemCitiesHolder extends RecyclerView.ViewHolder{
        TextView tvCaption;
        ImageView ivCities;
        public ItemCitiesHolder(@NonNull View itemView) {
            super(itemView);
            tvCaption = itemView.findViewById(R.id.textViewCaption);
            ivCities = itemView.findViewById(R.id.imageViewCity);
        }
    }
}
