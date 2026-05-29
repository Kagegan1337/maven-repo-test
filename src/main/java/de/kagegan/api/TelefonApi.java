package de.kagegan.api;

import de.kagegan.api.model.Anruf;
import de.kagegan.api.model.AnrufStatus;
import de.kagegan.api.model.Rufnummer;

public interface TelefonApi {
    
    Anruf starteAnruf(Rufnummer zielrufnummer);

    void beendeAnruf(String anrufId);

    AnrufStatus status(String anrufId);

    void weiterleiten(String anrufId, Rufnummer zielrufnummer);

    void waehleRufnummer(Rufnummer rufnummer);
}
