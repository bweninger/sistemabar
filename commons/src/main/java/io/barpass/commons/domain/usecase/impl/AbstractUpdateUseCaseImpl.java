package io.barpass.commons.domain.usecase.impl;

import io.barpass.commons.domain.dataprovider.DataProvider;
import io.barpass.commons.domain.usecase.UpdateUseCase;

public abstract class AbstractUpdateUseCaseImpl<ENTITY, PK> implements UpdateUseCase<ENTITY, PK> {

    protected DataProvider<ENTITY, PK> dataProvider;

    public AbstractUpdateUseCaseImpl(DataProvider<ENTITY, PK> dataProvider) {
        this.dataProvider = dataProvider;
    }

    public ENTITY update(PK pk, ENTITY entity) {
        this.validate(this.retrieveOldEntity(pk), entity);
        return this.doUpdate(pk, entity);
    }

    public ENTITY retrieveOldEntity(PK pk) {
      return this.dataProvider.get(pk);
    }

    @Override
    public ENTITY doUpdate(PK pk, ENTITY entity) {
        return this.dataProvider.update(pk, entity);
    }
}
