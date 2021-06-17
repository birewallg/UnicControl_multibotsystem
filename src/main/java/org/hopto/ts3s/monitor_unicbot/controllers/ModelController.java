package org.hopto.ts3s.monitor_unicbot.controllers;

import org.hopto.ts3s.monitor_unicbot.model.Node;
import org.hopto.ts3s.monitor_unicbot.model.Repository;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("model")
public class ModelController {
    Repository repository = new Repository();

    @GetMapping( "/modeldata")
    public Node getModelData(@RequestParam(value = "title", defaultValue = "") String title) {
        return repository.getNode(title);
    }

    @PostMapping( "/modeldata")
    public Map<String, Node> updateModelData(@RequestParam(value = "title") String title,
                                             @RequestParam(value = "value") int value) {
        Node node = repository.getNode(title);
        if (node != null)
            return repository.addNode(new Node(title, value));
        return repository.updateNode(new Node(title, value));
    }

    @DeleteMapping("/modeldata")
    public Map<String, Node> deleteNode(@RequestParam(value = "title") String title) {
        return repository.deleteNode(title);
    }
}
