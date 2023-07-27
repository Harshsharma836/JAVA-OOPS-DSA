package TreeDS;

public class BST {
    public class Node{
        private int value;
        private Node left;
        private Node right;
        int height;

        public Node (int value){
            this.value = value;
        }
        public int getValue(){
            return this.value;
        }
    }
    private Node root;
    public BST(){

    }

    public int height(Node node){
        if(node == null) return -1;
        return node.height;
    }

    public boolean isEmpty(){
        return root == null;
    }

    public void insert(int value){
        root = insert( value, root);
    }

    private Node insert(int value , Node node){ //   8 , root
        if(node == null){
            node = new Node(value);
            return node;
        }
        if(value < node.value){ // 8 <  15 , 8 < 10 ,
            node.left = insert(value , node.left);
        }
        if(value > node.value){
            node.right = insert(value , node.right);
        }
        node.height = Math.max(height(node.left), height((node.right))) + 1;
        return node;
    }

    public void populate(int [] nums){
        for(int i=0 ; i<nums.length; i++){
            this.insert(nums[i]);
        }
    }

    public void display(){
        display(root,  "root node");
    }

    private void display(Node node , String details){
        if(node == null){
            return;
        }
        System.out.println(details + node.getValue());
        display(node.left , " left child of " + node.getValue() + " : ");
        display(node.right , " rigth child of " + node.getValue() + " : ");
    }

    public void preorder(){
        preOrder(root);
    }
    private void preOrder(Node node){
        if(node == null){
            return;
        }
        System.out.println(node.value + "  ");
        preOrder(node.left);
        preOrder(node.right);
    }

    public void inorder(){
        inOrder(root);
    }
    private void inOrder(Node node){
        if(node == null){
            return;
        }
        preOrder(node.left);
        System.out.println(node.value + "  ");
        preOrder(node.right);
    }

    public void postorder(){
        postOrder(root);
    }
    private void postOrder(Node node){
        if(node == null){
            return;
        }
        preOrder(node.left);
        preOrder(node.right);
        System.out.println(node.value + "  ");
    }

}
