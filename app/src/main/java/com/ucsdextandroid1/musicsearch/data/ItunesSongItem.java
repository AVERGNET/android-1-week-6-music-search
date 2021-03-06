package com.ucsdextandroid1.musicsearch.data;

import com.google.gson.annotations.SerializedName;

/**
 * Created by rjaylward on 2019-05-11
 */
public class ItunesSongItem implements SongItem {

    //TODO add all the members to this class with proper serialized names
    @SerializedName("trackId")
    private long trackId;
    @SerializedName("trackName")
    private String trackName;
    @SerializedName("artistName")
    private String artistName;
    @SerializedName("collectionName")
    private String albumName;
    @SerializedName("artworkUrl100")
    private String artworkUrl;
    @SerializedName("previewUrl")
    private String previewUrl;
    @SerializedName("trackTimeMillis")
    private long trackTime;

    public ItunesSongItem(long trackId, String trackName, String artistName, String albumName, String artworkUrl, String previewUrl, long trackTime){
        this.trackTime = trackTime;
        this.previewUrl = previewUrl;
        this.artworkUrl = artworkUrl;
        this.artistName = artistName;
        this.albumName = albumName;
        this.artistName = trackName;
        this.trackName = trackName;
        this.trackId = trackId;
    }

    @Override
    public long getTrackId() {
        return trackId;
    }
    @Override
    public String getTrackName() {
        return trackName;
    }
    @Override
    public String getArtistName() {
        return artistName;
    }
    @Override
    public String getAlbumName() {
        return albumName;
    }
    @Override
    public String getArtworkUrl() {
        return artworkUrl;
    }
    @Override
    public String getPreviewUrl() {
        return previewUrl;
    }
    @Override
    public long getTrackTime() {
        return trackTime;
    }

}
