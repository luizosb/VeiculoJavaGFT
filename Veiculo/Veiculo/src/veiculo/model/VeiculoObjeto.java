package veiculo.model;

public class  VeiculoObjeto {

	private String Marca;
	private String Modelo;
	private String Placa;
	private String Cor;
	private Float Km;
	private Boolean isLigado;
	private Integer litrosCombustivel;
	private Integer Velocidade;
	private Double Preco;
	
	//Métodos personalizados
	
	public void estadoAtual() {
		System.out.println("---------------------------");
		System.out.println("Marca: " + this.getMarca());
		System.out.println("Modelo: " + this.getModelo());
		System.out.println("Placa: " + this.getPlaca());
		System.out.println("Cor: " + this.getCor());
		System.out.println("Kilometragem: " + this.getKm());
		System.out.println("Está ligado: " + this.getIsLigado());
		System.out.println("Combustivel: " + this.getLitrosCombustivel());
		System.out.println("Velocidade: " + this.getVelocidade());
		System.out.println("Preço: " + this.getPreco());
		
		
	}
	
	public void Acelerar(int v) {
		if (this.getIsLigado()==true) {
			this.setVelocidade(this.getVelocidade()+ v);
			this.setLitrosCombustivel(this.getLitrosCombustivel() - 1);
			System.out.println("O carro está agora a " + this.getVelocidade() + ", com "+ this.getLitrosCombustivel() +" Litros de gasolina.");
		} else {
			System.out.println("O carro está desligado, não é possivel acelerar.");
		}
	}
	
	public void Abastecer() {
		litrosCombustivel += this.getLitrosCombustivel();
		if (this.getLitrosCombustivel() > 100) {
			System.out.println("Não é possivel abastecer esta quantidade, apenas é possivel abastecer " + (this.getLitrosCombustivel() - 100) + " litros.");
		} else {
			System.out.println("Carro abastecido com sucesso.");
		}
	}
	
	public void Frear() {
		if (this.getIsLigado()==true) {
			this.setVelocidade(this.getVelocidade() - 10);
			System.out.println("A velocidade do carro foi para " + this.getVelocidade());
		} else {
			System.out.println("O carro está desligado, não é possivel freiar.");
		}
		
	}
	
	public void Pintar() {
		this.setCor(getCor());
		System.out.println("A cor agora do carro é " + this.getCor());
	}
	
	public void Ligar() {
		if (this.getVelocidade()>0) {
			this.setisLigado(true);
			System.out.println("O carro já está ligado.");
		} else {
			this.setisLigado(true);
			System.out.println("Agora o carro está ligado.");
		} 
	}
	
	public void Desligar() {
		if (this.getIsLigado()==true) {
			this.setisLigado(false);
			System.out.println("Agora o carro está desligado.");
		} else {
			System.out.println("O carro já está desligado.");
		}
	}
		
	//Metodos especiais
	
	public VeiculoObjeto(String Marca, String Modelo, String Placa, String Cor, Float Km, Boolean isLigado, Integer litrosCombustivel, Integer Velocidade, Double Preco) {

		this.setMarca(Marca);
		this.setModelo(Modelo);
		this.setPlaca(Placa);
		this.setCor(Cor);
		this.setKm(Km);
		this.setisLigado(isLigado);
		this.setLitrosCombustivel(litrosCombustivel);
		this.setVelocidade(Velocidade);
		this.setPreco(Preco);
					
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
	

 


		

	
