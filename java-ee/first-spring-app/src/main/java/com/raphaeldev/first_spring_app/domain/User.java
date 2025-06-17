package com.raphaeldev.first_spring_app.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;

// Lombok annotations
// @Getter and @Setter: generate getters and setters
// @NoArgsConstructor: constructor does not need arguments
@Getter
@Setter
@NoArgsConstructor
public class User {
    private String name;
    private String email;
}
