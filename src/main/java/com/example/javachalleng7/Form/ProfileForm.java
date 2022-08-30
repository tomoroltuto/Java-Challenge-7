package com.example.javachalleng7.Form;


public class ProfileForm {

    private final long id;
    private final String name;

    public ProfileForm(long id, String name) {
        this.id = id;
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
