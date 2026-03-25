public class ex9{
    public static void main(String[] args){
        double fahrenheit = ConversorDeUnidades.celsiusParaFahrenheit(25);
        System.out.println("25°C em Fahrenheit é: " + fahrenheit + "°F");
        double milhas = ConversorDeUnidades.kmParaMilhas(100);
        System.out.println("100km em milhas é: " + milhas);
    }
}
class ConversorDeUnidades{
    public static double celsiusParaFahrenheit(double celsius){
        return (celsius * 1.8) + 32;
    }
    public static double kmParaMilhas(double km){
        return km * 0.621371;
    }
}