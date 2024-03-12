package org.example;

public class CuentaBancaria { /**Creamos la clase cuentabancaria*/
    private String numeroCuenta; /** En ella creamos sus variables, en este caso de tipo string llamada numero cuenta*/
    private double saldo; /**Creamos otra variable de tipo double (numerica que permita decimales) llamada saldo*/
    private Cliente propietario; /**Creamos el objeto cliente con su variable propietario*/

    public CuentaBancaria(String numeroCuenta, double saldo, Cliente propietario) { /**para cuentabancaria iniciamos sus parametros*/
        this.numeroCuenta = numeroCuenta; /**numero de cuenta sera igual que el insertado en la main*/
        this.saldo = saldo; /** saldo sera igual que el insertado en la main*/
        this.propietario = propietario; /** propietario sera igual que el insertado en la main*/
    }
    /**Realizamos los getters y setters para cada parametro de la clase*/
    public String getNumeroCuenta() {
        return numeroCuenta; /**nos permite devolver el numero de cuenta con el return*/
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public double getSaldo() {
        return saldo; /**nos permite devolver el saldo de cuenta con el return*/
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Cliente getPropietario() {
        return propietario; /**nos permite devolver el propietario de cuenta con el return*/
    }

    public void setPropietario(Cliente propietario) {
        this.propietario = propietario;
    }

    public void depositar(double cantidad) { /**creamos el metodo depositar*/
        saldo += cantidad; /**establecemos su condicion para que se cumpla== saldo += cantidad se cumplira mientras que
         el saldo a depositar sea mayor que la cantidad deseada*/
    }

    public boolean retirar(double cantidad) { /**creamos el metodo retirar*/
        if (cantidad <= saldo) { /**establecemos la condicion para que se cumpla == saldo-= cantidad, en el que el saldo debe ser menor a la cantidad que queremos depositar*/
            saldo -= cantidad;
            return true; /**como es un tipo de boolean el metodo solo puede ser true o false, eso quiere decir que si es verdadero el metodo se cumplira*/
        }
        return false; /**sino se cumple, es false*/
    }

    @Override
    public String toString() { /**realizamos un toString para poder en una frase devolver todos los valores*/
        return "CuentaBancaria{" +
                "numeroCuenta='" + numeroCuenta + '\'' +
                ", saldo=" + saldo +
                ", propietario=" + propietario.getNombre() + " " + propietario.getApellido() +
                '}';
    }
}