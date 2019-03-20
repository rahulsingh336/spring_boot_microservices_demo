package com.rs.springframework.service.model;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by E076103 on 04-10-2018.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Gallery {

  private int id;
  private List<Object> images;

  public Gallery(int galleryId) {
    this.id = galleryId;
  }
}
