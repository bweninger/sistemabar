package io.barpass.commons.domain.usecase;

public interface UpdateUseCase <ENTITY, PK> {
    ENTITY update (PK pk, ENTITY entity);

    ENTITY doUpdate(PK pk, ENTITY entity);

    ENTITY retrieveOldEntity(PK pk);

    default void validate(ENTITY old, ENTITY newEntity) {

    }

}
