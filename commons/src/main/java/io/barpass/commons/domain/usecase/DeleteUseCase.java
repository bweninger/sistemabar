package io.barpass.commons.domain.usecase;

public interface DeleteUseCase <PK> {

    default void delete(PK primaryKey) {
        this.validate(primaryKey);
        doDelete(primaryKey);
    }

    default void validate (PK primaryKey) {

    }

    void doDelete(PK primaryKey);
}
