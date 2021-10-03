#include <bits/stdc++.h>
using namespace std;

int cnt = 0;
struct Node {
    int data;
    Node *left;
    Node *right;
};

struct Node* newNode(int data) {
    struct Node* node = new Node;
    node->data = data;
    node->left = node->right = NULL;
    return (node);
}

int traverse(Node *node) {
    if (node == NULL)
        return 0; //base case
    else {
        return 1 + traverse(node->left) + traverse(node->right);
    }
    // cnt++;
    // cnt += traverse(node->left);    //recursive call
    // cout << "Called left" << "\n";
    // cnt += traverse(node->right); //recursive call
    // return cnt;
}

int modified_traverse(Node *node) {
    if(node == NULL)
        return 0;

    int counter = 0;
    queue<Node *> q;
    q.push(node);

    while(!q.empty()) {
        Node *tmp = q.front();
        q.pop();
        counter++;
        if (tmp->left != NULL)
            q.push(tmp->left);
        if (tmp->right != NULL)
            q.push(tmp->right);
    }

    return counter;
}

int main(void) {    
    struct Node *root = newNode(2);
    Node *tmp = root;
    // create a left-skewed binary tree with 0.5M nodes
    for(int i = 0; i<500000; i++) {
        tmp->left = newNode(i);
        tmp = tmp->left;
    }
    // Will run successfully    
    cout << modified_traverse(root) << "\n";
    // Segmentation fault (core dumped) for the following
    cout << traverse(root) << "\n";
    return 0;
}