package com.libreria.donquijote.book.domain.validations.isbn;

import com.libreria.donquijote.kernel.domain.ValueObject;
import com.sun.istack.NotNull;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BookIsbn implements ValueObject {
    private final String id;

    public BookIsbn(String id) {
        this.id = validate(id);
    }

    public static @NotNull String validate(@NotNull String id) { // <7>
        if (!isValid(id)) {
            throw new IllegalArgumentException("Invalid isbn: " + id);
        }
        return id;
    }

    public static boolean isValid(@NotNull String id) {
        String pattern = "^(?:ISBN(?:-1[03])?:?●)?(?=[0-9X]{10}$|(?=(?:[0-9]+[-●]){3})[-●0-9X]{13}$|97[89][0-9]{10}$|(?=(?:[0-9]+[-●]){4})[-●0-9]{17}$)(?:97[89][-●]?)?[0-9]{1,5}[-●]?[0-9]+[-●]?[0-9]+[-●]?[0-9X]$";

        Pattern isbnPattern = Pattern.compile(pattern);
        Matcher matcher = isbnPattern.matcher(id);
        return matcher.matches();
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        String currentId = (String) obj;
        if (currentId == null) return false;
        else return currentId.equals(id);
    }

    @Override
    public @NotNull String toString() {
        return id;
    }

    public String getId() {
        return id;
    }
}
