package com.example.polling.payload;

import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
public class VoteRequest {

    @NotNull
    private Long choiceId;
}
