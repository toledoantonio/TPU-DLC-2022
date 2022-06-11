package dlc.tpu.buscador.clases;

import dlc.tpu.buscador.soporte.Heap;

public class PosteosXPalabra implements Comparable<PosteosXPalabra> {

    private Palabra palabra;

    //necesito que esta coleccion este ordenada por el tf
    // es un heap descendente de mayor a menor posteo
    private Heap<DocumentoXPalabra> posteos;

    public PosteosXPalabra(Palabra palabra) {
        this.palabra = palabra;
        this.posteos = new Heap<>(false);
    }

    public Palabra getPalabra() {
        return palabra;
    }

    public DocumentoXPalabra getUnPosteo(){
        return posteos.get();
    }

    public Heap<DocumentoXPalabra> getPosteos() {
        return posteos;
    }

    public int getTamañoLista(){
        return posteos.size();
    }

    //compara segun el tamaño de la lista
    @Override
    public int compareTo(PosteosXPalabra o) {
        return this.getTamañoLista() - o.getTamañoLista();
    }

    public void agregarPosteo(DocumentoXPalabra documentoXPalabra){
        posteos.add(documentoXPalabra);
    }
}
