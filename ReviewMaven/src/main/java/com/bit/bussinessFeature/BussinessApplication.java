package com.bit.bussinessFeature;

public class BussinessApplication {
	//real step of all testCase
	
	/*
	 * Benefits of creating the projects using  this structure (Page object model)
	 * 1)Re-usable
	 * 2)Business readable
	 * 3)Centralized
	 * 3)Well maintained 
	 * 4)Same Instance of driver throughout the project. [this is also known as singleTune concept]
	 * 
	 * #SingleTune concept:
	 * Single Instance of Driver
	 * to do so Create Private Constructor, so other class can't create object of the constructor.
	 * We share the driver Through return Type method
	 * Every page will get  the driver through the method that returns that particular page.
	 * je method je page return kore oi methoder through te-e driver oi page a jabe 
	 * 
	 * #BusinessReadable Code 
	 * there is no implementation in businessReadable code 
	 * we use naming convention to write business readable code
	 * 
	 * #Object Repository 
	 * Instead of storing all the objects in the same class we save the object in the corresponding class
	 * using findby annotation from PageFectory class
	 * we initializing all the object using initElements method
	 * @findBy annotation (from page factory class)is used to declare global variables 
	 */
	
	/*
	 * ###How can you create a SingleTune Concept
	 * or how to restrict from creating more then one object
	 * Ans- by creating private constructor, so only that class can be use the object
	 */
	
	
	
}
