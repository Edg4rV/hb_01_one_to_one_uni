package io.hibernate.entity

import groovy.transform.Canonical

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name="Instructor_detail")
class InstructorDetail {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    int id

    @Column(name="youtube_channel")
    String youtubeChannel

    @Column(name="hobby")
    String hobby

    InstructorDetail() {
    }

    InstructorDetail(String youtubeChannel, String hobby) {
        this.youtubeChannel = youtubeChannel
        this.hobby = hobby
    }
}
