package org.soumitra.poc.configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SetConfiguration {

    @Value("${User.name}")
    public String name;
}
