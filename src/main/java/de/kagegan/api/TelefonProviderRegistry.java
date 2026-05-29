package de.kagegan.api;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class TelefonProviderRegistry {

    private final Map<String, TelefonProvider> providers;

    public TelefonProviderRegistry(List<TelefonProvider> providers) {
        this.providers = providers.stream()
                .collect(Collectors.toUnmodifiableMap(
                        TelefonProvider::getName,
                        Function.identity()
                ));
    }

    public TelefonProvider getProvider(String name) {
        TelefonProvider provider = providers.get(name);

        if (provider == null) {
            throw new IllegalArgumentException(
                    "Kein TelefonProvider mit Name '" + name + "' gefunden. Verfügbar: " + providers.keySet()
            );
        }

        return provider;
    }

    public TelefonApi getTelefonApi(String name) {
        return getProvider(name).getTelefonApi();
    }
}
