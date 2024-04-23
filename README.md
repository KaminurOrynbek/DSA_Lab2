## MyArrayList
### Fields:
* array: An array to hold the list elements.
* size: The number of elements currently in the list.
### Constructors:
* Default constructor: Initializes the list with an initial capacity of 10.
* Constructor with specified initial capacity: Allows setting the initial capacity of the list.
* Constructor with existing array: Initializes the list with an existing array of items.
* Copy constructor: Initializes the list with another MyArrayList instance.
### Public Methods:
* add(T item): Adds an item to the end of the list.
* set(int index, T item): Sets the item at the given index to the specified value.
* add(int index, T item): Adds the item at the specified index, shifting subsequent elements to the right.
* addFirst(T item): Adds an item at the beginning of the list.
* addLast(T item): Adds an item at the end of the list.
* get(int index): Retrieves the item at the specified index.
* getFirst(), getLast(): Retrieves the first and last items in the list.
* removeFirst(), remove(int index), removeLast(): Removes the first, specified, or last item from the list.
* sort(): Sorts the list using a bubble sort algorithm.
* indexOf(Object object), lastIndexOf(Object object), exists(Object object): Searches for the specified object in the list.
* toArray(): Converts the list to an array.
* clear(): Clears the list.
* size(): Returns the number of items in the list.
* iterator(): Provides an iterator for iterating over the elements in the list.
