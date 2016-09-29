package exercises

object Palindrome {
  /** 
   *  True if the string is a palindrome, after removing all non-alphabetic 
   *  characters (e.g., spaces, numbers, and punctuation).
   *  
   *  Hint: the Scala collections API is your friend
   *  http://docs.scala-lang.org/overviews/collections/overview.html 
   */
  def isPalindrome(s: String): Boolean = {
  	val removed: String = s.filter(_.isLetter).toLowerCase()
  	val reversed: String = removed.reverse
  	if (reversed == removed) true
  	else false
  }

}