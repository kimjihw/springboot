package com.school.springboot.domain.entity;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@NoArgsConstructor
@Getter
@Entity
@Table(name = "board")
public class BoardEntity extends TimeEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 10, nullable = false)
    private String writer;

    @Column(length = 100, nullable = false)
    private String title;

    @Column(columnDefinition = "TEXT", nullable = false)
    private String content;


    @Column(nullable = false)
    private String origFilename;

    @Column(nullable = false)
    private String filename;


    @Builder
    public BoardEntity(Long id, String title, String content, String writer, String origFilename, String filename){
        this.id = id;
        this.writer = writer;
        this.title = title;
        this.content = content;
        this.origFilename = origFilename;
        this.filename = filename;

    }
}
