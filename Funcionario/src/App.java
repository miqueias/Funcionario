
public class App {

public static void main(String[] args) {
	Funcionario f = new Funcionario();
	f.setNome("Marcos");
	f.setSalario(1000);
	f.aumentaSalario();
	System.out.println("Funcionario = > Nome: " + f.getNome() + " Salário: " + f.getSalario());
	
	Gerente g = new Gerente();
	g.setNome("Manuel");
	g.setSalario(2000);
	g.aumentaSalario();
	System.out.println("Gerente = > Nome: " + g.getNome() + " Salário: " + g.getSalario());
	
	Programador p = new Programador();
	p.setNome("Matheus");
	p.setSalario(3000);
	p.aumentaSalario();
	System.out.println("Programador = > Nome: " + p.getNome() + " Salário: " + p.getSalario());
}

}
