package io.barpass.commons.domain.usecase;

public interface UpdateUseCase <ENTITY, PK> {
    default ENTITY update (PK pk, ENTITY entity) {
        this.validate(entity);
        return this.doUpdate(pk, entity);
    }

    ENTITY doUpdate(PK pk, ENTITY entity);

    default void validate(ENTITY entity) {

    }

}
