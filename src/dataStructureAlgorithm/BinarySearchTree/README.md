# BinarySearchTree

## Time Complexity
| Operation   | Best Case               | Average Case                | Worst Case            |
|-------------|-------------------------|-----------------------------|-----------------------|
| **Insert**  | **O(1)** (Root Insert)  | **O(log n)** (Balanced BST) | **O(n)** (Skewed BST) |
| **Search**  | **O(1)** (Root Match)   | **O(log n)** (Balanced BST) | **O(n)** (Skewed BST) |


### Note:

- The worst case happens when the BST behaves like a linked list (e.g., inserting sorted elements without balancing).
- In a balanced BST, operations remain O(log n) due to the height of the tree being minimized.