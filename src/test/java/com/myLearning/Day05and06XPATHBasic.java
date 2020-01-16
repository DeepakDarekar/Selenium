package com.myLearning;

public class Day05and06XPATHBasic {
	/*
	 * 1.Anchor element (link element ñ tag <a>) having name as an attribute
	 *  Ans-->//a[@name]
	 * 
	 * 2.How many elements you got in above xpath and which one your selenium program will select 
	 * Ans-->2 Element First one will select the selenium program first
	 * 
	 * 3.Anchor element (link element ) having name as an attribute having value section B
	 * Ans-->//a[@name = 'sectionB']
	 * 
	 * 4.Find font element for which color attribute contains re
	 * Ans-->//font[contains@color,re)]
	 * 
	 * 5.Find font element for which color attribute contains gre
	 * Ans-->//font[starts-with(@color,gre)]
	 * 
	 * 6.Find font element for which color attribute starts with gre
	 * Ans-->
	 * 
	 * 7.Find unordered list element having an item for which id is 123
	 * Ans--> //ul/*[contains(@id,123)]
	 * 
	 * 8.Find an element having id as 123
	 * Ans-->//*[@id=123]
	 * 9.Find an element having name attribute as continue and value attribute as Clear
	 * Ans: //*[@name="continue" and@value="Clear"]
	 * 
	 * 10.If there are multiple elements having same attribute then how to find the
	 * second element (as by default our program will take the first element)
	 * 
	 * 9.Get the second element having name attribute as continue
	 * Ans://*[@name='continue'][2]
	 * 
	 * 11.Find an element(li tag) in an unordered(ul tag) list which contains be in its visible text 
	 * Ans: //ul/li[contains(text(),'b')]
	 * 
	 * 12.Find the following sibling ëpí of a span element containing visible text
	 * Ans: //span[contains(text(),'4th')]/following-sibling::p
	 * 
	 * 13.Find the first following sibling of any span element 
	 * Ans://span/following-sibling::*[1]
	 * 
	 * 14.Find the second following sibling of span element 
	 * Ans://span/following-sibling::*[2]
	 * 
	 * 15.Find a ëspaní element which is preceding sibling of p element 
	 * Ans://p/preceding-sibling::span
	 * 
	 * 16.Find the second child of an element having id attribute as textSection
	 * Ans: //*[@id='textSection']/*[2
	 * 
	 * 17.Find the first p child of an element having id attribute as textSectioní
	 * Ans: //*[@id='textSection']/p[1]
	 * 
	 * 18.Find the last child of an element having id attribute as textSection
	 * Ans: //*[@id='textSection']/*[last()]
	 * 
	 * 19.Find the last ëpí child of an element having ëidí attribute as textSectioní 
	 * Ans: //*[@id='textSection']/p[last()]
	 * 
	 * 20.Any fourth child having class attribute as sales
	 * Ans://*[4][@class='sales']
	 * 
	 * 21.3rd element of any parent containing í in the class attribute 
	 * Ans://*[3][contains(@class,'i')]
	 * 
	 * 22.Extract b element inside a webtable having id attribute TestTable
	 * Ans: //*[@id='TestTable']//b
	 * 
	 * 23.Disabled element on a page
	 * Ans: //*[@disabled]
	 * 
	 * 
	 */

}
