/**
 * Copyright 2022 Nord Pool.
 * This library is intended to aid integration with Nord Pool’s Intraday API and comes without any warranty. Users of this library are responsible for separately testing and ensuring that it works according to their own standards.
 * Please send feedback to idapi@nordpoolgroup.com.
 */

package com.nordpool.id.publicapi.v1.serialize;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

import java.io.IOException;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class DateSerializer extends JsonSerializer<ZonedDateTime> {
    public DateSerializer() {
    }

    static final String ISO_INSTANT_FORMAT = "yyyy-MM-dd'T'HH:mm:ss.SSSX";

    @Override
    public void serialize(ZonedDateTime value, JsonGenerator gen, SerializerProvider serializerProvider) throws IOException {
        gen.writeString(value != null ? value.format(DateTimeFormatter.ofPattern(ISO_INSTANT_FORMAT).withZone(ZoneOffset.UTC)) : "");
    }

}
