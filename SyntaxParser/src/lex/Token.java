package lex;

public class Token {
	public int type;
	public String value;
	public Token(int type,String value){
		this.type = type;
		this.value = value;
	}
	public String toString(){
		return "<"+this.type+","+this.value+">";
	}
}
