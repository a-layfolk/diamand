package com.layfolk.chat.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PrimaryUser {
    private String pri_usr_id;
    private String phone;
    private String password;
    private Boolean gender;
    private Date create_time;
    private Date last_modified_time;
    private String avatar_img_url;
}
