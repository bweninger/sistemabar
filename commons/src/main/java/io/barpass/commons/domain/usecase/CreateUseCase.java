package io.barpass.commons.domain.usecase;

public interface CreateUseCase <Resp, Req> {
    default Resp create (Req request) {
        this.validate(request);
        return this.doCreate(request);
    }

    default void validate(Req request) {

    }

    Resp doCreate (Req request);
}
