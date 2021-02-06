package com.layfolk.chat.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Avatar {
    private String ava_id;
    private String ava_name;
    private Boolean gender;
    private String avatar_img_url;
    private String description;
    private Date create_time;
    private Date last_modified_time;
}
