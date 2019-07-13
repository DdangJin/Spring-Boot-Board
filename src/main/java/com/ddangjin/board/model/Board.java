package com.ddangjin.board.model;

import lombok.Data;

import java.util.Date;

@Data
public class Board {
    private int bid;
    private String group;
    private String category;
    private int userUid;
    private String title;
    private String contents;
    private int hits;
    private Date createDate;
    private Date updateDate;
    private boolean delete_flag;
}
