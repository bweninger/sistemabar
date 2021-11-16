package io.barpass.orderservice.domain.comanda.entity;

import java.util.List;
import java.util.Map;

public enum StatusComanda {
    ABERTA, CANCELADA, FATURADA;

    private static final Map<StatusComanda, List<StatusComanda>> VALID_TRANSITIONS = Map.of(ABERTA, List.of(CANCELADA, FATURADA));

    public static boolean isValidTransition(StatusComanda prev, StatusComanda next) {
        if (prev.equals(next)) return true;

        return VALID_TRANSITIONS.get(prev).stream().anyMatch(next::equals);
    }
}
