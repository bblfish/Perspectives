# Background

A little playground to help me understand the article
[Perspectives](https://semprag.org/article/view/sp.9.21) by Ash Asudeh and Gianluca Giorgolo that appeared in Semantics and Pragmatics in 2016. A shorter and perhaps more readable version appeared in 2014 as [Monads as a solution for generalized opacity](https://www.aclweb.org/anthology/W14-1403/).

The code is in Scala which does not have linear types, but those are probably only useful for the linguistic side of things.

## Application to RDF

Even though [RDF Semantics](https://www.w3.org/TR/rdf11-mt/) also has an interpretation function that maps URIs to resources, this does not initially seem the best way to adapt this idea for a number of reasons some listed below.

 Having a number of interpretation functions breaks the idea of RDF as a global language. The point of view of the article is overly subjective, leading to the danger of subjectivism creeping in, and leading to a humpty dumpty world, where anyone can mean anything by any word. The game aspect of language is thereby lost. This may be a solution of last resort.
 
 Before adapting a solution of last resort it would be more useful to think in terms of something along the lines of Brandoms' inferential semantics. RDF graphs imply other graphs and form a category RDFHom as shown by Benjamin Braatz's thesis [Formal Modelling and Applicationof Graph Transformations in theResource Description Framework](https://pdfs.semanticscholar.org/b8c8/5a3e7a04020259ec9a58c7e5563033f52844.pdf).
 
 ![attempt at illustration of the simple RDFHom category](img/RDFHom-TimBl.jpg)
 
 In the above morphisms in blue show implication between graphs and in green mappings from blank nodes to blank nodes. 
 
 One would need more advanced categories of RDF Graphs that take into account `owl:sameAs` relations. If one takes an agent's beliefs as consisting of a set of such graphs, then one can see another way to construe that Rezza does not believe that { Hesperus = Phosphorus}, namely by checking if in the union of the graphs he believes to be true, that triple appears. That makes the reasoning inferentiable and computable. The semantic map to the world, can then be moved over to pragmatics, namely how to use such graphs.
 
 
 
