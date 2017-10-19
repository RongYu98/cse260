import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;

public class Test4{


    public static void main(String[] args){

	List<Album> albums = new ArrayList<>();
	for ( int i=0; i<10; i++ ){
	    //Album idk = new Album( String.valueOf( i*10+i*i+i*5 ) );
	    Album idk = new Album( String.valueOf( Math.random() ) );
	    idk.randomSongs();
	    albums.add(idk);
	}
	
	List<Album> favs = new ArrayList<>();

	// albums.stream().forEach( e -> e.stream().forEach( f -> System.out.println(f) ) );
	
	//albums.stream().forEach( e -> e.tracks.stream().filter(f -> f.rating >= 4 ));
	//albums.stream().forEach( e -> e.tracks.stream().filter(f -> f.rating >= 4 ).forEach( g -> favs.add(g)));
	//albums.stream().filer( // boolean function if one of tracks has rating above 4)
	//albums.stream().filter(album->album.tracks.stream() == null );
	albums.stream().mapToInts(Album::getTracks)
	    .filter( tracks->System.out.println(tracks));


			    


	for (Album a : albums) {
	    boolean hasFavorite = false;
	    for (Track t : a.tracks) {
		if (t.rating >= 4) {
		    hasFavorite = true;
		    break;
		}
	    }
	    if (hasFavorite)
		favs.add(a);
	}

	Collections.sort(favs, new Comparator<Album>() {
		public int compare(Album a1, Album a2) {
		    return a1.name.compareTo(a2.name);
		}});

	//System.out.println( favs );

	

    }





}
