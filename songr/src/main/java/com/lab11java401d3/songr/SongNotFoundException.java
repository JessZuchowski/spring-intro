package com.lab11java401d3.songr;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND, reason = "Song not Found")
public class SongNotFoundException extends RuntimeException{
}
