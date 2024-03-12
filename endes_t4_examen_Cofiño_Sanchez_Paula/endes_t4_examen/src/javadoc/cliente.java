package javadoc;

import java.util.ArrayList;
import java.util.List;

public class Cliente { //creamos la clase cliente para dentro poder crear nuestras variables de tipo string en este caso
    private String nombre; // creamos la variable de tipo string = en ella se permiten caracteres de tipo letras (nombre "del cliente")
    private String apellido; // creamos la variable de tipo string = en ella se permiten caracteres de tipo letras (apellido "del cliente")
    private String id; // creamos la variable de tipo string = en ella se permiten caracteres de tipo letras (id "del cliente")
    private List<CuentaBancaria> cuentas;

    public Cliente(String nombre, String apellido, String id) { // inicializamos el tipo de variable que vamos a usar
        this.nombre = nombre; // this.nombre = nombre se refiere a que el nombre que insertemos en la main se añadirá automaticamente
        this.apellido = apellido; // this.apellido = apellido se refiere a que el apellido que insertemos en la main se añadirá automaticamente
        this.id = id; // this.id = id se refiere a que el id que insertemos en la main se añadirá automaticamente
        this.cuentas = new ArrayList<>(); // creamos una nueva lista de arrays para cuentas
    }
        // Getter y Setters (devolver y guardar)

    public String getNombre() {
        return nombre;
    } // getnombre (obtener el nombre insertado en main) return nombre (se devuelve)

    public void setNombre(String nombre) {
        this.nombre = nombre;
    } // setnombre (establecemos el nombre insertado anteriormente this.nombre)

    public String getApellido() {
        return apellido;
    } // getapellido (obtener el apellido insertado en main) return apellido (se devuelve)

    public void setApellido(String apellido) {
        this.apellido = apellido;
    } // apellido (establecemos el apellido insertado anteriormente this.apellido)

    public String getId() {
        return id;
    } // getid (obtener el id insertado en main) return id (se devuelve)

    public void setId(String id) {
        this.id = id;
    } // setid (establecemos el id insertado anteriormente this.id)

    public List<CuentaBancaria> getCuentas() {
        return new ArrayList<>(cuentas);
    } // getcuentas (obtener las cuentas insertadas en main) return cuentas (se devuelve)

    public void agregarCuenta(CuentaBancaria cuenta) {
        cuentas.add(cuenta);
    }
    // void= no devolver, creamos un metodo agragarCuenta en el que usamos Cuentabancaria la clase, para enlazar y agragar las cuentas que se vayan insertando

    public boolean cerrarCuenta(String numeroCuenta) { // variable de tipo boolean (true o false, con el metodo de cerrarcuenta)
        return cuentas.removeIf(cuenta -> cuenta.getNumeroCuenta().equals(numeroCuenta));
        // condicion del metodo de que devolvera cuenta cuando se obtenga y sea igual a otra que ya ha sido insertada)
    }

    @Override
    public String toString() { // usamos un public string o mejor dicho un ToString para en una sola frase generar todos los datos (devolverlos)
        return "Cliente{" + // devuelve el cliente
                "nombre='" + nombre + '\'' + // devuelve el nombre
                ", apellido='" + apellido + '\'' + // devuelve apellido
                ", id='" + id + '\'' + // devuelve id
                ", cuentas=" + cuentas + //devuelve cuentas
                '}';
    }
}