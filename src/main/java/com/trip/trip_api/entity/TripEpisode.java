package com.trip.trip_api.entity;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "trip_episodes")
@AllArgsConstructor
@NoArgsConstructor
public class TripEpisode {
    @Id
    @Column(name="id")
    private int id;

    @Column(name="title")
    private String title;

    @Column(name="date_created")
    private LocalDate dateCreated;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    } 

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public LocalDate getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(LocalDate dateCreated) {
        this.dateCreated = dateCreated;
    }

    @Override
    public String toString() {
        return "TripEpisode{" +
            "id=" + id +
            ", title='" + title + '\'' +
            ", dateCreated=" + dateCreated +
            '}';
    }
}