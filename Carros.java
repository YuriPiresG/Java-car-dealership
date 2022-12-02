import java.util.Scanner;
import java.util.ArrayList;

public class Carros {

	private String veiculo;
	private int numVeic;
	private String modelo;
	private int numMod;
	private ArrayList<String> adicionais = new ArrayList<String>();
	private int numAdc;
	private double precoVeic;
	private double precoTotal;
	private double precoAdd;
	private int escolhaAdd;
	Scanner sc = new Scanner(System.in);


	public void escolheVeiculo() {
		System.out.println("Choose the vehicle:\n1- Fusca\n2- Brasilia\n3- Opala");
		this.numVeic=sc.nextInt();
		switch(numVeic) {
		case 1:
			this.veiculo="Fusca";
			break;
		case 2:
			this.veiculo="Brasilia";
			break;
		case 3:
			this.veiculo="Opala";
			break;
		default:
			System.out.println("Invalid value, please try again.");

		}

	}

	public void escolheModelo() {
		System.out.println("Choose the vehicle type:\n1- Basic\n2- Sedan\n3- Sport\n4- Executive");
		this.numMod=sc.nextInt();
		switch(numMod) {
		case 1:
			this.modelo="Basic";
			break;
		case 2:
			this.modelo="Sedan";
			break;
		case 3:
			this.modelo="Sport";
			break;
		case 4:
			this.modelo="Executive";
			break;
		default:
			System.out.println("Invalid value, please try again");
			break;

		}

	}

	public void escolheAdicionais() {
		if (modelo=="Sedan") {
			adicionais.add("Eletric Trio");
			adicionais.add("AC");
		}
		if(modelo=="Sport" || modelo=="Executive") {
			adicionais.add("Eletric Trio");
			adicionais.add("AC");
			adicionais.add("Hydraulic steering");
			adicionais.add("Leather seats");
		}

		System.out.println("Do you wish to add more things?\n1- Yes\n2- No");
		this.escolhaAdd=sc.nextInt();
		if (escolhaAdd==1){
			if (modelo=="Sedan") {
				System.out.println("Select the options that you would like to add:\n1- Hydraulic steering\n2- Leather seats\n3- Multimidia");
				this.numAdc=sc.nextInt();
				switch(numAdc) {
				case 1:
					adicionais.add("Hydraulic steering");
					break;
				case 2:
					adicionais.add("Leather seats");
					break;
				case 3:
					adicionais.add("Multimidia");
					break;
				default:
					System.out.println("Invalid value");
					break;
				}
				System.out.println("Do you wish to add more things?\n1- Yes\n2- No");
				this.escolhaAdd=sc.nextInt();
				if (escolhaAdd==1) {
					System.out.println("Select the options that you would like to add:\n1- Hydraulic steering\n2- Leather seats\n3- Multimidia");
					this.numAdc=sc.nextInt();
					switch(numAdc) {
					case 1:
						if(adicionais.get(2)=="Hydraulic steering") {
							System.out.println("Erro: Hydraulic steering already added, please choose a different part.");
							System.exit(0);
							break;
						}
						adicionais.add("Hydraulic steering");
						break;
					case 2:
						if(adicionais.get(2)=="Bancos de Couro") {
							System.out.println("Erro: Leather seats already added, please choose a different part");
							System.exit(0);
							break;
						}
						adicionais.add("Leather seats");
						break;
					case 3:
						if(adicionais.get(2)=="Multimidia") {
							System.out.println("Erro: Multimidia already added, please choose a different part");
							System.exit(0);
							break;
						}
						adicionais.add("Multimidia");
						break;
					default:
						System.out.println("Invalid value.");
						break;
					}
				}
				else if(escolhaAdd==2) {
					return;
				}

			}
			if(modelo=="Sport" || modelo=="Executive") {
					System.out.println("Select the options that you would like to add:\n1- Multimidia");
					this.numAdc=sc.nextInt();
					switch(numAdc) {
					case 1:
						adicionais.add("Multimidia");
						break;
					default:
						System.out.println("Invalid Value.");
						break;
					}
				}
			else if(modelo=="Basic") {
					System.out.println("Select the options that you would like to add:\n1- Eletric Trio\n2- AC\n3- Hydraulic steering\n4- Leather seats\n5- Multimidia");
					this.numAdc=sc.nextInt();
					switch(numAdc) {
					case 1:
						adicionais.add("Eletric Trio");
						break;
					case 2:
						adicionais.add("AC");
						break;
					case 3:
						adicionais.add("Hydraulic steering");
						break;
					case 4:
						adicionais.add("Leather seats");
						break;
					case 5:
						adicionais.add("Multimidia");
						break;
					}
					System.out.println("Do you wish to add more things?\n1- Yes\n2- No");
					this.escolhaAdd=sc.nextInt();
					if (escolhaAdd==1) {
					System.out.println("Select the options that you would like to add:\n1- Eletric Trio\n2- AC\n3- Hydraulic steering\n4- Leather seats\n5- Multimidia");
					this.numAdc=sc.nextInt();
					switch(numAdc) {
					case 1:
						if(adicionais.get(0)=="Eletric Trio") {
							System.out.println("Erro: Eletric Trio already added, please choose a different part.");
							System.exit(0);
							break;
						}
						adicionais.add("Trio Elétrico");
						break;
					case 2:
						if(adicionais.get(0)=="AC") {
							System.out.println("Erro: AC already added, please choose a different part.");
							System.exit(0);
							break;
						}
						adicionais.add("AC");
						break;
					case 3:
						if(adicionais.get(0)=="Hydraulic steering") {
							System.out.println("Erro: Hydraulic steering already added, please choose a different part.");
							System.exit(0);
							break;
						}
						adicionais.add("Hydraulic steering");
						break;
					case 4:
						if(adicionais.get(0)=="Leather seats") {
							System.out.println("Erro: Leather seats already added, please choose a different part.");
							System.exit(0);
							break;
						}
						adicionais.add("Leather seats");
						break;
					case 5:
						if(adicionais.get(0)=="Multimidia") {
							System.out.println("Erro: Multimidia already added, please choose a different part.");
							System.exit(0);
							break;
						}
						adicionais.add("Multimidia");
						break;
					}
				}
			}
				else {
					return;
				}
			}
		else if(escolhaAdd==2) {
			System.out.println("No additional parts added.");
		}



	}

