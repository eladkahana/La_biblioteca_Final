package com.DTOs;


import lombok.Data;

import java.io.Serializable;

@Data
public class CopiesDTO implements Serializable {
    private static final long serialVersionUID = 1L;
    private Integer id;

    private Integer originalID;

    private String copyISBN;

    private Boolean isExist;

}
