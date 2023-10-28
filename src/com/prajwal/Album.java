package com.prajwal;

import java.util.*;

public class Album {

	private
	String name;
	String artist;
	ArrayList<Song> songs;
	
	public
	Album(String n,String a) {
		this.name=n;
		this.artist=a;
		this.songs=new ArrayList<Song>();
	}
	Album(){
		
	}
	
	public Song findSong(String title) {
		for(Song checkedSong:songs) {
			if(checkedSong.getTitle().equals(title)) return checkedSong;
			
		}
		return null;
	}
	public boolean addSong(String title,double duration) {
		if(findSong(title)==null) {
			songs.add(new Song(title,duration));
//			System.out.println(title+"sucessfully added to the list");
			return true;
		}
		else {
//			System.out.println("Song with name "+title+"already exist in the list");
			return false;
		}
	}
	
	public boolean addToPlayList(int trackNumber,LinkedList<Song> PlayList) {
		int index=trackNumber-1;
		if(index>0 && index <= this.songs.size()) {
			PlayList.add(this.songs.get(index));
			return true;
			
		}
//		System.out.println("this album does not have song with tracknumber"+trackNumber);
		return false;
	}
	public boolean addToPlayList(String title,LinkedList<Song> PlayList) {
		for(Song checkedSong : this.songs) {
			if(checkedSong.getTitle().equals(title)) {
				PlayList.add(checkedSong);
				return true;
			}
		}
//		System.out.println(title+"There is no such song in album");
		return false;
		
	}
}
