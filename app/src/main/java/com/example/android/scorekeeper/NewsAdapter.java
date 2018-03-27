package com.example.android.scorekeeper;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class NewsAdapter extends ArrayAdapter<PieceOfNews> {

    public NewsAdapter(Activity context, ArrayList<PieceOfNews> news) {
        super(context, 0, news);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View listItemView = convertView;

        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.piece_of_news_list_item, parent, false);
        }

        final PieceOfNews currentPieceOfNews = getItem(position);
        assert currentPieceOfNews != null;

        RelativeLayout relativeLayout = listItemView.findViewById(R.id.relativeLayout);
        relativeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri pieceOfNewsUri = Uri.parse(currentPieceOfNews.getUrl());
                Intent websiteIntent = new Intent(Intent.ACTION_VIEW, pieceOfNewsUri);
                getContext().startActivity(websiteIntent);
            }
        });

        ImageView courseImage = listItemView.findViewById(R.id.imageImageView);

        Glide.with(getContext())
                .load(currentPieceOfNews.getImageUrl())
                .apply(
                        new RequestOptions()
                        .error(R.drawable.news_default_image)
                        .placeholder(R.drawable.news_default_image))
                .into(courseImage);

        TextView courseName = listItemView.findViewById(R.id.titleTextView);
        courseName.setText(currentPieceOfNews.getTitle());

        TextView courseDescription = listItemView.findViewById(R.id.descriptionTextView);
        if (!currentPieceOfNews.getDescription().equals("null"))
            courseDescription.setText(currentPieceOfNews.getDescription());
        else courseDescription.setVisibility(View.GONE);

        return listItemView;
    }
}
