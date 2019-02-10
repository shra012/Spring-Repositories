package com.spring.in.action.chapterone;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

@Configuration
@Import(CDPlayerConfig.class)
@ImportResource(locations= {"classpath:com/example/spring/soundsystem/soundsystem-beans.xml"})
public class SoundSystemConfig {

}
