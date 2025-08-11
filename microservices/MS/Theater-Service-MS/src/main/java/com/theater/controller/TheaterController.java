package com.theater.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.theater.model.Theater;
import com.theater.service.TheaterService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/theaters")
@RequiredArgsConstructor
public class TheaterController {
	
	private final TheaterService theaterService;

    @PostMapping
    public ResponseEntity<Theater> createTheater(@RequestBody Theater theater) {
        return ResponseEntity.ok(theaterService.createTheater(theater));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Theater> getTheaterById(@PathVariable Long id) {
        return ResponseEntity.ok(theaterService.getTheaterById(id));
    }

    @GetMapping
    public ResponseEntity<List<Theater>> getAllTheaters() {
        return ResponseEntity.ok(theaterService.getAllTheaters());
    }

    @PutMapping("/{id}")
    public ResponseEntity<Theater> updateTheater(@PathVariable Long id, @RequestBody Theater theater) {
        return ResponseEntity.ok(theaterService.updateTheater(id, theater));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteTheater(@PathVariable Long id) {
        theaterService.deleteTheater(id);
        return ResponseEntity.noContent().build();
    }

}
