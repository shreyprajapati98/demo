package com.demo.demo.view.recycler;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.demo.demo.R;
import com.demo.demo.api.pojo.ExplorePOJO;

import java.util.List;

public class RecyclerExplore extends RecyclerView.Adapter<RecyclerExplore.MyViewHolder> {

    private List<ExplorePOJO> exploreDataList;
    public Context context;

    static class MyViewHolder extends RecyclerView.ViewHolder {
        ImageView iv_galleryImage;
        CardView recycler_image;

        MyViewHolder(View view) {
            super(view);
            recycler_image = (CardView) view.findViewById(R.id.recycler_explore);
            iv_galleryImage = (ImageView) view.findViewById(R.id.iv_explore_image_recyclerImageGallery);

        }
    }

    public RecyclerExplore(Context context, List<ExplorePOJO> exploreDataList) {
        this.context = context;
        this.exploreDataList = exploreDataList;
    }

    @NonNull
    @Override
    public RecyclerExplore.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.recycler_explore, parent, false);

        return new RecyclerExplore.MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerExplore.MyViewHolder holder, final int position) {
        final ExplorePOJO data = exploreDataList.get(position);
        final String imageURL = data.getImage();
        RequestOptions options = new RequestOptions().error(R.drawable.ic_launcher_background);
        Glide.with(context)
                .load(imageURL)
                .apply(options)
                .into(holder.iv_galleryImage);

    }

    @Override
    public int getItemCount() {
        return exploreDataList.size();
    }
}
