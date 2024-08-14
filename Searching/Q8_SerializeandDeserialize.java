class Tree {
    // Function to serialize a tree and return a list containing nodes of tree.
    public ArrayList<Integer> serialize(Node root) {
        ArrayList<Integer> result = new ArrayList<>();
        if (root == null) return result;

        Queue<Node> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()) {
            Node curr = q.poll();

            if (curr == null) {
                result.add(-1);
            } else {
                result.add(curr.data);
                q.add(curr.left);
                q.add(curr.right);
            }
        }
        return result;
    }

    // Function to deserialize a list and construct the tree.
    public Node deSerialize(ArrayList<Integer> data) {
        if (data.size() == 0) return null;

        Node root = new Node(data.get(0));
        Queue<Node> q = new LinkedList<>();
        q.add(root);

        int i = 1;
        while (!q.isEmpty()) {
            Node curr = q.poll();

            if (data.get(i) != -1) {
                curr.left = new Node(data.get(i));
                q.add(curr.left);
            }
            i++;

            if (i < data.size() && data.get(i) != -1) {
                curr.right = new Node(data.get(i));
                q.add(curr.right);
            }
            i++;
        }
        return root;
    }
};
