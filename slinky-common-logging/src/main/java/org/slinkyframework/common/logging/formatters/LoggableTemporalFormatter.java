package org.slinkyframework.common.logging.formatters;

import java.time.temporal.Temporal;

public class LoggableTemporalFormatter extends LoggableTypeFormatter<Temporal> {

    public String extractValue(Temporal temporal) {
        return temporal.toString();
    }
}
