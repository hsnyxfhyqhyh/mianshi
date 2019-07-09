************************
* Flyweight Pattern:   *
************************ 

http://www.newthinktank.com/2012/10/flyweight-design-pattern-tutorial/
https://youtu.be/0vV-R2926ss

Used when you need to create a large number of similar objects, 

1. What Derek did in this pattern demo is trying to click a button to generate a lot of Rectangles. 
	All these rectangles are sharing a group of colors, so he kind of wants to trying to use the color as intrinsic state, and size as extrinsic state. 
2. He use the RectFactory to control these FlyWeight Behavior, has a HashMap for this particular purpose.
3. If color matches, the RectFactory returns an object, otherwise create a new MyRect object and save it to the HashMap with key of the color. 
4. The FlyWeight use RecFactory to get the FlyWeight object and then draw the MyRect with different size. 

>> Reviewed
	on 7/10/2019 for 2nd time. 
	