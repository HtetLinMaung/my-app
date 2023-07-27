package com.mycompany.models;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ResponseBody {
    private int code;
    private String message;
}
