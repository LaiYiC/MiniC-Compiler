package config;


public class Error {
	public int id;//�������
	public String info;//������Ϣ
	public int line;//������������
	public Word word;//����ĵ���
	public Error(){
		
	}
	public Error(int id,String info,int line,Word word){
		this.id = id;
		this.info = info;
		this.line = line;
		this.word = word;
	}
	public String toString(){
		return null;
	}
}
