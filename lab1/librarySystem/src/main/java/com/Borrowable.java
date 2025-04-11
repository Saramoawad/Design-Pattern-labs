package com;

public interface Borrowable {
    boolean isAvailable();
    void setAvailable(boolean available);
    String getTitle();
}