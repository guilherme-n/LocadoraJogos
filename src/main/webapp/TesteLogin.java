import javax.faces.bean.ManagedBean;
import javax.faces.event.AjaxBehaviorEvent;

/**
 *
 * @author guilhermenascimento
 */
@ManagedBean(name = "teste2")
public class TesteLogin {
    private String login;
    private String senha;
    
    public TesteLogin(){
        login = "";
        senha = "";
    }

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
    
    public void logar(){
        System.out.println("login: " + login);
    }
    
    public void logarAjax(AjaxBehaviorEvent event) {
        System.out.println("login: " + login);
    }
}
