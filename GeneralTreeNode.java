import java.util.ArrayList;
import java.util.List;

public class GeneralTreeNode {
    String name;
    GeneralTreeNode parent;
    List<GeneralTreeNode> children;
     
    public GeneralTreeNode (String name) {
        this.name = name;
        this.parent = null;
        this.children = new ArrayList<>();
    }
    public void addChild(GeneralTreeNode child) {
        child.parent = this;
        this.children.add(child);
    }
    public void preorderTransversal() {
        System.out.println(this.name);

        for (GeneralTreeNode child : children) {
            child.preorderTransversal();
        }
    }
    public void postorderTransversal() {
        for (GeneralTreeNode child : children) {
            child.postorderTransversal();
        }
        System.out.println(this.name);
    }
}