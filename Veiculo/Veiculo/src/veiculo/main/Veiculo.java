package veiculo.main;

//import java.util.Scanner;

import veiculo.model.VeiculoObjeto;

public class Veiculo {
	public static void main(String[] args) {
		VeiculoObjeto v = new VeiculoObjeto(null, null, null, null, null, null, null, null, null);
		v.setMarca("Honda");	
		v.setModelo("NSX");
		v.setPlaca("ABC-1234");
		v.setCor("Vermelho");
		v.setKm((float) 0.0000);
		v.setisLigado(false);
		v.setLitrosCombustivel(0);
		v.setVelocidade(15);
		v.setPreco(0.0);	
		
		
		
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*public static void main(String[] args) {
	
	VeiculoObjeto veiculo = new VeiculoObjeto(null,null,null, null, null, null, null, null, null);	
	
	//Scanner dados = new Scanner(System.in);	
	//System.out.println("Digite uma marca: ");
	
	//String marca = dados.toString();
		
	
	veiculo.setMarca("Honda");	
	veiculo.setModelo("NSX");
	veiculo.setPlaca("ABC-1234");
	veiculo.setCor("Vermelho");
	veiculo.setKm((float) 0.0000);
	veiculo.setisLigado(false);
	veiculo.setLitrosCombustivel(0);
	veiculo.setVelocidade(15);
	veiculo.setPreco(0.0);	
	
	//Printa(veiculo);
	
	veiculo.setVelocidade(Freia(veiculo.getVelocidade()));
	
	if (veiculo.getIsLigado() == true ) {
		
	
	}
	
	//Printa(veiculo);


		}

	public static void Printa(VeiculoObjeto v) {
		
		
		System.out.println("O carro é da marca " +  v.getMarca());
		System.out.println("O modelo do carro é " + v.getModelo());
		System.out.println("A placa é " + v.getPlaca());
		System.out.println("A cor é " + v.getCor());
		System.out.println("Quilometros rodados: " + v.getKm());
		System.out.println("Está " + v.getIsLigado());
		System.out.println("Com " + v.getLitrosCombustivel() + " litros de combustivel.");
		System.out.println("Com a velocidade de " +v.getVelocidade() + "por hora.");
		System.out.println("O preço do carro é de " +v.getPreco());
		
			
		
	}
	
	public static int Freia(int Vel) {
		
		if (Vel > 0 ) {
			Vel -= 10;
			return Vel;
		}
		return 0;
	}
	*/

}
	
	
	
	
	
	

