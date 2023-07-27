package com.mycompany.models;

import lombok.AllArgsConstructor;
// import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
public class ResponseBody {
    private int code;
    private String message;
}
