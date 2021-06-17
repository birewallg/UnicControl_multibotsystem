package org.hopto.ts3s.monitor_unicbot.model;

public class Node {
    private String nodeTitle;
    private int value;

    public Node( String nodeTitle, int value) {
        super();
        this.value = value;
        this.nodeTitle = nodeTitle;
    }


    public int getValue() {
        return value;
    }

    public String getNodeTitle() {
        return nodeTitle;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void setNodeTitle(String nodeTitle) {
        this.nodeTitle = nodeTitle;
    }
}
