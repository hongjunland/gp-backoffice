package com.example.demo.attendance.global.utils;

import com.example.demo.attendance.global.error.ErrorCode;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class ReturnObject {

    private final boolean success; // 성공 여부

    private final Object data; // 결과값

    private final ErrorCode errorCode;

}