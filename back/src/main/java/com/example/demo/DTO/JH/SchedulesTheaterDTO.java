package com.example.demo.DTO.JH;

import java.sql.Timestamp;
import java.util.Date;

import lombok.Data;

@Data
public class SchedulesTheaterDTO {
    
    private Integer schedule_id;
    private Integer cinema_id;
    private Integer theater_id;
    private Integer movie_id;
    private Timestamp start_time;
    private Timestamp end_time;
    private Date created;

    private String title;
    private String certification;
    private String poster_path;

    private String theater_type; //theater 의 info
    private Integer screen_no;

    private String name;

}
