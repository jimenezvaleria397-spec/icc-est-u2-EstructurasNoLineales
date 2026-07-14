package structures.graphs;

public interface PathFinder <T> {

    //Interface
    // - Define los metodos que debe tener otra clase si o si 
    // -No se puede instanciar 

    PathResult<T> find(Graph<T> graph, T start, T end );
    
    
}
