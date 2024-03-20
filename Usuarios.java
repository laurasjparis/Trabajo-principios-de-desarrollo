import java.util.ArrayList;
import java.util.List;

public class Usuarios {

    private List<Usuario> usuarios = new ArrayList<>();

    public void guardarUsuario(Usuario usuario){
        usuarios.add(usuario);
    }

    public Usuario buscarUsuario(String nombre){
        Usuario usuarioEncontrado = null;
        for (Usuario usuario : this.usuarios) {
            if (usuario.getNombre().equals(nombre)){
                usuarioEncontrado = usuario;
                break;
                }
            }
            return usuarioEncontrado;
        }
    }


