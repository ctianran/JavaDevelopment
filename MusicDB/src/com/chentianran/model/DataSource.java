package com.chentianran.model;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Tianran on 9/25/2017.
 */
public class DataSource {
	public static final String DB_NAME = "music.db";
	public static final String CONNECTION_STRING = "jdbc:sqlite:D:\\Development\\Workspace\\Udemy\\CompleteJavaDev\\MusicDB\\" + DB_NAME;

	public static final String TABLE_ALBUMS = "albums";
	public static final String COLUMN_ALBUM_ID = "_id";
	public static final String COLUMN_ALBUM_NAME = "name";
	public static final String COLUMN_ALBUM_ARTIST = "artist";
	public static final int INDEX_ALBUM_ID = 1;
	public static final int INDEX_ALBUM_NAME = 2;
	public static final int INDEX_ALBUM_ARTIST = 3;

	public static final String TABLE_ARTIST = "artists";
	public static final String COLUMN_ARTIST_ID = "_id";
	public static final String COLUMN_ARTIST_NAME = "name";
	public static final int INDEX_ARTIST_ID = 1;
	public static final int INDEX_ARTIST_NAME = 2;

	public static final String TABLE_SONGS = "songs";
	public static final String COLUMN_SONG_ID = "_id";
	public static final String COLUMN_SONG_TRACK = "track";
	public static final String COLUMN_SONG_TITLE = "title";
	public static final String COLUMN_SONG_ALBUM = "album";
	public static final int INDEX_SONG_ID = 1;
	public static final int INDEX_SONG_TRACK = 2;
	public static final int INDEX_SONG_TITLE = 3;
	public static final int INDEX_SONG_ALBUM = 4;




	private Connection conn;
	public boolean open() {
		try {
			conn = DriverManager.getConnection(CONNECTION_STRING);
			return true;
		} catch(SQLException e) {
			System.out.println("Connection failed" + e.getMessage());
			return false;
		}
	}

	public void close() {
		try {
			if(conn != null) {
				conn.close();
			}
		} catch(SQLException e) {
			System.out.println("Couldn't close connection: " + e.getMessage());
		}
	}

	public List<Artist> queryArtists() {
		Statement statement = null;
		ResultSet results = null;

		try {
			statement = conn.createStatement();
			results = statement.executeQuery("SELECT * FROM " + TABLE_ARTIST);
			List<Artist> artists = new ArrayList<>();
			while(results.next()) {
				Artist artist = new Artist();
				artist.setId(results.getInt(INDEX_ARTIST_ID));
				artist.setName(results.getString(INDEX_ARTIST_NAME));
				artists.add(artist);
			}
			return artists;
		} catch(SQLException e) {
			System.out.println("Query failed: " + e.getMessage());
			return null;
		} finally {
			try {
				if(results != null) {
					results.close();
				}
			} catch(SQLException e) {
				System.out.println("Error closing ResultSet: " + e.getMessage());
			}
			try {
				if(statement != null) {
					statement.close();
				}
			} catch(SQLException e) {
				System.out.println("Error closing Statement: " + e.getMessage());
			}
		}

	}

}
