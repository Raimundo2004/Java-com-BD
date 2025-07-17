import DAO.UsuarioDAO;
import Entidades.Usuario;
import java.util.Scanner;

public class Menu {
    public static void main(String[] args) throws Exception {
        
        Usuario u = new Usuario();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nome: ");
        u.setNome(scanner.nextLine());
        System.out.print("Login: ");
        u.setLogin(scanner.nextLine());
        System.out.print("Senha:" );
        u.setSenha(scanner.nextLine());
        System.out.print("Email: ");
        u.setEmail(scanner.nextLine());

        new UsuarioDAO().cadastrarUsuario(u);
    }
}
