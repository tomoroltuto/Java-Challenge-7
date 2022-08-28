package com.example.JavaChallenge7;

import com.example.JavaChallenge7.From.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;


import javax.validation.Valid;
import java.net.URI;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;


@RestController
public class IndexController {
    
    @GetMapping("/names")
    public List<String> getIndex(){
        return List.of("segawa", "tomohito");
    }

    @PostMapping("/names")
    public ResponseEntity<String> create(@RequestBody CreateForm form) {
        URI url = UriComponentsBuilder.fromUriString("http://localhost:8080")
                .path("/names/id")
                .build()
                .toUri();
        return ResponseEntity.created(url).body("name successfully created");
    }
    @PatchMapping("/names/{id}")
    public ResponseEntity<Map<String,String>> update(@PathVariable("id") int id, @RequestBody UpdateForm from) {
        return ResponseEntity.ok(Map.of("message", "names successfully updated"));
    }

    @DeleteMapping("/names/{id}")
    public ResponseEntity<Map<String,String>> delete(@PathVariable("id") int id, @RequestBody DeleteFrom from) {
        return ResponseEntity.ok(Map.of("message", "names successfully updated"));
    }

    private static final String template = "segawa, %s!";
    private final AtomicLong id = new AtomicLong();

    @GetMapping("/profile")
    public ProfileForm profileForm(@RequestParam(value = "name", defaultValue = "tomohito") String name) {
        return new ProfileForm(id.incrementAndGet(), String.format(template, name));
    }

    @PostMapping("/users")
    public ResponseEntity<String> create(@RequestBody @Valid UserForm user) {
        return ResponseEntity.ok("user successfully created");
    }

}
