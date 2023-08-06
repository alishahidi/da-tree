# Binary Search Tree (da-tree) Project

This project provides an implementation of a Binary Search Tree (BST) data structure along with various operations such as insertion, removal, searching, and display of the tree elements.

## BinarySearchTree Class

The `org.alishahidi.search.BinarySearchTree` class represents the Binary Search Tree and includes the following methods:

### `insert(Node node)`

Inserts a new node into the Binary Search Tree.

### `display()`

Displays the elements of the Binary Search Tree in sorted order.

### `search(int data)`

Searches for a given data in the Binary Search Tree and returns true if found, false otherwise.

### `remove(int data)`

Removes a node with the given data from the Binary Search Tree.

## Node Class

The `org.alishahidi.Node` class represents a node in the Binary Search Tree. Each node contains an integer value (`data`) along with references to its left and right children.

## Usage

To use the Binary Search Tree, follow these steps:

1. Create an instance of `BinarySearchTree`.
2. Insert nodes using the `insert(Node node)` method.
3. Display the elements of the tree using the `display()` method.
4. Search for elements using the `search(int data)` method.
5. Remove nodes using the `remove(int data)` method.

Here's an example of how to use the BinarySearchTree class:

```java
import org.alishahidi.Node;
import org.alishahidi.search.BinarySearchTree;

public class Main {
    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();

        tree.insert(new Node(5));
        tree.insert(new Node(1));
        tree.insert(new Node(9));
        tree.insert(new Node(2));
        tree.insert(new Node(7));
        tree.insert(new Node(3));
        tree.insert(new Node(6));
        tree.insert(new Node(4));
        tree.insert(new Node(8));

        tree.remove(1);
        tree.display();
        System.out.println(tree.search(10));
    }
}
```

## Output
The output of the above example will display the elements of the Binary Search Tree in sorted order after removing the node with data 1 and will print whether the data 10 is present in the tree or not.

## License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.

## Credits

The project is maintained by [Ali Shahidi](https://github.com/alishahidi).

Feel free to use this project as a reference for understanding how to implement an tree and binary search tree in Java. If you have any suggestions or improvements, please feel free to contribute!
