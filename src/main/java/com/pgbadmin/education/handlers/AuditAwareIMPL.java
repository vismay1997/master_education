package com.pgbadmin.education.handlers;

import org.springframework.data.domain.AuditorAware;

import java.util.Optional;

public class AuditAwareIMPL implements AuditorAware<String> {

    @Override
    public Optional<String> getCurrentAuditor() {
        return Optional.of("Vismay");
    }
}
