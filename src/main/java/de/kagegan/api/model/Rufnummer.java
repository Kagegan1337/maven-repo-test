package de.kagegan.api.model;

public record Rufnummer(String value) {

    public Rufnummer {
        if (value == null || value.isBlank()) {
            throw new IllegalArgumentException("Rufnummer darf nicht leer sein");
        }
    }
}