	public void calculaPreco() {
		if(veiculo=="Fusca"&& modelo=="Basic") {
			this.precoVeic=20000;
		}
		if(veiculo=="Fusca"&& modelo=="Sedan") {
			this.precoVeic=27000;
		}
		if(veiculo=="Fusca"&& modelo=="Sport") {
			this.precoVeic=28500;
		}
		if(veiculo=="Fusca"&& modelo=="Executive") {
			this.precoVeic=32000;
		}

		if(veiculo=="Brasilia"&& modelo=="Basic") {
			this.precoVeic=20700;
		}
		if(veiculo=="Brasilia"&& modelo=="Sedan") {
			this.precoVeic=27900;
		}
		if(veiculo=="Brasilia"&& modelo=="Sport") {
			this.precoVeic=30500;
		}
		if(veiculo=="Brasilia"&& modelo=="Executive") {
			this.precoVeic=35000;
		}

		if(veiculo=="Opala"&& modelo=="Basic") {
			this.precoVeic=25000;
		}
		if(veiculo=="Opala"&& modelo=="Sedan") {
			this.precoVeic=29200;
		}
		if(veiculo=="Opala"&& modelo=="Sport") {
			this.precoVeic=31500;
		}
		if(veiculo=="Opala"&& modelo=="Executive") {
			this.precoVeic=37000;
		}

		for(int i=0;i<adicionais.size();i++) {
			if(modelo=="Basic") {
				if (adicionais.get(i)=="Trio Elétrico") {
					this.precoAdd+=900;
				}
				if (adicionais.get(i)=="Ar Condicionado") {
					this.precoAdd+=1200;
				}
				if (adicionais.get(i)=="Direção Hidráulica") {
					this.precoAdd+=1350;
				}
				if (adicionais.get(i)=="Bancos de Couro") {
					this.precoAdd+=1850;
				}
				if (adicionais.get(i)=="Multimidia") {
					this.precoAdd+=3200;
				}
			}
			if(modelo=="Sedan") {
				if (adicionais.get(i)=="Direção Hidráulica") {
					this.precoAdd+=1350;
				}
				if (adicionais.get(i)=="Bancos de Couro") {
					this.precoAdd+=1850;
				}
				if (adicionais.get(i)=="Multimidia") {
					this.precoAdd+=3200;
				}
			}

			if(modelo=="Sport"||modelo=="Executive") {
				if (adicionais.get(i)=="Multimidia") {
					this.precoAdd+=3200;
				}
			}
		}
		this.precoTotal=precoVeic+precoAdd;
		System.out.println("Veículo: "+veiculo+"\nModelo: "+modelo+"\nAdicionais: "+adicionais+"\n Preço final: "+precoTotal);
	}


	public void espacamento() {
		System.out.println("---------------------------------------------------------------------------------------------------");
	}
}