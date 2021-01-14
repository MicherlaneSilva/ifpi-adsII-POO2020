package exercicio4;

public class TestaSenha {
	public static void main(String args[]) {
		Senha s = new Senha("M1ascdd");
		System.out.println(s.ehIgual("manto"));
		System.out.println(s.ehIgualTrim(" M1ascdd "));
		System.out.println(s.ehValida());
	
	}
}
