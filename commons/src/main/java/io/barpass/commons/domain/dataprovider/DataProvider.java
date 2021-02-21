package io.barpass.commons.domain.dataprovider;

import java.util.Collection;
import java.util.UUID;

public interface DataProvider<ENTITY> {

    ENTITY create(ENTITY entity);

    ENTITY update(UUID id, ENTITY entity);

    void delete(UUID id);

    ENTITY get(UUID id);

    Collection<ENTITY> getAll();
}
