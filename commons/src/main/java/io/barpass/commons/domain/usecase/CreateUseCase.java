package io.barpass.commons.domain.usecase;

import javax.validation.Valid;

public interface CreateUseCase <Resp, Req> {
    default Resp create (@Valid Req request) {
        this.validate(request);
        return this.doCreate(request);
    }

    default void validate(Req request) {

    }

    Resp doCreate (Req request);
}
