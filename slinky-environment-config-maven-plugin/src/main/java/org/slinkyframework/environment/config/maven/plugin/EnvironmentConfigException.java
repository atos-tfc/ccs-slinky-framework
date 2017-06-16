package org.slinkyframework.environment.config.maven.plugin;

public class EnvironmentConfigException extends RuntimeException {

    public EnvironmentConfigException(String message) {
        super(message);
    }

    public EnvironmentConfigException(String message, Throwable cause) {
        super(message, cause);
    }
}
