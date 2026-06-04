package de.kagegan.api;

import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;

import java.util.List;

@AutoConfiguration
@EnableConfigurationProperties(TelefonProperties.class)
public class TelefonAutoConfiguration {

    @Bean
    @ConditionalOnMissingBean
    public TelefonProviderRegistry telefonProviderRegistry(List<TelefonProvider> providers) {
        return new TelefonProviderRegistry(providers);
    }

    @Bean
    @ConditionalOnMissingBean
    public TelefonApi telefonApi(
            TelefonProviderRegistry registry,
            TelefonProperties properties
    ) {
        return registry.getTelefonApi(properties.getProvider());
    }
}
