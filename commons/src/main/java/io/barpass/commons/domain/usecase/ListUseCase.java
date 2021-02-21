package io.barpass.commons.domain.usecase;

import java.util.Collection;

public interface ListUseCase <ENTITY> {

    Collection<ENTITY> list();
}
