package veiculo.main;

import veiculo.model.VeiculoObjeto;

public class Veiculo {

	public static void main(String[] args) {
		
		VeiculoObjeto veiculo = new VeiculoObjeto(null, null, null, null, null, null, null, null, null);
	
	veiculo.setMarca("Honda");
	veiculo.setModelo("NSX");
	veiculo.setPlaca("ABC-1234");
	veiculo.setCor("Vermelho");
	veiculo.setKm((float) 0.0000);
	veiculo.setisLigado(false);
	veiculo.setLitrosCombustivel(0);
	veiculo.setVelocidade(15);
	veiculo.setPreco(0.0);	
	
	Printa(veiculo);
	
	veiculo.setVelocidade(Freia(veiculo.getVelocidade()));
	
	if (veiculo.getIsLigado() == true ) {
	
	
	}
	
	Printa(veiculo);


		}

	public static void Printa(VeiculoObjeto v) {
		
		
		System.out.println(v.getMarca());
		System.out.println(v.getModelo());
		System.out.println(v.getPlaca());
		System.out.println(v.getCor());
		System.out.println(v.getKm());
		System.out.println(v.getIsLigado());
		System.out.println(v.getLitrosCombustivel());
		System.out.println(v.getVelocidade());
		System.out.println(v.getPreco());
		
			
		
	}
	
	public static int Freia(int Vel) {
		
		if (Vel > 0 ) {
			Vel -= 10;
			return Vel;
		}
		return 0;
	}
	
	}
	
	
	
	
	
	
	
}
