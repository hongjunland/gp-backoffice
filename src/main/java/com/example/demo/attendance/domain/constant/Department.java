package com.example.demo.attendance.domain.constant;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum Department {

    DED("Data Engineering Department"),
    DAE("Data Analytics Department");

    private final String description;
}