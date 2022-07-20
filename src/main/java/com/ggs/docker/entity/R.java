package com.ggs.docker.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class R implements Serializable {

    private String code;

    private String message;

    private Object data;

    public static R ok() {
        return R.builder().code("200").message("success").build();
    }

    public static R fail() {
        return R.builder().code("500").message("fail").build();
    }

    public R code(String code) {
        this.code = code;
        return this;
    }

    public R message(String message) {
        this.message = message;
        return this;
    }

    public R data(Object data) {
        this.data = data;
        return this;
    }

}
