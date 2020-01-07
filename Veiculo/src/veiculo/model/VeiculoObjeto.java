package veiculo.model;

public class VeiculoObjeto {

	private String Marca;
	private String Modelo;
	private String Placa;
	private String Cor;
	private Float Km;
	private Boolean isLigado;
	private Integer litrosCombustivel;
	private Integer Velocidade;
	private Double Preco;
	
	public VeiculoObjeto(String Marca, String Modelo, String Placa, String Cor, Float Km, Boolean isLigado, Integer litrosCombustivel, Integer Velocidade, Double Preco) {
		
		this.Marca = Marca;
		this.Modelo = Modelo;
		this.Placa = Placa;
		this.Cor = Cor;
		this.Km = Km;
		this.isLigado = isLigado;
		this.litrosCombustivel = litrosCombustivel;
		this.Velocidade = Velocidade;
		this.Preco = Preco;
					
	}
	
		
	public String getMarca() {
		return Marca;
	}
	public void setMarca(String Marca) {
		this.Marca = Marca;
	}
	
	public String getModelo() {
		return Modelo;
	}
	public void setModelo(String modelo) {
		Modelo = modelo;
	}
	
	public String getPlaca() {
		return Placa;
	}
	public void setPlaca(String placa) {
		Placa = placa;
	}
	
	public String getCor() {
		return Cor;
	}
	public void setCor(String cor) {
		Cor = cor;
	}
	
	public Float getKm() {
		return Km;
	}
	public void setKm(Float km) {
		Km = km;
	}
	
	public Boolean getIsLigado() {
		return isLigado;
	}
	public void setisLigado(Boolean isLigado) {
		this.isLigado = isLigado;
	}
	
	public Integer getLitrosCombustivel() {
		return litrosCombustivel;
	}
	public void setLitrosCombustivel(Integer litrosCombustivel) {
		this.litrosCombustivel = litrosCombustivel;
	}
	
	public Integer getVelocidade() {
		return Velocidade;
	}
	public void setVelocidade(Integer velocidade) {
		Velocidade = velocidade;
	}
	
	public Double getPreco() {
		return Preco;
	}
	public void setPreco(Double preco) {
		Preco = preco;
	}
	

}

		

	
