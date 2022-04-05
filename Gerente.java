public class Gerente extends Funcionario{
    private  int senha = 1234;

    public int getSenha() {
        return senha;
    }
    public void setSenha(int senha) {
        this.senha = senha;
    }

        public boolean autentificacao(){
            if (getSenha() == 1234){
                return true;
            }
            else{

                return false;
            }
     
        
        
        }
}