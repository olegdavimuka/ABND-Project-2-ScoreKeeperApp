package com.example.android.scorekeeper;

public class PieceOfNews {
    private String title;
    private String description;
    private String url;
    private String imageUrl;

    public PieceOfNews(String title, String description, String url, String imageUrl) {
        this.title = title;
        this.description = description;
        this.url = url;
        this.imageUrl = imageUrl;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getUrl() {
        return url;
    }

    public String getImageUrl() {
        return imageUrl;
    }
}
