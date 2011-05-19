package fr.dutra.tools.maven.deptree.core;




/**
 * Generates an output that is identical to the output generated by the following maven command:
 * <pre>mvn dependency:tree -DoutputType=text -Dtokens=whitespace</pre>
 * @author Alexandre Dutra
 *
 */
public class WhitespaceTextVisitor extends AbstractTextVisitor {


    @Override
    public String getTreeSymbols(Node node) {
        return "   ";
    }

    @Override
    public String getParentTreeSymbols(Node node) {
        return "   ";
    }

}