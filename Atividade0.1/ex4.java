import java.util.Scanner;

    public class ex4{
        public static void main(String[] args){
            Livro lv = new Livro();
            Scanner sc = new Scanner(System.in);
            
            System.out.println("Qual o titulo do livro?: ");
            String tituloDigi = sc.nextLine();
            lv.setTitulo(tituloDigi);
            System.out.println("Qual o autor do livro?: ");
            String autorDigi = sc.nextLine();
            lv.setAutor(autorDigi);
            System.out.println("Quantas páginas tem esse livro?: ");
            int paginasDigi = sc.nextInt();
            lv.setPaginas(paginasDigi);

            System.out.println("O livro: " + lv.getTitulo() + " do autor: " + lv.getAutor() + " possui: " + lv.getPagina() + " pagina(s)");

            sc.close();
        }
    }
    class Livro{
        private String titulo;
        private String autor;
        private int paginas;

        public Livro(){
        }
        public Livro(String titulo, String autor, int paginas){
            this.titulo = titulo;
            this.autor = autor;
            this.paginas = paginas;
        }
        public String getTitulo(){
            return titulo;
        }
        public String getAutor(){
            return autor;
        }
        public int getPagina(){
            return paginas;
        }
        public void setTitulo(String tituloDigi){
            this.titulo = tituloDigi;
        }
        public void setAutor(String autorDigi){
            this.autor = autorDigi;
        }
        public void setPaginas(int paginasDigi){
            this.paginas = paginasDigi;
        }
    }