class Node
{
    int key;
    Node left;
    Node right;
    Node(int key)
    {
        this.key=key;
        left=null;
        right=null;
    }
}
class Binarytree
{
    public static Node insert(Node root,int key)
    {
        if(root==null)
        {
            return new Node(key);
        }
        if(key>root.key)
        {
            root.right=insert(root.right,key);
        }
        else
        {
            root.left=insert(root.left,key);
        }
        return root;
    }
    public static void inorder(Node root)
    {
        if(root!=null)
        {
        inorder(root.left);
        System.out.println(root.key);
        inorder(root.right);
        }
    }
    public static void preorder(Node root)
    {
        if(root!=null)
        {
        System.out.println(root.key);
        preorder(root.left);
        preorder(root.right);
        }
    }
    public static void postorder(Node root)
    {
        if(root!=null)
        {
        postorder(root.left);
        postorder(root.right);
        System.out.println(root.key);
        }
    }
    public static Node Min(Node curr)
    {
        while(curr!=null && curr.left!=null)
        {
            curr=curr.left;
        }
        return curr;
    }
    public static Node delete(Node root,int key)
    {
        if(root==null)
        {
            return root;
        }
        if(root.key>key)
        {
            root.left=delete(root.left,key);
        }
        else if(root.key<key)
        {
            root.right=delete(root.right,key);
        }
        else
        {
            if(root.left==null)
            {
                return root.right;
            }
            if(root.right==null)
            {
                return root.left;
            }
            else
            {
                Node min=Min(root.right);
                root.key=min.key;
                root.right=delete(root.right,min.key);
            }
        }
        return root;
    }
    public static void main(String[] args) 
    {
        Node root=null;
        root=insert(root,10);
        insert(root,20);
        insert(root,2);
        delete(root,20);
        insert(root,45);
        insert(root,-1);
        delete(root,10);
        System.out.println("inorder");
        inorder(root);
        System.out.println("preorder");
        preorder(root);
        System.out.println("postorder");
        postorder(root);
    }
    
    
}
