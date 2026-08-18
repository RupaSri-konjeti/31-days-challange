Day 29 – Advanced Binary Tree Problems 🌳

Today I practiced advanced Binary Tree problems focusing on tree balance, tree views, and path-based problems.

Topics Covered
Check if Binary Tree is Balanced
Left View of Binary Tree
Right View of Binary Tree
Root-to-Leaf Path Sum
Problems Solved
1. Check if Binary Tree is Balanced

A Binary Tree is balanced if the height difference between the left and right subtrees of every node is at most 1.

Key idea:

Calculate height recursively.
Check the difference between left and right subtree heights.
Return -1 if the tree is unbalanced.
Time Complexity: O(n)
Space Complexity: O(h)
2. Left View of Binary Tree

The Left View contains the first node visible at every level.

Key idea:

Use Level Order Traversal (BFS).
Find the size of each level.
Print the first node of every level using i == 0.
Time Complexity: O(n)
Space Complexity: O(n)
3. Right View of Binary Tree

The Right View contains the last node visible at every level.

Key idea:

Use Level Order Traversal (BFS).
Find the size of each level.
Print the last node using i == size - 1.
Time Complexity: O(n)
Space Complexity: O(n)
4. Root-to-Leaf Path Sum

Checks whether a root-to-leaf path exists whose node values add up to the given target sum.

Key idea:

Start from the root.
Subtract the current node's value from the target sum.
Recursively check the left and right subtrees.
When a leaf node is reached, compare its value with the remaining sum.
Time Complexity: O(n)
Space Complexity: O(h)
Key Learnings
Balanced Tree → Check height difference.
Left View → First node of every level.
Right View → Last node of every level.
Path Sum → Subtract values and check at the leaf.
BFS is useful for level-based Binary Tree problems.
Recursion is useful for height and path-based problems.
Day 29 Completed

Continuing my 31 Days DSA Challenge and strengthening my Binary Tree concepts.
