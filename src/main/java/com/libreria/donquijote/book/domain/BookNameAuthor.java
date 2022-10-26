package com.libreria.donquijote.book.domain;

import com.libreria.donquijote.kernel.domain.ValueObject;
import com.sun.istack.NotNull;

import java.io.Serializable;


public class BookNameAuthor implements ValueObject, Serializable {
    private String firstName;
    private String lastName;

    public BookNameAuthor(@NotNull String firstName, @NotNull String lastName) {
        this.firstName = validate(firstName);
        this.lastName = validate(lastName);
    }

    public BookNameAuthor() {

    }

    public static @NotNull String validate(@NotNull String name) { // <7>
        if (!isValid(name)) {
            throw new IllegalArgumentException("Invalid firstName o LastName: " + name);
        }
        return name;
    }

    public static boolean isValid(@NotNull String name) {
        return !name.equals("");
    }

    @Override
    public @NotNull String toString() {
        return firstName + " " + lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
