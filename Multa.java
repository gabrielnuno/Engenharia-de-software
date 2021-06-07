package com.biblioteca.model;

import java.sql.Date;
import java.util.ArrayList;



public class Multa {
	
	public double valor;
	public Cliente cliente;
	public Transferencia transferencia;
	public Date dataVencimento;
	public ArrayList<Transferencia> transferencias;
        
	   public Multa(double valor, Cliente cliente, Transferencia transferencia, Date dataVencimento, ArrayList<Transferencia> transferencias) {
        this.valor = valor;
        this.cliente = cliente;
        this.transferencia = transferencia;
        this.dataVencimento = dataVencimento;
        this.transferencias = transferencias;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Transferencia getTransferencia() {
        return transferencia;
    }

    public void setTransferencia(Transferencia transferencia) {
        this.transferencia = transferencia;
    }

    public Date getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(Date dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    public ArrayList<Transferencia> getTransferencias() {
        return transferencias;
    }

    public void setTransferencias(ArrayList<Transferencia> transferencias) {
        this.transferencias = transferencias;
    }
}
