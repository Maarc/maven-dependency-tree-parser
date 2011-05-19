package fr.dutra.tools.maven.deptree.core;




/**
 * Generates an output that is identical to the output generated by the following maven command:
 * <pre>mvn dependency:tree -DoutputType=text -Dtokens=standard</pre>
 * @author Alexandre Dutra
 *
 */
public class StandardTextVisitor extends AbstractTextVisitor {


    @Override
    public String getTreeSymbols(Node node) {
        if(node == node.getParent().getLastChildNode()) {
            return "\\- ";
        } else {
            return"+- ";
        }
    }

    @Override
    public String getParentTreeSymbols(Node node) {
        if(node == node.getParent().getLastChildNode()) {
            return "   ";
        } else {
            return "|  ";
        }
    }

}