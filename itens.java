public class itens {

        private String nome;
        private String tipo;
        private double valor;

        public itens(String nome, String tipo, double valor) {
            this.nome = nome;
            this.tipo = tipo;
            this.valor = valor;
        }


        public String getNome() {
            return nome;
        }


        public void setNome(String nome) {
            this.nome = nome;
        }


        public String getTipo() {
            return tipo;
        }


        public void setTipo(String tipo) {
            this.tipo = tipo;
        }


        public double getValor() {
            return valor;
        }


        public void setValor(double valor) {
            this.valor = valor;
        }
}
    
        