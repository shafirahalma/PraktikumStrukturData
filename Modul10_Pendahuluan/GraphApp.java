/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul10_Pendahuluan;

/**
 *
 * @author shafira halmahera
 */
public class GraphApp {

    public static void main(String[] args) {

        Graph g = new Graph();
        g.addVertex('A'); // 0
        g.addVertex('B'); // 1
        g.addVertex('C'); // 2
        g.addVertex('D'); // 3
        g.addVertex('E'); // 4

        g.addEdge(0, 1); // AB
        g.addEdge(1, 2); // BC
        g.addEdge(0, 3); // AD        
        g.addEdge(3, 4); // DE
        
//      g.display();
//        System.out.println("=============================");

//      g.dfs();
//        System.out.println("=============================");

//      g.bfs();

        g.mst();
    }

}
