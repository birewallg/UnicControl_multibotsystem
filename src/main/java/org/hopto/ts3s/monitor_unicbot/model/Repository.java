package org.hopto.ts3s.monitor_unicbot.model;

import org.springframework.stereotype.Service;

import java.util.Hashtable;
import java.util.Map;

@Service
public class Repository {
    public static Map<String, Node> nodes = new Hashtable<>();

    static {
        nodes.put("i0", new Node("i0", 10));
        nodes.put("i1", new Node("i1", 40));
        nodes.put("i2", new Node("i2", 25));
        nodes.put("i3", new Node("i3", 70));
    }

    public Node getNode(String key) {
        if (nodes.get(key) == null)
            return new Node("null", 0);
        return nodes.get(key);
    }

    public Map<String, Node> addNode(Node modelData) {
        nodes.put(modelData.getNodeTitle(), modelData);
        return nodes;
    }

    public Map<String, Node> deleteNode(String title) {
        nodes.remove(title);
        return nodes;
    }

    public Map<String, Node> updateNode(Node node) {
        nodes.replace(node.getNodeTitle(), node);
        return nodes;
    }
}
