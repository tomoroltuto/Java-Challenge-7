package com.example.javachallenge7;


import com.example.javachallenge7.Form.CreateForm;
import com.example.javachallenge7.Form.DeleteForm;
import com.example.javachallenge7.Form.ProfileForm;
import com.example.javachallenge7.Form.UserForm;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import javax.validation.Valid;
import java.net.URI;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

@RestController
public class IndexController {

    @GetMapping("/names")
    public List<String> names(){
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
    public ResponseEntity<Map<String,String>> update(@PathVariable("id") int id) {
        return ResponseEntity.ok(Map.of("message", "id successfully updated"));
    }

    @DeleteMapping("/names")
    public ResponseEntity<Map<String,String>> delete(@RequestBody DeleteForm from) {
        return ResponseEntity.ok(Map.of("message", "names successfully deleted"));
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
