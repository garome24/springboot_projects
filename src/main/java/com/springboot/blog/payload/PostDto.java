package com.springboot.blog.payload;

import lombok.Data;

@Data //Generate getters for all fields
public class PostDto {
    private Long id;
    private String title;
    private String description;
    private String content;
}
