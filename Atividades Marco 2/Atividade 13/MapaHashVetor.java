public class MapaHashVetor {
    private Aluno[] vetor;
    private int size;

    public MapaHashVetor(int size) {
        this.vetor = new Aluno[size];
        this.size = 0;
    }
    private int hash(int chave) {
        return chave % this.vetor.length;
    }
    public void put(int chave, Aluno valor) {
        int sondagem = 0;
        int hash;
        resize();
        while (sondagem < vetor.length) {
            hash = (hash(chave) + sondagem) % vetor.length;
            if (vetor[hash] == null || vetor[hash].getMatricula() == chave) {
                vetor[hash] = valor;
                this.size++;
                return;
            }
            sondagem++;
        }
    }
    private boolean isFull() {
        return size == vetor.length;
    }
    private boolean isEmpty() {
        return vetor.length == 0;
    }
    public int size() {
        return this.size;
    }
    private void fill(Aluno[] aux) {
        for (int i = 0; i < aux.length; i++) {
            aux[i] = null;
        }
    }
    private void resize() {
        if (isFull()) {
            Aluno[] novoVetor = new Aluno[this.vetor.length * 2];
            this.size = 0;

            for (int i = 0; i < vetor.length; i++) {
                novoVetor[i] = vetor[i];
            }
            fill(vetor);
            rehash(novoVetor);
            this.vetor = novoVetor;
        }
    }
    private void rehash(Aluno[] rehash) {
        for (int i = 0; i < rehash.length; i++) {
            if (rehash[i] != null) {
                Aluno obj = rehash[i];
                put(obj.getMatricula(), obj);
            }
        }
    }
}
