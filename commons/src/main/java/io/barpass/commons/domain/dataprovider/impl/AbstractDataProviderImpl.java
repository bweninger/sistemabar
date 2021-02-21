package io.barpass.commons.domain.dataprovider.impl;

import io.barpass.commons.domain.dataprovider.DataProvider;

import java.util.Collection;
import java.util.UUID;

public abstract class AbstractDataProviderImpl<ENTITY> implements DataProvider<ENTITY> {

    @Override
    public ENTITY create(ENTITY comanda) {
        return null;
    }

    @Override
    public ENTITY update(UUID id, ENTITY comanda) {
        return null;
    }

    @Override
    public void delete(UUID id) {

    }

    @Override
    public ENTITY get(UUID id) {
        return null;
    }

    @Override
    public Collection<ENTITY> getAll() {
        return null;
    }

}
