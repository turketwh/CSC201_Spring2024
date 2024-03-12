import java.util.ArrayList;
public class ParseTreeNode {

    private String value;
    private ArrayList<ParseTreeNode> children;

    public ParseTreeNode(String valueInput) {
        value = valueInput;
        children = new ArrayList<ParseTreeNode>();
    }

    public String getValue() {
        return value;
    }

    public ParseTreeNode getChild(int index) {
        if ((index >= 0) && (index < children.size())) {
            return children.get(index);
        }
        else {
            return null;
        }
    }

    public void addChild(ParseTreeNode childInput) {
        children.add(childInput);
    }

    public int getNumberOfChildren() {
        return children.size();
    }

}

