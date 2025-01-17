package com.trip.trip_api.entity;

import java.sql.Timestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "trip_episodes")
public class TripEpisode {
  @Id
  @Column(name="id")
  private int id;

  @Column(name="title")
  private String title;

  @Column(name="date_created")
  private Timestamp dateCreated;

  @Override
  public String toString() {
      return "TripEpisode{" +
              "id=" + id +
              ", title='" + title + '\'' +
              ", dateCreated=" + dateCreated +
              '}';
  }
}