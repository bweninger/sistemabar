package io.barpass.commons.domain.dataprovider;

import java.util.Collection;
import java.util.UUID;

public interface DataProvider<ENTITY, PK> {

    ENTITY create(ENTITY entity);

    ENTITY update(PK id, ENTITY entity);

    void delete(PK id);

    ENTITY get(PK id);

    Collection<ENTITY> getAll();
}
