package com.sparta.post.entity;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import javax.swing.*;
import java.time.LocalDateTime;

@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public class Timestamped {

    @CreatedDate
    private LocalDateTime createdAt;

//    public LocalDateTime getCreatedAt() {
//        return createdAt;
//    }

    @LastModifiedDate
    private LocalDateTime modifiedAt;

    public LocalDateTime getModifiedAt() {
        return modifiedAt;
    }


    public LocalDateTime getCreateAt() {
        return createdAt;
    }
}

