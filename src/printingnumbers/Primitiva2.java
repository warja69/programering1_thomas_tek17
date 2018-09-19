package printingnumbers;

public class Primitiva2 {

	public static void main(String[] args) {
	double value = 15.56;
	double fractionpart = value % 1;
    double intergralpart = value - fractionpart;
    System.out.print("\nOrginal value: "+value);
    System.out.print("\nIntergral part: "+intergralpart);
    System.out.print("\nFractional part: "+fractionpart);
    System.out.println();
	}

}
