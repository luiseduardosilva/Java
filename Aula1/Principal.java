
public class Principal 
{

	public static void main(String[] args)
	{
		ObjCarro carro = new ObjCarro();
		carro.setMotor("Motor escroto");
		System.out.printf("Motor: %s", carro.getMotor());
	}
}
