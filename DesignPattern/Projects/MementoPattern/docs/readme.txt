********************
* Memento pattern *
********************

http://www.newthinktank.com/2012/10/memento-design-pattern-tutorial/

A way to restore previous states (Memento instance) of an object (Originator) easily. 

1. Memento is the class for "state" 
2. Caretaker is the class has an ArrayList to hold mementoes. it has an add method and restore method for the mementos. 
3. Originator is the class which has the state memory need that to do the undo and redo and save. 
4. TestMementoClient is the client class that will provide a GUI to get user input and undo and redo state. 