package com.example.sideMall.dto;

import lombok.Data;

@Data
public class UserDto extends CommonDto{

    private String userId; //고유키
    private String email; //이메일
    private String password; //비밀번호
    private String nick; //닉네임
    private String gender; //성별
    private String birth; //생년월일


}
