/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul10_Praktikum;

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

        g.addEdge(0, 2); // AB
        g.addEdge(1, 0); // BA
        g.addEdge(1, 4); // BE
        g.addEdge(3, 4); // DE
        g.addEdge(4, 2); // DC

        System.out.println("Praktikum Nomor 1");
        g.display();
        
        System.out.println("Praktikum Nomor 2");
        g.dfs();

        //no 3 topologi sorting
        System.out.println(" ");
        Graph g2 = new Graph();
        g2.addVertex('A'); //0
        g2.addVertex('B'); //1
        g2.addVertex('C'); //2
        g2.addVertex('D'); //3
        g2.addVertex('E'); //4
        g2.addVertex('F'); //5
        g2.addVertex('G'); //6
        g2.addVertex('H'); //7

        g2.addEdge(0, 3); //AD
        g2.addEdge(0, 4); //AE
        g2.addEdge(1, 4); //BE
        g2.addEdge(2, 5); //CF
        g2.addEdge(3, 6); //DG
        g2.addEdge(4, 6); //EG
        g2.addEdge(5, 7); //FH
        g2.addEdge(6, 7); //GH

        System.out.println("Praktikum Nomor 3");
        g2.topo();
    }

}
