package com.example.polling.payload;

import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
public class ApiResponse {

    private Boolean success;
    private String message;

    public ApiResponse(Boolean success, String message) {
        this.success = success;
        this.message = message;
    }

}
