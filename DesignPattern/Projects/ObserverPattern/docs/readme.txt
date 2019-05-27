http://www.newthinktank.com/2012/08/observer-design-pattern-tutorial/



这个例子是当stock price 发生变化的时候， 观察stock price 变化的StockGrabber (Subject)会通知所有的实体Observer.   

Subject是个Interface, 定义了registerObserver, unregisterObserver, 还有update function.  

实体Subject， 定义了 Collection来储存Observer, 实现的update function 会loop through collection来一个一个通知。  

实体Observer提供一个构造函数， 这样可以传进stockGrabber, 便于把自己register到Subject里。 

其实到这里所有的observer 的讲解就完了。 但是Derek又提供了线程方式来模拟实际stock 更新的情况。 具体情况见project.  但是每只股票有单独线程来处理。 