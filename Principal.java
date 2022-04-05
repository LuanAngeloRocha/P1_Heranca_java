public class Principal{


    public static void main (String []args ){

        Gerente g= new Gerente();
        g.setNome("Luan Angelo ");
        g.setCpf("123456");
        g.setSalario(1000.0);
        g.setDepartamento("Compras");
        g.setSenha(1234);

        System.out.println(g.getNome());
        System.out.println(g.getCpf());
        System.out.println(g.getDepartamento());
        System.out.println(g.getSenha());
        System.out.println(g.autentificacao());
        System.out.println(g.Bonificacao());


        

    }
}