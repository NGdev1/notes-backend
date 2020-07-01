package com.md.mylists.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
public class Note {
    @Setter @Getter
    private Integer id;

    @Setter @Getter
    private String name;

    @Setter @Getter
    private Integer price;

    @Setter @Getter
    private Boolean isDone;
}
