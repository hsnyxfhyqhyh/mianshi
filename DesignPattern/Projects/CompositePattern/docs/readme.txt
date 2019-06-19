Composite Pattern: 

http://www.newthinktank.com/2012/10/composite-design-pattern-tutorial/

1. This pattern allow you to treat individual object and group object uniformly, because they are both subclasses of the same parent. 
2. SongComponent is the parent class mentioned in step 1, it defines an abstract add method to add same "SongComponent" object to it. 
3. Song and SongGroup are both subclasses of the SongComponent, they have different implememntation of the displaySongInfo method: 
		SongGroup is the composite, so the "displaySongInfo" display a group name description, then loop through the composite for child's displaySongInfo, which is automatic-recursively calls the chain.  
		Song is the leaf, so it just need to display the song's information. 
		
4. SongListGeneratorClient create all SongComponent in different forms of SongComponent, add composite the whole structure, and then dedicate to DiscJockey to call displaySongInfo of SongComponent.     