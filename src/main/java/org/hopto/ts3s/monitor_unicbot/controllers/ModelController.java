package org.hopto.ts3s.monitor_unicbot.controllers;

import org.hopto.ts3s.monitor_unicbot.model.Node;
import org.hopto.ts3s.monitor_unicbot.model.Repository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("model")
public class ModelController {
    Repository repository = new Repository();

    @GetMapping( "/modeldata")
    public ResponseEntity<Node> getModelData(@RequestParam(value = "title", defaultValue = "") String title) {
        return new ResponseEntity<>(repository.getNode(title), HttpStatus.OK);
    }

    @PostMapping( "/modeldata")
    public ResponseEntity<Map<String, Node>> updateModelData(@RequestParam(value = "title") String title,
                                                             @RequestParam(value = "value") int value) {
        Node node = repository.getNode(title);
        return (node != null)
                ? new ResponseEntity<>(repository.addNode(new Node(title, value)), HttpStatus.OK)
                : new ResponseEntity<>(repository.updateNode(new Node(title, value)), HttpStatus.OK);
    }

    @DeleteMapping("/modeldata")
    public ResponseEntity<Map<String, Node>> deleteNode(@RequestParam(value = "title") String title) {
        return new ResponseEntity<>(repository.deleteNode(title), HttpStatus.OK);
    }
}
