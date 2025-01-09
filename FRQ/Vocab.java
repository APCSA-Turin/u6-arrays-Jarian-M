public class Vocab {
  /* The controlled vocabulary for a Vocab object.
   */
  private String[] theVocab;
  
  public Vocab(String[] vocab) {
    theVocab = vocab;
  }

  public String[] getTheVocab() {
    return theVocab;
  }
  
  /* Searches for a string in theVocab. Returns true if its String 
     parameter str is an exact match to an element in theVocab and
     returns false otherwise.
   */
  public boolean findWord(String str) {
    /* implementation not shown */
	for(String string:theVocab) {
		if(string.equals(str)) {
			return true;
		}
	}
	return false;
  }
  
  /* Counts how many strings in wordArray are not found in theVocab,
    as described in part (a).


    PRECONDITION: wordArray contains no duplicates
   */
  public int countNotInVocab(String[] wordArray) {
    /* to be implemented in part (a) */	
	int count = 0;
	for(String str: wordArray) {
		if(!findWord(str)) {
			count++;
		}
	}
	return count;
  }
  
  /* Returns an array containing strings from wordArray not found in
    theVocab, as described in part (b).


    PRECONDITION: wordArray contains no duplicates
   */
  public String[] notInVocab(String[] wordArray) {
    /* to be implemented in part (b) */
	String[] newArray = new String[countNotInVocab(wordArray)];
    int ind = 0;
	for(String word: wordArray) {
		if(!findWord(word)) {
			newArray[ind] = word;
            ind++;
		}
	}
	return newArray;
  }
}
