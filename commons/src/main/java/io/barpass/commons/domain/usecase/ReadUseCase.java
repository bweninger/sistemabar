package io.barpass.commons.domain.usecase;

public interface ReadUseCase <ENTITY, PK> {
    ENTITY read(PK pk);
}
