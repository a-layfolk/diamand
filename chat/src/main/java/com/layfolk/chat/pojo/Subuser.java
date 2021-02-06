package com.layfolk.chat.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Subuser {

    private String subuser_id;
    private String username;
    private String password;
    private Date create_time;
    private Date last_modified_time;

}
