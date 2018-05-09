package com.example.spring.soundsystem;

import java.util.List;
import java.util.stream.Collectors;

public class BlankDisc implements CompactDisc {
	private String title;
	private String artist;
	private List<String> tracks;
	public BlankDisc(String title, String artist, List<String> tracks) {
		this.title = title;
		this.artist = artist;
		this.tracks = tracks;
	}
	public void play() {
		System.out.println("Playing " + title + " by " + artist);
		for (String track : tracks) {
			System.out.println("-Track: " + track);
		}
	}

	@Override
	public String toString() {
		String result ="Playing " + title + " by " + artist +"\ntracks "+tracks.stream().map(s->s.concat("\n")).collect(Collectors.joining());
		return result.substring(0,result.length()-1);
	}

	public void setTracks(List<String> tracks) {
		this.tracks = tracks;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	
}
