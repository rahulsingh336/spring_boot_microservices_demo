package com.rs.springframework.service.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by E076103 on 04-10-2018.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Image {

  private int id;
  private String title;
  private String url;

}
