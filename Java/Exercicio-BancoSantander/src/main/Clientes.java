package main;

public class Clientes {
	
	private Integer numeroCliente;
	private String sobrenomeCliente;
	private String rgCliente;
	private String cpfCliente;
	private Contas conta;
	
	public Clientes(){
		
	}
	
	public Clientes(Integer numeroCliente,String sobrenomeCliente,String rgCliente, String cpfCliente, Contas conta) {
		this.numeroCliente = numeroCliente;
		this.sobrenomeCliente = sobrenomeCliente;
		this.rgCliente = rgCliente;
		this.cpfCliente = cpfCliente;
		this.conta = conta;
	}
	
	public Integer getNumeroCliente() {
		return numeroCliente;
	}
	public void setNumeroCliente(Integer numeroCliente) {
		this.numeroCliente = numeroCliente;
	}
	public String getSobrenomeCliente() {
		return sobrenomeCliente;
	}
	public void setSobrenomeCliente(String sobrenomeCliente) {
		this.sobrenomeCliente = sobrenomeCliente;
	}
	public String getRgCliente() {
		return rgCliente;
	}
	public void setRgCliente(String rgCliente) {
		this.rgCliente = rgCliente;
	}
	public String getCpfCliente() {
		return cpfCliente;
	}
	public void setCpfCliente(String cpfCliente) {
		this.cpfCliente = cpfCliente;
	}
	


	@Override
	public String toString() {
		return "Clientes [numeroCliente=" + numeroCliente + ", sobrenomeCliente=" + sobrenomeCliente + ", rgCliente="
				+ rgCliente + ", cpfCliente=" + cpfCliente + "]";
	}
	
	
	

}
