package com.trip.trip_api.entity;

import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
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

    @Column(name="episode_uuid")
    private String episodeUuid;
}