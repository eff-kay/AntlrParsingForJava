

import generated.Java8Lexer;
import generated.Java8Parser;
import main.MyVisitor;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;

public class ASTPrinter {

    public static void main(String[] args) throws Exception {
//        System.out.println("Enter a filename with the .java format into the console,");
//        String input = System.console().readLine();
//        if (args.length ==0 ){
//            System.out.println("Enter the file name as an argument, java -jar antlr <filename.java>");
//        }
//        CharStream charStreams = CharStreams.fromFileName (args[0]);
        CharStream charStreams = CharStreams.fromFileName ("ZooKeeperHelper.java");
        Java8Lexer java8Lexer = new Java8Lexer(charStreams);
        CommonTokenStream commonTokenStream = new CommonTokenStream(java8Lexer);
        Java8Parser java8Parser = new Java8Parser(commonTokenStream);
        ParseTree tree = java8Parser.compilationUnit();

        MyVisitor visitor = new MyVisitor();
        visitor.visit(tree);

//        public static void main(String[] args) throws Exception {
//            new ASTPrinter().init();
//        }
//
//        public void init() throws Exception {
//            // Read the source
//
//        CharStream charStream = CharStream.fromFileName("./Main.java");
//
//            // create the lexer attached to stdin
//        Java8Lexer java8Lexer = new Java8Lexer(charStream);
//
//            // create the buffer of tokens between the lexer and parser
//            CommonTokenStream commonTokenStream = new CommonTokenStream(java8Lexer);
//
//            // create the parser attached to the token buffer
//            // and tell it which debug event listener to use
//        Java8Parser java8Parser = new Java8Parser(commonTokenStream);
//
//            // launch the parser using the treeadaptor
//            java8Parser.getBuildParseTree();
//
//            // Get the compilation unit item
//            Java8Parser ret = parser.compilationUnit();
//
//            // Get the associated tree
//            CommonTree tree = (CommonTree) ret.getTree();
//
//            // Print the tree
//            printTree(tree, 1);
//        }

//        public void printTree(CommonTree t, int indent) {
//            System.out.println(t.toString());
//            printTreeHelper(t, indent);
//        }
//
//        private void printTreeHelper(CommonTree t, int indent) {
//            if (t != null) {
//                StringBuffer sb = new StringBuffer(indent);
//                for (int i = 0; i < indent; i++)
//                    sb = sb.append("   ");
//                for (int i = 0; i < t.getChildCount(); i++) {
//                    //if (t.getChild(i).getType()==4)
//                    System.out.println(sb.toString() + t.getChild(i).toString()
//                            + " [" + JavaParser.tokenNames[t.getChild(i).getType()]
//                            + "]");
//                    printTreeHelper((CommonTree) t.getChild(i), indent + 1);
//                }
//            }
//        }
//    }
    }

}
