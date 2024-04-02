package com.rs.core.collections.list;

import java.util.Iterator;
import java.util.List;

public class MediaPlayer {
	
	private List<Song>songs;
	
	public MediaPlayer(List<Song> songs) {
		
		this.songs=songs;
		
	}

	public void play(){
		Iterator<Song> iterator = songs.iterator();
		while(iterator.hasNext()) {
			Song songs=iterator.next();
			
			song.play();
		}

	}
}
