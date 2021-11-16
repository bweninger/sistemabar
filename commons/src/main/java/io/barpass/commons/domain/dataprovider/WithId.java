package io.barpass.commons.domain.dataprovider;

import java.io.Serializable;

public interface WithId<PK> extends Serializable {

    PK getId();

    void setId(PK id);
}
