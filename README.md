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

## MyLinkedList
### Fields:
* head: A reference to the first node in the linked list.
* tail: A reference to the last node in the linked list.
* size: An integer representing the number of elements in the linked list.
### Constructors:
* MyLinkedList(): Constructor to initialize an empty linked list.
## Methods:
### Public Methods:
* void add(T item): Adds an item to the end of the linked list.
* void set(int index, T item): Sets the item at the specified index in the linked list.
* void add(int index, T item): Inserts an item at the specified index in the linked list.
* void addFirst(T item): Inserts an item at the beginning of the linked list.
* void addLast(T item): Adds an item to the end of the linked list.
* T get(int index): Retrieves the item at the specified index in the linked list.
* T getFirst(): Retrieves the first item in the linked list.
* T getLast(): Retrieves the last item in the linked list.
* void remove(int index): Removes the item at the specified index from the linked list.
* void removeFirst(): Removes the first item from the linked list.
* void removeLast(): Removes the last item from the linked list.
* void sort(): Sorts the linked list in ascending order.
* int indexOf(Object object): Returns the index of the first occurrence of the specified object in the linked list.
* int lastIndexOf(Object object): Returns the index of the last occurrence of the specified object in the linked list.
* boolean exists(Object object): Checks if the specified object exists in the linked list.
* Object[] toArray(): Converts the linked list to an array.
* void clear(): Clears all elements from the linked list.
* int size(): Returns the number of elements in the linked list.
* Iterator<T> iterator(): Returns an iterator over the elements in the linked list.
### Private Inner Class:
*ListNode<T>: A nested class representing a node in the linked list. It contains fields for data, a reference to the next node, and a reference to the previous node.
## MyList interface
* void add(T item): Adds an item to the end of the list.
* void set(int index, T item): Sets the item at the specified index in the list.
* void add(int index, T item): Inserts an item at the specified index in the list.
* void addFirst(T item): Inserts an item at the beginning of the list.
* void addLast(T item): Adds an item to the end of the list.
* T get(int index): Retrieves the item at the specified index in the list.
* T getFirst(): Retrieves the first item in the list.
* T getLast(): Retrieves the last item in the list.
* void remove(int index): Removes the item at the specified index from the list.
* void removeFirst(): Removes the first item from the list.
* void removeLast(): Removes the last item from the list.
* void sort(): Sorts the list.
* int indexOf(Object object): Returns the index of the first occurrence of the specified object in the list.
* int lastIndexOf(Object object): Returns the index of the last occurrence of the specified object in the list.
* boolean exists(Object object): Checks if the specified object exists in the list.
* Object[] toArray(): Converts the list to an array.
* void clear(): Clears all elements from the list.
* int size(): Returns the number of elements in the list.
## MyStack
### Fields:
* list: An instance of MyLinkedList used to store the elements of the stack.
### Methods:
* push(T element): Adds an element to the top of the stack.
* pop(): Removes and returns the element at the top of the stack.
* peek(): Returns the element at the top of the stack without removing it.
* isEmpty(): Checks if the stack is empty.
* size(): Returns the number of elements in the stack.
### Functionality:
* push(T element): Appends the element to the end of the linked list, as elements are added to the end in a stack (Last-In-First-Out).
* pop(): Retrieves and removes the last element from the linked list, simulating the behavior of popping the top element from the stack.
* peek(): Retrieves the last element from the linked list without removing it, giving a view of the top element in the stack.
* isEmpty(): Checks if the size of the linked list is zero, indicating an empty stack.
* size(): Returns the number of elements in the linked list, which corresponds to the size of the stack.
### Exception Handling:
Both pop() and peek() methods throw a NoSuchElementException if called on an empty stack.
## MyQueue
### Fields:
* list: An instance of MyLinkedList used to store the elements of the queue.
### Methods:
* enqueue(T element): Adds an element to the end of the queue.
* dequeue(): Removes and returns the element at the front of the queue.
* peek(): Returns the element at the front of the queue without removing it.
* isEmpty(): Checks if the queue is empty.
* size(): Returns the number of elements in the queue.
### Functionality:
* enqueue(T element): Appends the element to the end of the linked list, as elements are added to the end in a queue (First-In-First-Out).
* dequeue(): Retrieves and removes the first element from the linked list, simulating the behavior of dequeuing from the front of the queue.
* peek(): Retrieves the first element from the linked list without removing it, giving a view of the front element in the queue.
* isEmpty(): Checks if the size of the linked list is zero, indicating an empty queue.
 *size(): Returns the number of elements in the linked list, which corresponds to the size of the queue.
### Exception Handling:
Both dequeue() and peek() methods throw a NoSuchElementException if called on an empty queue.
## MyMinHeap
### Fields:
* heap: An instance of MyArrayList used to represent the heap.
### Constructor:
* MyMinHeap(): Initializes an empty min-heap.
### Methods:
* add(T item): Adds an item to the min-heap while maintaining the heap property.
* extractMin(): Removes and returns the minimum element from the min-heap, maintaining the heap property.
* peek(): Returns the minimum element in the min-heap without removing it.
* heapify(int i): Adjusts the heap structure starting from the given index to maintain the heap property.
* swap(int i, int j): Swaps the elements at the given indices in the heap.
* size(): Returns the number of elements in the min-heap.
* isEmpty(): Checks if the min-heap is empty.
### Functionality:
* add(T item): Adds the item to the end of the heap and then moves it up the heap until the heap property is satisfied.
* extractMin(): Removes the minimum element (at index 0) from the heap, replaces it with the last element, and then adjusts the heap structure downward to maintain the heap property.
* peek(): Returns the element at index 0, which is the minimum element in the heap.
* heapify(int i): Compares the element at index i with its children and swaps it with the smallest child if necessary, recursively calling heapify() on the affected child.
* swap(int i, int j): Swaps the elements at indices i and j in the heap.
* size(): Returns the number of elements in the heap.
* isEmpty(): Returns true if the heap is empty, false otherwise.





