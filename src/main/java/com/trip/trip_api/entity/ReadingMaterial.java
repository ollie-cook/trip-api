package com.trip.trip_api.entity;

import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "reading_material")
@AllArgsConstructor
@NoArgsConstructor
public class ReadingMaterial {

    @Id
    @Column(name="uuid")
    private UUID uuid;

    @Column(name="title")
    private String title;

    @Column(name="description")
    private String description;

    @Column(name="author")
    private String author;

    @Column(name="url")
    private String url;

    @Column(name="type")
    private String type;

    @ManyToOne
    @JoinColumn(name = "episode_uuid")
    private TripEpisode tripEpisode;

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}