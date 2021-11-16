package io.barpass.commons.domain.usecase;

import java.util.Objects;
import java.util.UUID;

public interface DeleteUseCase<PK> {

    default void delete(PK id) {
        this.validate(id);
        doDelete(id);
    }

    default void validate(PK id) {
        if (Objects.isNull(id)) {
            throw new IllegalArgumentException("Id da Entidade nao pode ser nulo para operacao de Delete.");
        }
    }

    void doDelete(PK primaryKey);
}
