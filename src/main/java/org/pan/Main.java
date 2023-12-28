package org.pan;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.pan.DrawAntlr.DrawBaseVisitor;
import org.pan.DrawAntlr.DrawLexer;
import org.pan.DrawAntlr.DrawParser;
import org.pan.listener.Draw_Listener;
import org.pan.visitor.Draw_Visitor;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Path;

public class Main {
    public static void main(String[] args) throws IOException {

        InputStream is = new FileInputStream(String.valueOf(Path.of("src/main/java/org/pan/test.txt")));
        CharStream cs = CharStreams.fromStream(is);
        DrawLexer drawLexer = new DrawLexer(cs); // 词法分析
        CommonTokenStream tokens = new CommonTokenStream(drawLexer);

        DrawParser drawParser = new DrawParser(tokens); // 语法分析
        ParseTree tree = drawParser.prog();

//        ParseTreeWalker walker = new ParseTreeWalker();
//        Draw_Listener drawListener = new Draw_Listener();
//        walker.walk(drawListener,tree);
        DrawBaseVisitor<Double> visitor = new Draw_Visitor();
        visitor.visit(tree);
    }

}