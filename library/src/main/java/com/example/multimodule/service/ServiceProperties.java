package com.example.multimodule.service;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * ServiceProperties.
 *
 * @author Bipin Thite
 */
@RequiredArgsConstructor
@ConfigurationProperties("service")
public class ServiceProperties {

  /** A message for the service. */
  @Getter private final String message;
}
