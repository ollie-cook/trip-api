package com.trip.trip_api.entity;

import jakarta.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "trip_episodes")
public class TripEpisodes {
  @Id
  @Column(name="id")
  private int id;

  @Column(name="title")
  private String title;

  @Column(name="date_created")
  private Timestamp dateCreated;
}