package com.whohim.ai.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.LocalDate;

public class Book {
    @JsonProperty("title")      // 字段名与 JSON 键匹配
    private String title;

    @JsonProperty("publishDate")
    private LocalDate publishDate;

    @JsonProperty("description")
    private String description;

    public Book() {
    }

    public Book(String title, LocalDate publishDate, String description) {
        this.title = title;
        this.publishDate = publishDate;
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public LocalDate getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(LocalDate publishDate) {
        this.publishDate = publishDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
