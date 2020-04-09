package com.bhushan.fleetapp;

import java.util.Optional;

import org.springframework.data.domain.AuditorAware;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;

public class SpringSecurityAuditorAware implements AuditorAware<String> {

	@Override
	public Optional<String> getCurrentAuditor() {
		
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();

		String username = auth.getName();
		
		return Optional.ofNullable(username).filter(s -> !s.isEmpty());
	}
}
