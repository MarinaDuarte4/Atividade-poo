public class Pessoa {
    /**
     * Pessoa
     */
    
        private String nome;
        public Pessoa(String nome) {
        this.nome = nome;
    }
        private int idade;
        private String endereço;

        public String getNome() {
            return nome;
        }
        public void setNome(String nome) {
            this.nome = nome;
        }
        public int getIdade() {
            return idade;
        }
        public void setIdade(int idade) {
            this.idade = idade;
        }
        public String getEndereço() {
            return endereço;
        }
        public void setEndereço(String endereço) {
            this.endereço = endereço;
        }

        
    }
