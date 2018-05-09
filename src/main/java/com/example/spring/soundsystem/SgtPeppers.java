package com.example.spring.soundsystem;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class SgtPeppers implements CompactDisc {
	private String title = "Sgt. Pepper's Lonely Hearts Club Band";
	private String artist = "The Beatles";
	public void play() {
		System.out.print("Playing " + title + " by " + artist);
	}
	@Override
	public String toString() {
		return "Playing " + title + " by " + artist;
	}
}
