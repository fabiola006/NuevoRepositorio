package seguridad;

public class Validacion {
    public String validaUsuario(String usuario){
        String msg = "";
        msg = "esta correcto el usuario "
                + "seleccionado, no olvide cambiar "
                + "su contrasena en menos "
                + "de 90 dias";;
        return msg;
    }
}
