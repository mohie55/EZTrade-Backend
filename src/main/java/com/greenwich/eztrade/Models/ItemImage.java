package com.greenwich.eztrade.Models;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

@Table("item_image")
public class ItemImage {

    @Column("item_image_id")
    @Id
    private int itemImageId;

    @Column("item_id")
    private int itemId;

    @Column("download_url")
    private String downloadUrl;

    public ItemImage(int itemId, String downloadUrl) {
        this.itemId = itemId;
        this.downloadUrl = downloadUrl;
    }

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public String getDownloadUrl() {
        return downloadUrl;
    }

    public void setDownloadUrl(String downloadUrl) {
        this.downloadUrl = downloadUrl;
    }
}
