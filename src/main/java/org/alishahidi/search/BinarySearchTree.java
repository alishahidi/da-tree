package org.alishahidi.search;

import org.alishahidi.Node;

public class BinarySearchTree {
    private Node root;

    public void insert(Node node){
        root = insert(root, node);
        System.out.println("Root is: " + root.getData());
    }

    private Node insert(Node root, Node node){
        int data = node.getData();
        if(root == null){
            root = node;
            return root;
        }else if(data < root.getData()){
            root.setLeft(insert(root.getLeft(), node));
        }else{
            root.setRight(insert(root.getRight(), node));
        }
        return root;
    }

    public void display(){
        display(root);
    }

    private void display(Node root){
        if(root != null){
            display(root.getLeft());
            System.out.println(root.getData());
            display(root.getRight());
        }
    }

    public boolean search(int data){
        return search(root, data);
    }

    private boolean search(Node root, int data){
        if(root == null){
            return false;
        }else if(root.getData() == data){
            return true;
        }else if (root.getData() > data){
            return search(root.getLeft(), data);
        }else{
            return search(root.getRight(), data);
        }
    }

    public void remove(int data){
        if(search(data)){
            remove(root, data);
        }else{
            System.out.println(data + " couldn't be found.");
        }
    }

    private Node remove(Node root, int data){
        if(root == null){
            return root;
        }else if(data < root.getData()){
            root.setLeft(remove(root.getLeft(), data));
        }else if(data > root.getData()){
            root.setRight(remove(root.getRight(), data));
        }else{ // Node founded
            if(root.getLeft() == null && root.getRight() == null){
                root = null;
            }else if(root.getRight() != null){
                root.setData(successor(root));
                root.setRight(remove(root.getRight(), root.getData()));
            }else{
                root.setData(predecessor(root));
                root.setLeft(remove(root.getLeft(), root.getData()));
            }
        }
        return root;
    }

    /**
     *
     * @return the least value below the right child of this root node
     */
    private int successor(Node root){
        root = root.getRight();
        while(root.getLeft() != null){
            root = root.getLeft();
        }
        return root.getData();
    }

    /**
     *
     * @return greatest value below the left child of the root node
     */
    private int predecessor(Node root){
        root = root.getLeft();
        while(root.getRight() != null){
            root = root.getRight();
        }
        return root.getData();
    }
}
