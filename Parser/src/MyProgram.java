
// import de librerias de runtime de ANTLR
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.io.File;

public class MyProgram {
	public static void main(String[] args) throws Exception {
		try{
			// crear un analizador léxico que se alimenta a partir de la entrada (archivo  o consola)
			UNALangLexer lexer;
			if (args.length>0)
				lexer = new UNALangLexer(new ANTLRFileStream(args[0]));
			else
				lexer = new UNALangLexer(new ANTLRInputStream(System.in));
			// Identificar al analizador léxico como fuente de tokens para el sintactico
			CommonTokenStream tokens = new CommonTokenStream(lexer);
			// Crear el analizador sintáctico que se alimenta a partir del buffer de tokens
			UNALangParser parser = new UNALangParser(tokens);
			ParseTree tree = parser.primaryExpression(); // comienza el análisis en la regla inicial
			System.out.println(tree.toStringTree(parser)); // imprime el árbol en forma textual
		} catch (Exception e){
			System.err.println("Error (Test): " + e);
		}
	}
}
