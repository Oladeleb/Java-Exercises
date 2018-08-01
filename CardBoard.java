package com.oca.chapterthree;


/* When do stuff is reached, how many objects are eligible for garbage collection
 *  I expected 1 to be eligible for garbage collection because c1 = null, becuase it does not 
 *  contain a reference to it and its in unreachable
 */

 
public class CardBoard {
	
	Short story = 200; // short datatype, instance variable story, initialze to value of 200
	
	CardBoard go(CardBoard cb) { // this is not a constructor because it has a return type. what is go?
		cb= null;
		return cb;
		
	}

	public static void main(String[] args) {
		CardBoard c1 = new CardBoard(); // new object with c1 as the reference variable
		CardBoard c2 = new CardBoard(); // new object with c2 as the reference variable
		CardBoard c3 = c1.go(c2); //  c3 = c1, i get that, .go(c2)???
		// do stuff
	}
	}





