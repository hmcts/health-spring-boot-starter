package uk.gov.hmcts.reform.health;

import org.springframework.boot.actuate.autoconfigure.health.HealthEndpointAutoConfiguration;
import org.springframework.boot.autoconfigure.AutoConfigureBefore;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@AutoConfigureBefore(HealthEndpointAutoConfiguration.class)
public class HealthAutoConfiguration {
    @Bean
    public Liveness liveness() {
        return new Liveness();
    }
}
