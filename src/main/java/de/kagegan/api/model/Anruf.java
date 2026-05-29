package de.kagegan.api.model;

public record Anruf(
        String id,
        Rufnummer rufnummer,
        AnrufStatus status
) {
}
