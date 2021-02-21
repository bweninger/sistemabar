package io.barpass.commons.domain.usecase;

import java.util.Objects;
import java.util.UUID;

public interface DeleteUseCase {

    default void delete(UUID id) {
        this.validate(id);
        doDelete(id);
    }

    default void validate(UUID id) {
        if (Objects.isNull(id)) {
            throw new IllegalArgumentException("Id da Entidade nao pode ser nulo para operacao de Delete.");
        }
    }

    void doDelete(UUID primaryKey);
}
