First, a rant: 

I must say, I found learning Scala incredibly frustrating! I think the biggest
frustration I had was with the documentation. While Prof. Ben provided us useful
resources in the repository's README and relevant resources for some of the
problems, it was not easy to figure out the canonical resource for documentation.
I found that the official documentation site was not easy to navigate and kind
of all over the place. What would probably have been beneficial is something 
like the [Go tour](https://tour.golang.org/welcome/1). There are many 
idiosyncrasies not seen in other languages, and a thorough tour would have been
helpful; however, we have a pretty significant time constraint, so it's possible
I was not spending enough time looking through docs.

Most of this frustration stemmed from the lack of example code. I think one or 
two good  examples are worth more than hundreds of words of documentation,
and I couldn't find these as easily for Scala, both on official resources and
on Stack Overflow.

Now, more rational analysis:

I think the Scala authors did a great job of providing "map"-like functions to 
be able to apply actions on every element in a list.  Aside from `map`, which is
common in most languages, I enjoyed using `foldLeft` and `filter`. These are 
simple operations and it's nice that they were simplified to single, built-in
functions. 

Also, I found options to be an interesting concept. Instead of just having `null`
values, I thought it clever and could imagine some use cases to have
optional values. I've run into annoying bugs and errors just because I haven't
explicitly dealt with null values in my code, so it's nice to be forced to handle
the cases when appropriate, and it isn't overly burdensome. 

At the moment, I dislike Collections. At least for our problem set, I found that
I would have been fine using just Lists and Maps, but I ran into Sequences and
ListBuffers, and seen several other things related to Collections in the docs. 
I know having data structures for many different cases are useful, so I don't
doubt that this could be useful, but I was annoyed at how much conversion
between data structures there was in such a simple assignment.  I also got stuck
for quite long on how to properly append an item to a List for the
sumOfTwo problem.  I had been using List.concat previously, but then found that
I had trouble simply appending an item to an existing list. This is a case where
examples in docs would've helped. 

That being said, I would love to learn more about working with data structures:
how to properly iterate over them (something I found oddly unintuitive), 
understanding the best use cases for each, and how to manipulate them for each
case.

