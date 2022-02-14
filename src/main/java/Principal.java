import org.apache.commons.lang3.StringUtils;

public class Principal {
    public static void main(String[] args) {
        String nombre = "webinar 3 - maven";
        System.out.println(nombre);
        nombre = StringUtils.capitalize(nombre);
        System.out.println(nombre);
    }

}
