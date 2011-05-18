package fr.dutra.tools.maven.deptree.core;




/**
 * Generates an output that is identical to the output generated by the following maven command:
 * <pre>mvn dependency:tree -DoutputType=text -Dtokens=standard</pre>
 * @author Alexandre Dutra
 *
 */
public class MavenDependencyTreeStandardTextVisitor extends MavenDependencyTreeAbstractTextVisitor {


    @Override
    public String getTreeSymbols(MavenDependencyTreeNode node) {
        if(node == node.getParent().getLastChildNode()) {
            return "\\- ";
        } else {
            return"+- ";
        }
    }

    @Override
    public String getParentTreeSymbols(MavenDependencyTreeNode node) {
        if(node == node.getParent().getLastChildNode()) {
            return "   ";
        } else {
            return "|  ";
        }
    }

}