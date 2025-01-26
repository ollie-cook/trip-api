package com.trip.trip_api.entity;

import java.time.LocalDate;
import java.util.UUID;
import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "trip_episodes")
@AllArgsConstructor
@NoArgsConstructor
public class TripEpisode {

    @Id
    @Column(name="uuid")
    private UUID uuid;

    @Column(name="episode_no")
    private int episodeNo;

    @Column(name="title")
    private String title;

    @Column(name="summary")
    private String summary;

    @Column(name="url")
    private String url;
    

    @Column(name="date_created")
    private LocalDate dateCreated;

    @OneToMany(mappedBy = "tripEpisode")
    Set<ReadingMaterial> readingMaterials;

    public int getId() {
        return episodeNo;
    }

    public void setId(int episodeNo) {
        this.episodeNo = episodeNo;
    } 

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public UUID getUuid() {
        return uuid;
    }

    public void setUrl(UUID uuid) {
        this.uuid = uuid;
    }

    public LocalDate getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(LocalDate dateCreated) {
        this.dateCreated = dateCreated;
    }

    public Set<ReadingMaterial> getReadingMaterials() {
        return readingMaterials;
    }
    
    public void setReadingMaterials(Set<ReadingMaterial> readingMaterials) {
        this.readingMaterials = readingMaterials;
    }

    @Override
    public String toString() {
        return "TripEpisode{" +
            "episodeNo=" + episodeNo +
            ", title='" + title + '\'' +
            ", dateCreated=" + dateCreated +
            '}';
    }
}