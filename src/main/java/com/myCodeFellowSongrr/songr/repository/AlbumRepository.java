package com.myCodeFellowSongrr.songr.repository;

import com.myCodeFellowSongrr.songr.model.Album;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlbumRepository extends JpaRepository<Album, Long> {

}
