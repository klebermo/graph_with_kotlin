package graph

class Graph(var vertexList: List<Vertex> = List<Vertex>()) {
    fun adjacent(x: Int, y: Int): Boolean {
        val vx = get_vertex(x)
        val vy = get_vertex(y)

        val max = vx?.edgeList?.size() ?: 0
        if(max > 0) {
            for (i in 1..max) {
                val e = vx?.edgeList?.get(i)
                if(e?.destination == vy) {
                    return true
                }
            }
        }
        return false
    }

    fun neighbors(x: Int): List<Int> {
        val list = List<Int>()

        val vx = get_vertex(x)
        val max = vx?.edgeList?.size() ?: 0
        if(max > 0) {
            for (i in 1..max) {
                val e = vx?.edgeList?.get(i)
                list.insert(e?.destination?.data ?: 0)
            }
        }
        return list
    }

    fun add_vertex(x: Int) {
        val vx = Vertex(x)
        vertexList.insert(vx)
    }

    fun remove_vertex(x: Int) {
        val vx = get_vertex(x)

        val max = vertexList.size()
        if (max > 0) {
            for (i in 1..max) {
                val v = vertexList.get(i)
                if (v == vx) {
                    vertexList.delete(i)
                    break
                }
            }
        }

        if (max > 0) {
            for (i in 1..max) {
                val v = vertexList.get(i)
                val max2 = v?.edgeList?.size() ?: 0
                if (max2 > 0) {
                    for (j in 1..max2) {
                        val e = v?.edgeList?.get(j)
                        if(e?.destination == vx) {
                            v?.edgeList?.delete(j)
                            break
                        }
                    }
                }
            }
        }
    }

    fun add_edge(x: Int, y: Int) {
        val vx = get_vertex(x)
        val vy = get_vertex(y)

        val e = Edge(0, vy)
        vx?.edgeList?.insert(e)
    }

    fun remove_edge(x: Int, y: Int) {
        val vx = get_vertex(x)
        val vy = get_vertex(y)

        var max = vx?.edgeList?.size() ?: 0
        if(max > 0) {
            for(i in 1..max) {
                val e = vx?.edgeList?.get(i)
                if (e?.destination == vy) {
                    vx?.edgeList?.delete(i)
                    break
                }
            }
        }

        max = vy?.edgeList?.size() ?: 0
        if(max > 0) {
            for(i in 1..max) {
                val e = vy?.edgeList?.get(i)
                if(e?.destination == vx) {
                    vy?.edgeList?.delete(i)
                    break
                }
            }
        }
    }

    fun get_vertex_value(x: Int): Int {
        val vx = get_vertex(x)
        return vx?.data ?: 0
    }

    fun set_vertex_value(x: Int, v: Int) {
        val vx = get_vertex(x)
        vx?. data = v
    }

    fun get_edge_value(x: Int, y: Int): Int {
        val vx = get_vertex(x)
        val vy = get_vertex(y)

        val max = vx?.edgeList?.size() ?: 0
        if(max > 0) {
            for (i in 1..max) {
                val e = vx?.edgeList?.get(i)
                if(e?.destination == vy) {
                    return e?.data ?: 0
                }
            }
        }
        return 0
    }

    fun set_edge_value(x: Int, y: Int, v: Int) {
        val vx = get_vertex(x)
        val vy = get_vertex(y)

        val max = vx?.edgeList?.size() ?: 0
        if(max > 0) {
            for (i in 1..max) {
                val e = vx?.edgeList?.get(i)
                if(e?.destination == vy) {
                    e?.data = v
                    break
                }
            }
        }
    }

    fun get_vertex(x: Int): Vertex? {
        val max = vertexList.size()
        for (i in 1..max) {
            val v = vertexList.get(i)
            if(v?.data == x) {
                return v
            }
        }
        return null
    }

    fun get_edge(x: Int, y: Int): Edge? {
        val vx = get_vertex(x)
        val vy = get_vertex(y)

        val max = vx?.edgeList?.size() ?: 0
        if(max > 0) {
            for (i in 1..max) {
                val e = vx?.edgeList?.get(i)
                if(e?.destination == vy) {
                    return e
                }
            }
        }
        return null
    }

    fun search(x: Int, y: Int): List<Edge> {
        val vx = get_vertex(x)
        val vy = get_vertex(y)
        
        val list = List<Edge>()
        return list
    }
}
