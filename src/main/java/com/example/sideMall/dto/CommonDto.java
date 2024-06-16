package com.example.sideMall.dto;

import lombok.Data;

@Data
public class CommonDto {


    private String rgstAt; //등록일
    private String rgstId; //등록자
    private String updateAt; //수정일
    private String updateId; //수정자
    private String page;  //현재 페이지
    private String totalCount; //총 개수

}
