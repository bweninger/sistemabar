package io.barpass.commons.domain.usecase;

import java.util.Optional;

public interface ReadUseCase <ENTITY, PK> {
    Optional<ENTITY> read(PK pk);
}
