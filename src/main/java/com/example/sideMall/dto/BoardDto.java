package com.example.sideMall.dto;

import lombok.Data;

@Data
public class BoardDto extends CommonDto{

    private String boardId; //고유키
    private String view; //조회수
    private String title; //제목
    private String content; //내용
    private String cmt; //댓글

}
