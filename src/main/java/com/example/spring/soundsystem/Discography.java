package com.example.spring.soundsystem;

import java.util.List;
import java.util.stream.Collectors;

public class Discography {
	private String artist;
	private List<CompactDisc> cds;
	public Discography(String artist, List<CompactDisc> cds) {
		super();
		this.artist = artist;
		this.cds = cds;
	}

	@Override
	public String toString() {
		return "Discography [artist=" + artist + ", cds={" + printLables(cds)  + "}]";
	}
	private String printLables(List<CompactDisc> cds){
		return "\n"+cds.stream().map(s->s.toString().concat("\n")).collect(Collectors.joining());	
	}
}
