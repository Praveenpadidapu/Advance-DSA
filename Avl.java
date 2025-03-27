class AvlNode
{
    int key;
    int height;
    AvlNode left;
    AvlNode right;
    AvlNode(int key)
    {
        this.key=key;
        this.height=0;
        this.left=null;
        this.right=null;
    }

}
public class Avl 
{
    public static int height(AvlNode node)
    {
        if(node==null)
        {
            return -1;
        }
        return node.height;
    }
    public static AvlNode rr(AvlNode k1)
    {
        AvlNode k2=k1.right;
        k1.right=k2.left;
        k2.left=k1;
        k1.height=Math.max(height(k1.left),height(k1.right))+1;
        k2.height=Math.max(height(k2.left),height(k2.right))+1;
        return k2;
    }
    public static AvlNode ll(AvlNode k2)
    {
        AvlNode k1=k2.left;
        k2.left=k1.right;
        k1.right=k2;   
        k1.height=Math.max(height(k1.left),height(k1.right))+1;
        k2.height=Math.max(height(k2.left),height(k2.right))+1;
        return k1;
    }
    public static AvlNode lr(AvlNode k3)
    {
        k3.left=rr(k3.left);
        return ll(k3);
    }
    public static AvlNode rl(AvlNode k3)
    {
        k3.right=ll(k3.right);
        return rr(k3);
    }
    public static void inorder(AvlNode node)
    {
        if(node !=null)
        {
            inorder(node.left);
            System.out.print(node.key+" ");
            inorder(node.right);
        }
    }
    public static void preorder(AvlNode node)
    {
        if(node !=null)
        {
        System.out.print(node.key+" ");
        preorder(node.left);
        preorder(node.right);
        }
    }
    public static void postorder(AvlNode node)
    {
        if(node !=null)
        {
        postorder(node.left);
        postorder(node.right);
        System.out.print(node.key+" ");
        }
    }
    public static AvlNode insert(int key,AvlNode node)
    {
        if(node==null)
        {
            return new AvlNode(key);
        }
        if(key<node.key)
        {
            node.left=insert(key,node.left);
            if (Math.abs(height(node.left) - height(node.right)) > 1)
            {
                if(key<node.left.key)
                {
                    node=ll(node);
                }
                else
                {
                    node=lr(node);
                }
            }
        }
        else if(key>node.key)
        {
            node.right=insert(key,node.right);
            if (Math.abs(height(node.right) - height(node.left)) > 1)
            {
                if(key>node.right.key)
                {
                    node=rr(node);
                }
                else
                {
                    node=rl(node);
                }
            }
        }
        node.height=Math.max(height(node.left),height(node.right))+1;
        return node;

    }
    public static AvlNode findmin(AvlNode node)
    {
        if(node==null && node.left==null)
        {
            return node;
        }
        return findmin(node.left);
    }
    public static AvlNode delete(int key,AvlNode node)
    {
        if(node==null)
        {
            return null;
        }
        if(key>node.key)
        {
            node.right=delete(key,node.right);
        }
        else if(key<node.key)
        {
            node.left=delete(key,node.left);
        }
        else
        {
            if(node.left!=null && node.right!=null)
            {
                AvlNode minnode=findmin(node.right);
                node.key=minnode.key;
                node.right=delete(minnode.key,node.right);
            }
            else
            {
                node=(node.left!=null)?node.left:node.right;
            }
        }
        if(node!=null)
        {
            node.height=Math.max(height(node.left),height(node.right))+1;
            if(height(node.left)-height(node.right)>=2)
            {
                if(height(node.left.left)>=height(node.left.right))
                {
                    node=ll(node);
                }
                else
                {
                    node=lr(node);
                }
            }
            else if(height(node.right)-height(node.left)>=2)
            {
                if(height(node.right.right)>=height(node.right.left))
                {
                    node=rr(node);
                }
                else
                {
                    node=rl(node);
                }
            }
        }
        return node;
    }
    public static void main(String[] args) 
    {
        int[] arr={23,45,1,6,3,7,2};
        AvlNode root=null;
        for(int i=0;i<arr.length;i++)
        {
            root=insert(arr[i],root);
        }
        System.out.println("after deletion");
        delete(45,root);
        System.out.println("the elements of avl tree");
        inorder(root);
        System.out.println("preorder");
        preorder(root);
        System.out.println("postorder");
        postorder(root);
        
    }
}