# Background

A little playground to help me understand the article
[Perspectives](https://semprag.org/article/view/sp.9.21) by Ash Asudeh and Gianluca Giorgolo that appeared in Semantics and Pragmatics in 2016. A shorter and perhaps more readable version appeared in 2014 as [Monads as a solution for generalized opacity](https://www.aclweb.org/anthology/W14-1403/).

The code is in Scala which does not have linear types, but those are probably only useful for the linguistic side of things.

The [Point of View (PoV)](src/main/scala/PoV.scala) code shows a simplified view of their proposal, with a simple PoV Reader Monad. In the [Test Scala Worsheet](src/main/scala/Test.sc) I show how one can get the results that they get in their document.

## Application to RDF

Even though [RDF Semantics](https://www.w3.org/TR/rdf11-mt/) also has an interpretation function that maps URIs to resources, this does not initially seem the best way to adapt this idea for the following reasons.

 Having a number of interpretation functions breaks the idea of RDF as a global language. The result is that the theory is in danger of favoring subjectivism, leading to a humpty dumpty world, where anyone can mean anything by any word. The authors do have arguments to defend themselves from that. Still the game aspect of language is thereby lost. This may be a solution of last resort, to contemplate, but I think one can get there more easily using inferential semantics.
 
It would be more useful to think in terms of something along the lines of [Robert Brandom](https://www.pitt.edu/~rbrandom/)s' inferential semantics. RDF graphs imply other graphs and form (at it's simplest) a category RDFHom as shown in Benjamin Braatz's thesis [Formal Modelling and Applicationof Graph Transformations in theResource Description Framework](https://pdfs.semanticscholar.org/b8c8/5a3e7a04020259ec9a58c7e5563033f52844.pdf). I attempt to illustrate this category in the diagram below (which I drew up 2 years ago)
 
 ![attempt at illustration of the simple RDFHom category](img/RDFHom-TimBl.jpg)
 
 In the above morphisms in blue show implication between graphs and in green mappings from blank nodes to blank nodes. 
 
 One would need more advanced categories of RDF Graphs that take into account `owl:sameAs` relations. If one takes an agent's beliefs as consisting of a set of such graphs, then one can see another way to construe that Rezza does not believe that { Hesperus = Phosphorus}, namely by checking if in the union of the graphs he believes to be true, that triple appears. That makes the reasoning inferentiable and computable. The semantic map to the world, can then be moved over to pragmatics, namely how to use such graphs.
 
 Still the article's use of monads to explain perspectives is very interesting, and may perhaps be applicable in this category too.
 
 ## Todo
 
 Is RDFHom a Topos? Are the other RDF Categories that build in OWL reasoning ones too? What would a modal logic for those be then? 
 
 If so it looks like one should be able to form a slice topos RdfHom/Person somehow and get some modal logic out of it following David Corfield's introduction in his chapter 4 of [Modal HoTT](http://philsci-archive.pitt.edu/15260/) book which I describe in [Modal HoTT on the Web](https://medium.com/@bblfish/modal-hott-on-the-web-2f4f7996b41f). To do that it would be helpful to work in a category of named pointed graphs.
 
 Another very useful paper is [”Knowledge Representation
 in Bicategories of Relations](https://arxiv.org/pdf/1706.00526.pdf)” by Evan Patterson at Stanford, where he shows how a form of typed OWL can be understood category theoretically.
                               
 
 
 
