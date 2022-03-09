package graph

fun main() {
    val graph = Graph()

    graph.add_vertex(1)
    graph.add_vertex(2)
    graph.add_vertex(3)
    graph.add_vertex(4)
    graph.add_vertex(5)
    graph.add_vertex(6)

    graph.add_edge(1, 2)
    graph.add_edge(1, 5)

    graph.add_edge(2, 1)
    graph.add_edge(2, 3)
    graph.add_edge(2, 5)

    graph.add_edge(3, 2)
    graph.add_edge(3, 4)

    graph.add_edge(4, 3)
    graph.add_edge(4, 5)
    graph.add_edge(4, 6)

    graph.add_edge(5, 1)
    graph.add_edge(5, 2)
    graph.add_edge(5, 4)

    graph.add_edge(6, 4)

    print("neighbors fo 1: ")
    graph.neighbors(1).print()

    print("neighbors fo 2: ")
    graph.neighbors(2).print()

    print("neighbors fo 3: ")
    graph.neighbors(3).print()

    print("neighbors fo 4: ")
    graph.neighbors(4).print()

    print("neighbors fo 5: ")
    graph.neighbors(5).print()

    print("neighbors fo 6: ")
    graph.neighbors(6).print()    
}
