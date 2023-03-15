/**
     * @autor Pablo Zubiela
     * @version 1.0 marzo 2023
     */
package Cuentas;
/**
 * Clase para representar una cuenta bancaria.
 */
public class CCuenta {

	 /**
     * Nombre del titular de la cuenta.
     */
    private String nombre;
    
    /**
     * Número de cuenta.
     */
    private String cuenta;
    
    /**
     * Saldo de la cuenta.
     */
    private double saldo;
    
    /**
     * Tipo de interés de la cuenta.
     */
    private double tipoInterés;

    /**
     * atrib de la cuenta.
     */
    public CCuenta()
    {
    	
    }
    
    /**
     * inicializa todos los atributos de la cuenta.
     * @param nombre El nombre del titular de la cuenta.
     * @param cuenta El número de cuenta.
     * @param saldo El saldo actual de la cuenta.
     * @param tipoInteres El tipo de interés de la cuenta.
     */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        setNombre(nom);
        setCuenta(cue);
        setSaldo(sal);
    }
    /**
     * Devuelve el saldo actual de la cuenta
     */
    public double estado()
    {
        return getSaldo();
    }

    /**
     * Ingresa una cantidad en la cuenta.
     * @param cantidad La cantidad a ingresar.
     * @throws Exception Si la cantidad es negativa.
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }

    /**
     * Retira una cantidad de la cuenta.
     * @param cantidad La cantidad a retirar.
     * @throws Exception Si la cantidad es negativa o si no hay suficiente saldo en la cuenta.
     */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }

	private String getNombre() {
		return nombre;
	}

	private void setNombre(String nombre) {
		this.nombre = nombre;
	}

	private String getCuenta() {
		return cuenta;
	}

	private void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}

	private double getSaldo() {
		return saldo;
	}

	private void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	private double getTipoInterés() {
		return tipoInterés;
	}

	private void setTipoInterés(double tipoInterés) {
		this.tipoInterés = tipoInterés;
	}
}
