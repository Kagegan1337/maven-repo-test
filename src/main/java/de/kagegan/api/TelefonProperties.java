package de.kagegan.api;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "kvsh.telefon")
public class TelefonProperties {

    /**
     * Aktiver Treiber, z. B. "3cx".
     */
    private String provider = "3cx";

    public String getProvider() {
        return provider;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }
}
