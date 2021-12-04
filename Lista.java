public class Lista{

    private Object[] elementos;
    private int tamanho;
    private boolean somenteLeitura;

    public Lista(int tamanho, boolean somenteLeitura) {
        this.elementos = new Object[tamanho];
        this.somenteLeitura = somenteLeitura;
    }

    public void add(Object elemento){

        if(!somenteLeitura){
            tamanho+=1;
            if(tamanho > elementos.length){
                Object[] newElementos = new Object[elementos.length + 10];

                for(int i = 0; i < tamanho; i++){
                    newElementos[i] = elementos;



                }

                elementos[tamanho++] = elemento;

            }
        }

    }
}



