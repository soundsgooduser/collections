Guava Collections
Apache Commons Collections
JDK Collections

Example1:
    Collections.unmodifiableList, ImmutableList.of:
        add, remove, clear methods - throw UnsupportedOperationException
        reverse method - reverse successfully
        get method - returns object and this object is allowed to be modified

Example2:
    The Guava "immutable" collections are often preferable to the similar JDK "unmodifiable" collections provided by the Collections class 
    because Guava's immutable collections cannot be changed even when the original data structure upon which they were created is changed. 
    The reason for the difference is that the JDK's "unmodifiable" collections are "views" of underlying collections
    and these views are changed if the thing they are "viewing" is changed.
    The Guava immutable collections, on the other hand, are not mere views of the source data structure, 
    but are copies of it such that changes to the original structure have no impact on the copied immutable collection.    
    Guava's immutable collections are often preferable to the JDK's "unmodifiable" collections
    because the Guava immutable collections cannot be changed even when the data structure upon which they were first created changes.
    However, neither the JDK unmodifiable collections nor the Guava immutable collections can do anything about elements of the respective collections that are themselves mutable.
    In other words, a person may not be able to add an element or remove an element from an immutable or unmodifiable collection,
    but that same person can change any given element's contents if that element is mutable.
            
Example3:
    Immutable builders              