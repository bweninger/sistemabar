package io.barpass.commons.domain.mapper;

import java.util.Optional;

public interface MapperWithOptional {
    default <T> T unwrapOptional(Optional<T> t) {
        return t.orElse(null);
    }
}
