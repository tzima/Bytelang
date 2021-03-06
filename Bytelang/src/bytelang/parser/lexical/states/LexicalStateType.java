package bytelang.parser.lexical.states;

public enum LexicalStateType {
	DEFAULT,
	
	S_AT,
	S_EQUAL,
	S_COMMA,
	S_SEMICOLN,
	S_COLLON,
	S_HASH,
	S_DOT,
	
	S_LPARENTHESIS,
	S_RPARENTHESIS,
	S_LBRACKET,
	S_RBRACKET,
	S_LBRACE,
	S_RBRACE,
	S_LANGLEBRACKET,
	S_RANGLEBRACKET,
	
	INTEGER,
	REFERENCE,
	STRING,
	
	LINE_COMMENT,
	BLOCK_COMMENT,
	
	WORD;
}
