package com.lab11java401d3.songr.database;

import com.lab11java401d3.songr.database.Album;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface AlbumRepository extends JpaRepository<Album, Long> {
}
