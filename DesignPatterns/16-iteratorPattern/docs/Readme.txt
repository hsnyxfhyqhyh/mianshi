Iterator Pattern:

http://www.newthinktank.com/2012/10/iterator-design-pattern-tutorial/

Provide you with a uniform way to access different collections of objects.  

Derek didn't try to start with UML Diagram, instead he jumps right into the coding part. 

1. In this example, he created a SongInfo Class to mimic the song info he needs to loop through. 
2. As he explained, he told developer to create some kind of collection to hold the song information from 70s, 80s, 90s, but didn't say how. 
3. Later, developer came back with 70s as ArrayList<SongInfo>, 80s as in Array with Element of SongInfo, and HashTable with values of SongInfo. 
4. To loop through the different "Colletions" he needs to address the looping logic differently. 
5. The idea is to provide a unique interface as SongIterator, which has a single method "createIterator" 
6. SongsOfThe70s/SongsOfThe80s/SongsOfThe90s implements the "SongIterator" but return the iterator in different way.
7. The RadioStationClient  calls the DiscJockey's showTheSongs2 method to loop through different collection with the unique way of looping,
	compare showTheSongs2 with showTheSongs, then you will see the iterator Pattern significantly reduce the code 
 