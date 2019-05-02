package com.lab11java401d3.songr;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND, reason = "Album not Found")
public class AlbumNotFoundException extends RuntimeException{
}
