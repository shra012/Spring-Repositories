package com.spring.in.action.chapterone;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class CDPlayerConfig {
	
	@Bean
	@Profile(value="prod")
	public CDPlayer cdPlayer(CompactDisc compactDisc) {
	return new CDPlayer(compactDisc);
	}
	@Bean
	@Profile(value="dev")
	public CDPlayer devcdPlayer(CompactDisc compactDisc) {
	return new CDPlayer(compactDisc);
	}
}
