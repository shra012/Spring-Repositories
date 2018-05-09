package com.example.spring.soundsystem;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;

import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=SoundSystemConfig.class)
@ActiveProfiles(value="prod")
public class CDPlayerTest {
	@Rule
	public final SystemOutRule log =
	new SystemOutRule().enableLog();
	@Autowired
	private MediaPlayer player;
	@Autowired
	private CompactDisc cd;
	@Autowired 
	private ApplicationContext applicationContext;
	
	@Autowired
	private Discography discography;
	
	@Test
	public void discographyCheck() {
		assertNotNull(discography);
		assertThat(discography.toString(),containsString("Getting Better"));
		System.out.println(discography.toString());
	}
	@Test
	public void cdShouldNotBeNull() {
		assertNotNull(cd);
	}
	@Test
	public void play() {
		player.play();
		assertEquals(
				"Playing Sgt. Pepper's Lonely Hearts Club Band" +
						" by The Beatles",
						log.getLog());
	}
	@Test
	public void profileTest() {
		assertNotNull(applicationContext.getBean("devcdPlayer"));
	}
}
