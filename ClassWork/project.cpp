#include <iostream>
#include <unordered_map>
#include <vector>
#include <string>

using namespace std;

struct TrieNode {
    unordered_map<char, TrieNode*> children;
    int node_id;
    bool is_end_of_word;
    
    TrieNode(int id): node_id(id), is_end_of_word(false) {}
};

class Trie {
private:
    TrieNode* root;
    int next_id;
    
public:
    Trie(): next_id(1) {
        root = new TrieNode(0);
    }
    
    void insert(const string& word) {
        TrieNode* current = root;
        for (char c : word) {
            if (current->children.find(c) == current->children.end()) {
                current->children[c] = new TrieNode(next_id++);
            }
            current = current->children[c];
        }
        current->is_end_of_word = true;
    }
    
    void constructAdjacencyList() {
        vector<pair<int, int>> edges;
        vector<string> labels;
        traverse(root, edges, labels);
        
        // Print the adjacency list
        for (int i = 0; i < edges.size(); ++i) {
            cout << edges[i].first << "->" << edges[i].second << ":" << labels[i] << endl;
        }
    }
    
private:
    void traverse(TrieNode* node, vector<pair<int, int>>& edges, vector<string>& labels) {
        for (auto& kv : node->children) {
            char c = kv.first;
            TrieNode* child = kv.second;
            edges.push_back({node->node_id, child->node_id});
            labels.push_back(string(1, c));
            traverse(child, edges, labels);
        }
        if (node->is_end_of_word) {
            edges.push_back({node->node_id, next_id++});
            labels.push_back("");
        }
    }
};

int main() {
    int n;
    cin >> n;
    vector<string> patterns(n);
    for (int i = 0; i < n; ++i) {
        cin >> patterns[i];
    }
    
    Trie trie;
    for (const string& pattern : patterns) {
        trie.insert(pattern);
    }
    
    trie.constructAdjacencyList();
    
    return 0;
}
