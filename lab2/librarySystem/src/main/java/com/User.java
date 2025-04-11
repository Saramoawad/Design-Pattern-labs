package com;

public class User implements BookObserver {
    private String name;
    private boolean isPremium;

    public User(String name) {
        this(name, false);
    }

    public User(String name, boolean isPremium) {
        this.name = name;
        this.isPremium = isPremium;
    }

    public String getName() {
        return name;
    }

    public boolean isPremium() {
        return isPremium;
    }

    @Override
    public void update(String message) {
        System.out.println("Notification for " + name + ": " + message);
    }
}
