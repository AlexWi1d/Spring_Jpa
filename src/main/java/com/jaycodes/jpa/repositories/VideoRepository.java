package com.jaycodes.jpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jaycodes.jpa.models.Video;

public interface VideoRepository extends JpaRepository<Video, Integer> {

}
