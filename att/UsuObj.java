package att;

public class UsuObj {

	public static void main(String[] args) {
		Usu usuario1 = new Usu();
		Usu usuario2 = new Usu();
		
		usuario1.setId(01);
		usuario1.setNome("Sunny");
		usuario1.setPassword(2000);
		usuario1.setPermissao("sim");
		usuario1.setUsuario("Sunny_Nyny");
		usuario1.setAcesso("sim");
		usuario1.setLogar("sim");
		usuario1.setDeslogar("sim");
		usuario1.setExcluiconta("sim");
		
		usuario2.setId(02);
		usuario2.setNome("Aubrey");
		usuario2.setPassword(2004);
		usuario2.setPermissao("sim");
		usuario2.setUsuario("Aubreyy_");
		usuario2.setAcesso("sim");
		usuario2.setLogar("sim");
		usuario2.setDeslogar("sim");
		usuario2.setExcluiconta("sim");
		
		System.out.println("————— Objeto 1 —————");
		System.out.println(usuario1.getId());
		System.out.println(usuario1.getNome());
		System.out.println(usuario1.getPassword());
		System.out.println(usuario1.getPermissao());
		System.out.println(usuario1.getUsuario());
		System.out.println(usuario1.getAcesso());
		System.out.println(usuario1.getLogar());
		System.out.println(usuario1.getDeslogar());
		System.out.println(usuario1.getExcluiconta());
		
		System.out.println("————— Objeto 2 —————");
		System.out.println(usuario2.getId());
		System.out.println(usuario2.getNome());
		System.out.println(usuario2.getPassword());
		System.out.println(usuario2.getPermissao());
		System.out.println(usuario2.getUsuario());
		System.out.println(usuario2.getAcesso());
		System.out.println(usuario2.getLogar());
		System.out.println(usuario2.getDeslogar());
		System.out.println(usuario2.getExcluiconta());
		

	}

}
