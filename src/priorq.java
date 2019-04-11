import java.util.regex.Matcher;
import java.util.regex.Pattern;
class Node{
    int data;
    Node left;
    Node right;
}
public class priorq {

  /*  private static final String REGEX = "\\bcat\\b";
    private static final String INPUT = "cat cat cat cattie cat";*/

    public static void main( String args[] ) {
     /*   Pattern p = Pattern.compile(REGEX);
        Matcher m = p.matcher(INPUT);   // get a matcher object
        int count = 0;

        while(m.find()) {
            count++;
            System.out.println("Match number "+count);
            System.out.println("start(): "+m.start());
            System.out.println("end(): "+m.end());
        }*/
        Node root = null;
        root = Insert(root,10);
//        root = Insert()

    }
    public static Node newNode(int data)
    {
        Node n = new Node();
        n.data = data;
        n.left = n.right =null;
        return n;

    }
    public static Node Insert(Node root,int data)
    {
        if(root == null)
        {
            root = newNode(data);

        }
        else if(root.data>=data)
        {
            root.left = Insert(root.left,data);

        }
        else {
            root.right= Insert(root.right,data);

        }
        return root;
    }
}
