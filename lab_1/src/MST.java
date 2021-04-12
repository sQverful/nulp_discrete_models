import javafx.util.Pair;

import java.util.ArrayList;
import java.util.List;

public class MST {


    public static void main(String[] args) {


        Prim prim = new Prim(createGraph());
        System.out.println(prim.originalGraphToString());
        prim.run();
        prim.resetPrintHistory();
        System.out.println(prim.minimumSpanningTreeToString());

    }

    public static List<Vertex> createGraph() {
        List<Vertex> graph = new ArrayList<>();
        Vertex a = new Vertex("A");
        Vertex b = new Vertex("B");
        Vertex c = new Vertex("C");
        Vertex d = new Vertex("D");
        Vertex e = new Vertex("E");
        Vertex f = new Vertex("F");
        Vertex g = new Vertex("G");
        Vertex h = new Vertex("H");

        Edge ac = new Edge(7);
        Edge ag = new Edge(46);
        Edge ah = new Edge(98);
        Edge bf = new Edge(99);
        Edge bc = new Edge(33);
        Edge cb = new Edge(33);
        Edge ch = new Edge(64);
        Edge cf = new Edge(28);
        Edge ce = new Edge(92);
        Edge cd = new Edge(99);
        Edge de = new Edge(15);
        Edge dc = new Edge(99);
        Edge df = new Edge(92);
        Edge eh = new Edge(58);
        Edge ec = new Edge(92);
        Edge ed = new Edge(15);
        Edge fd = new Edge(52);
        Edge fc = new Edge(28);
        Edge fb = new Edge(99);
        Edge gh = new Edge(36);
        Edge ga = new Edge(46);
        Edge ha = new Edge(46);
        Edge hc = new Edge(64);
        Edge he = new Edge(58);
        Edge hg = new Edge(36);

        a.addEdge(c, ac);
        a.addEdge(g, ag);
        a.addEdge(h, ah);
        b.addEdge(f, bf);
        b.addEdge(c, bc);
        c.addEdge(h, ch);
        c.addEdge(c, cb);
        c.addEdge(f, cf);
        c.addEdge(e, ce);
        c.addEdge(d, cd);
        d.addEdge(e, de);
        d.addEdge(d, dc);
        d.addEdge(f, df);
        e.addEdge(h, eh);
        e.addEdge(c, ec);
        e.addEdge(d, ed);
        f.addEdge(d, fd);
        f.addEdge(c, fc);
        f.addEdge(b, fb);
        g.addEdge(h, gh);
        g.addEdge(a, ga);
        h.addEdge(h, ha);
        h.addEdge(c, hc);
        h.addEdge(e, he);
        h.addEdge(g, hg);

        graph.add(a);
        graph.add(b);
        graph.add(c);
        graph.add(d);
        graph.add(e);
        graph.add(f);
        graph.add(g);
        graph.add(h);


        return graph;
    }
}
