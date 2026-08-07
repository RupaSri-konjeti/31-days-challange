# 📅 Day 27 – Binary Trees Basics 🌳

## 📚 Concepts

* Introduction to Binary Trees
* Types of Binary Trees
* Tree Terminology

  * Root
  * Parent
  * Child
  * Leaf
  * Sibling
  * Height
  * Depth
* Binary Tree Representation
* DFS vs BFS
* Recursion in Binary Trees

## 💻 Problems

### 1. Preorder Traversal ⭐⭐⭐⭐⭐

**Order:** `Root → Left → Right`

```text
        10
       /  \
      20   30
     /  \  /
    40  50 60
```

**Output:**

```text
10 20 40 50 30 60
```

---

### 2. Inorder Traversal ⭐⭐⭐⭐⭐

**Order:** `Left → Root → Right`

**Output:**

```text
40 20 50 10 60 30
```

---

### 3. Postorder Traversal ⭐⭐⭐⭐⭐

**Order:** `Left → Right → Root`

**Output:**

```text
40 50 20 60 30 10
```

## 🧠 Traversal Summary

| Traversal | Order               | Root Position |
| --------- | ------------------- | ------------- |
| Preorder  | Root → Left → Right | First         |
| Inorder   | Left → Root → Right | Middle        |
| Postorder | Left → Right → Root | Last          |

### 🔑 Easy Memory Trick

```text
Preorder  → Root First
Inorder   → Root in Middle
Postorder → Root Last
```

## 🔁 Recursion Pattern

All three traversals use the same basic recursion:

```java
if (root == null)
    return;
```

The main difference is the position of:

```java
System.out.print(root.data + " ");
```

### Preorder

```java
System.out.print(root.data + " ");
preorder(root.left);
preorder(root.right);
```

### Inorder

```java
inorder(root.left);
System.out.print(root.data + " ");
inorder(root.right);
```

### Postorder

```java
postorder(root.left);
postorder(root.right);
System.out.print(root.data + " ");
```

## ⏱️ Complexity

For all three traversals:

* **Time:** `O(n)`
* **Space:** `O(h)`

Where:

* `n` = number of nodes
* `h` = height of the tree

## ✅ Day 27 Completed

Today I learned the fundamentals of **Binary Trees** and implemented the three basic DFS traversals using **Java recursion**.

### Next: Day 28 🚀

* Level Order Traversal (BFS)
* Maximum Depth of Binary Tree
* Diameter of Binary Tree

---

**#DSA #BinaryTrees #Java #CodingInterview #DSAChallenge #LearningInPublic**
