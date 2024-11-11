
package pacLogica;


public class Administrador {

    
    private long id;
    String login;
    String senha;

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    public long getId() {
        return id;
    }   
    public void setId(long id) {
        this.id = id;
    }
}
